package com.infoshareacademy.controller;

import com.infoshareacademy.dto.AuthorDto;
import com.infoshareacademy.dto.BookDto;
import com.infoshareacademy.model.Author;
import com.infoshareacademy.model.Book;
import com.infoshareacademy.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
@AllArgsConstructor
public class BookController {

    private final BookService bookService;

    @PostMapping("book/new")
    ResponseEntity<Book> addBook(@RequestBody BookDto bookDto) {
        return ResponseEntity.accepted().body(bookService.createBook(new BookDto(bookDto.getTitle(), bookDto.getCategory(), bookDto.getPages(), bookDto.getForKids(),
                bookDto.isBorrow(), bookDto.getIsReturned(), bookDto.getAuthorName()), new AuthorDto(bookDto.getAuthorName().getName())));
    }

    @GetMapping("book/author/{author}")
    ResponseEntity<List<Book>> getAuthorBooks(@PathVariable String author) {
        return ResponseEntity.ok(bookService.findByAuthor(author));
    }

    @GetMapping("book/{title}")
        ResponseEntity<Book> getBookByTitle(@PathVariable String title) {
        return ResponseEntity.ok(bookService.findByTitle(title));
    }
}