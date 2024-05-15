package dev.patika.RestApiProject.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="book_borrowings")
public class BookBorrowing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_borrowing_id", columnDefinition = "serial")
    private int id;

    @Column(name = "book_borrower_name" , nullable = false)
    private String borrowerName;

    @Email
    @Column(name = "book_borrower_email")
    private String borrowerEmail;

    @Column(name = "book_borrowing_date")
    private LocalDate borrowingDate;

    @Column(name = "book_return_date")
    private LocalDate returnDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "borrowing_book_id", referencedColumnName = "book_id")
    private Book book;
}
