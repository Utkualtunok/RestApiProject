package dev.patika.RestApiProject.api;

import dev.patika.RestApiProject.business.abstracts.IAuthorService;
import dev.patika.RestApiProject.core.config.modelMapper.IModelMapperService;
import dev.patika.RestApiProject.core.result.Result;
import dev.patika.RestApiProject.core.result.ResultData;
import dev.patika.RestApiProject.core.utilies.ResultHelper;
import dev.patika.RestApiProject.dto.request.author.AuthorSaveRequest;
import dev.patika.RestApiProject.dto.request.author.AuthorUpdateRequest;
import dev.patika.RestApiProject.dto.response.CursorResponse;
import dev.patika.RestApiProject.dto.response.author.AuthorResponse;
import dev.patika.RestApiProject.entities.Author;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/authors")
public class AuthorController {
    private final IAuthorService authorService;
    private final IModelMapperService modelMapper;

    public AuthorController(IAuthorService authorService, IModelMapperService modelMapperService) {
        this.authorService = authorService;
        this.modelMapper = modelMapperService;
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResultData<AuthorResponse> save(@Valid @RequestBody AuthorSaveRequest authorSaveRequest ){
        Author saveAuthor = this.modelMapper.forRequest().map(authorSaveRequest,Author.class);
        authorService.save(saveAuthor);
        return ResultHelper.created(this.modelMapper.forResponse().map(saveAuthor,AuthorResponse.class));
    }
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResultData<AuthorResponse> get(@PathVariable int id){
        Author author = this.authorService.get(id);
        return ResultHelper.success(this.modelMapper.forResponse().map(author,AuthorResponse.class));
    }
    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public ResultData<CursorResponse<AuthorResponse>> cursor(
            @RequestParam(name = "page", required = false, defaultValue = "0") int page,
            @RequestParam(name = "pageSize", required = false, defaultValue = "10") int pageSize
    ){
        Page<Author> authorPage = this.authorService.cursor(page,pageSize);
        Page<AuthorResponse> authorResponsePage = authorPage
                .map(author -> this.modelMapper.forResponse().map(author,AuthorResponse.class));
        return ResultHelper.cursor(authorResponsePage);
    }
    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public ResultData<AuthorResponse> update(@Valid @RequestBody AuthorUpdateRequest authorUpdateRequest ){
        Author updateAuthor = this.modelMapper.forRequest().map(authorUpdateRequest,Author.class);
        this.authorService.update(updateAuthor);
        return ResultHelper.success(this.modelMapper.forResponse().map(updateAuthor,AuthorResponse.class));
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Result delete(@PathVariable int id){
        this.authorService.delete(id);
        return ResultHelper.ok();
    }
}
