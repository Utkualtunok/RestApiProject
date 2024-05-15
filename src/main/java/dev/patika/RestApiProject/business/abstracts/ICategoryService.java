package dev.patika.RestApiProject.business.abstracts;

import dev.patika.RestApiProject.dto.response.category.CategoryResultResponse;
import dev.patika.RestApiProject.entities.Category;
import org.springframework.data.domain.Page;

public interface ICategoryService {
    Category save(Category category);

    Category get(int id);

    Page<Category> cursor(int page, int pageSize);

    Category update(Category category);

    CategoryResultResponse delete(int id);
}
