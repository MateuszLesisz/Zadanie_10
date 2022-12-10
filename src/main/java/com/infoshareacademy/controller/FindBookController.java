package com.infoshareacademy.controller;

import com.infoshareacademy.repository.BookDao;
import lombok.AllArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class FindBookController {

    private final BookDao bookDao;

    @GetMapping("/book/{title}/search")
    public String getBookDao(Model model) {
        return "book";
    }


}
