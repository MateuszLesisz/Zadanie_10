package com.infoshareacademy.controller;

import com.infoshareacademy.domain.Book;
import com.infoshareacademy.repository.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookCaseController {

    @Autowired
    private Books books;

    @GetMapping("books")
    public List<Book> allBooksView() {
        return books.getBooks();
    }
}
