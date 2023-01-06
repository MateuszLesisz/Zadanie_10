package com.infoshareacademy.repository;

import com.infoshareacademy.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findBookByAuthorName(String author);

    Book findBookByTitle(String title);

    Book findBookById(Long id);
}