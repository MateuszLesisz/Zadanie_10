package com.infoshareacademy.controller;

import com.infoshareacademy.repository.Books;
import lombok.AllArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class FindBookController {

    private Books books;

    @GetMapping("/book/{title}/search")
    public String getBook(Model model) {
        return "book";
    }


}
