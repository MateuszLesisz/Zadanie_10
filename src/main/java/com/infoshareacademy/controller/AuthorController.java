package com.infoshareacademy.controller;

import com.infoshareacademy.dto.AuthorDto;
import com.infoshareacademy.dto.BookDto;
import com.infoshareacademy.model.Author;
import com.infoshareacademy.model.Book;
import com.infoshareacademy.service.AuthorService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@AllArgsConstructor
public class AuthorController {

    private final AuthorService authorService;

    @PostMapping("author/new")
    ResponseEntity<Author> addBook(@RequestBody AuthorDto authorDto) {
        return ResponseEntity.accepted().body(authorService.createAuthor(authorDto));
    }
}
