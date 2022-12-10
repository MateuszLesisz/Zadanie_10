package com.infoshareacademy.controller;

import com.infoshareacademy.repository.BookDao;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class BookCaseController {

    private final BookDao bookDao;

    @GetMapping("books")
    public String allBooksView() {
        return "book-table";
    }
}
