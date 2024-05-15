# REST API Project - Controller Endpoint Documentation

This README file documents the endpoints provided by controllers in the REST API project.

## 1. AuthorController

| Endpoint                    | HTTP Method | Description                                  |
|-----------------------------|-------------|----------------------------------------------|
| `/v1/authors`               | POST        | Add a new author.                           |
| `/v1/authors/{id}`          | GET         | Get details of the author with the specified ID. |
| `/v1/authors`               | GET         | Retrieve all authors with pagination.       |
| `/v1/authors`               | PUT         | Update the details of the specified author.|
| `/v1/authors/{id}`          | DELETE      | Delete the author with the specified ID.    |

## 2. BookBorrowingController

| Endpoint                           | HTTP Method | Description                                  |
|------------------------------------|-------------|----------------------------------------------|
| `/v1/book-borrowings`              | POST        | Borrow a book for a user.                   |
| `/v1/book-borrowings/{id}`         | GET         | Get details of the borrowed book with the specified ID. |
| `/v1/book-borrowings`              | GET         | Retrieve all borrowed books with pagination.|
| `/v1/book-borrowings`              | PUT         | Update the details of the borrowed book.   |
| `/v1/book-borrowings/{id}`         | DELETE      | Delete the borrowed book with the specified ID. |

## 3. BookController

| Endpoint                    | HTTP Method | Description                                  |
|-----------------------------|-------------|----------------------------------------------|
| `/v1/books`                 | POST        | Add a new book.                             |
| `/v1/books/{id}`            | GET         | Get details of the book with the specified ID. |
| `/v1/books`                 | GET         | Retrieve all books with pagination.         |
| `/v1/books`                 | PUT         | Update the details of the specified book.  |
| `/v1/books/{id}`            | DELETE      | Delete the book with the specified ID.      |

## 4. CategoryController

| Endpoint                    | HTTP Method | Description                                  |
|-----------------------------|-------------|----------------------------------------------|
| `/v1/categories`            | POST        | Add a new category.                         |
| `/v1/categories/{id}`       | GET         | Get details of the category with the specified ID. |
| `/v1/categories`            | GET         | Retrieve all categories with pagination.    |
| `/v1/categories`            | PUT         | Update the details of the specified category. |
| `/v1/categories/{id}`       | DELETE      | Delete the category with the specified ID. |

## 5. PublisherController

| Endpoint                    | HTTP Method | Description                                  |
|-----------------------------|-------------|----------------------------------------------|
| `/v1/publishers`            | POST        | Add a new publisher.                        |
| `/v1/publishers/{id}`       | GET         | Get details of the publisher with the specified ID. |
| `/v1/publishers`            | GET         | Retrieve all publishers with pagination.    |
| `/v1/publishers`            | PUT         | Update the details of the specified publisher. |
| `/v1/publishers/{id}`       | DELETE      | Delete the publisher with the specified ID. |
