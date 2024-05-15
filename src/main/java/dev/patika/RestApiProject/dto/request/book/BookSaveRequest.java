package dev.patika.RestApiProject.dto.request.book;

import dev.patika.RestApiProject.entities.Category;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookSaveRequest {
    @NotNull(message = "Kitap Adı boş veya null olamaz!")
    private String name;
    private int publicationYear;
    private int stock;
    private int publisherId;
    private int authorId;
    private List<Category> categoryList;
}
