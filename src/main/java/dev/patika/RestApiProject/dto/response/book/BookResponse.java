package dev.patika.RestApiProject.dto.response.book;

import dev.patika.RestApiProject.entities.Author;
import dev.patika.RestApiProject.entities.Category;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookResponse {
    private int id;
    private String name;
    private int year;
    private int stock;
    private int publisherId;
    private int authorId;
    private List<Category> categoryList;
}
