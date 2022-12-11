package com.infoshareacademy.controller;

import com.infoshareacademy.dto.BookDto;
import com.infoshareacademy.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class BookCaseController {

    private final BookService bookService;

    @GetMapping("book/new")
    public String getBook(Model model) {
        model.addAttribute("book", new BookDto());
        return "add-book";
    }

    @PostMapping("book/new")
    public String sendBook(@ModelAttribute("book") BookDto bookDto,
                            BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "add-book";
        }
        bookService.createBook(bookDto);
        return "add-book-success";
    }

    @GetMapping()
    public String getMainPage(){
        return "main-page";
    }
}