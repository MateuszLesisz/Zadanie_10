package com.infoshareacademy.controller;

import com.infoshareacademy.model.Book;
import com.infoshareacademy.model.Borrow;
import com.infoshareacademy.service.BookService;
import com.infoshareacademy.service.BorrowService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class BorrowController {

    private final BorrowService borrowService;
    private final BookService bookService;

    @PostMapping("borrow/{bookId}/{clientId}")
    ResponseEntity<Borrow> addBorrow(@PathVariable Long bookId, @PathVariable Long clientId) {
        return ResponseEntity.accepted().body(borrowService.borrowBookByClient(bookId, clientId));
    }
}