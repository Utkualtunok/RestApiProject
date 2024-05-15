package dev.patika.RestApiProject.dto.request.author;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthorSaveRequest {
    @NotNull(message = "Yazar Adı boş veya null olamaz!")
    private String name;
    LocalDate birthday;
    private String country;
}
