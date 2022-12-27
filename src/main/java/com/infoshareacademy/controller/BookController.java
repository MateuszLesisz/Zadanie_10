package com.infoshareacademy.controller;

import com.infoshareacademy.dto.AuthorDto;
import com.infoshareacademy.dto.BookDto;
import com.infoshareacademy.model.Author;
import com.infoshareacademy.model.Book;
import com.infoshareacademy.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@AllArgsConstructor
public class BookController {

    private final BookService bookService;

    @PostMapping("book/new")
    ResponseEntity<Book> addBook(@RequestBody BookDto bookDto) {
        return ResponseEntity.accepted().body(bookService.createBook(new BookDto(bookDto.getTitle(), bookDto.getCategory(), bookDto.getPages(), bookDto.getForKids(),
                bookDto.isBorrow(), bookDto.getIsReturned(), bookDto.getAuthorName()), new AuthorDto(bookDto.getAuthorName().getName())));
    }
}