package dev.patika.RestApiProject.dao;

import dev.patika.RestApiProject.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<Book,Integer> {
    boolean existsByCategoryList_Id(int categoryId);
}
