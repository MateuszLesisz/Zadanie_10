package com.infoshareacademy.controller;

import com.infoshareacademy.repository.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookCaseController {

    @Autowired
    private Books books;

    @GetMapping("books")
    public String allBooksView() {
        return "book-table";
    }
}
