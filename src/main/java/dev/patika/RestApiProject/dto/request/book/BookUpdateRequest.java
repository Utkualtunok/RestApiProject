package dev.patika.RestApiProject.dto.request.book;

import dev.patika.RestApiProject.entities.Category;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookUpdateRequest {
    @Positive(message = "ID Pozitif bir sayı olmak zorunda!")
    private int id;
    @NotNull(message = "Yazar Adı boş veya null olamaz!")
    private String name;
    private int publicationYear;
    private int stock;
    private int publisherId;
    private int authorId;
    private List<Category> categoryList;
}
