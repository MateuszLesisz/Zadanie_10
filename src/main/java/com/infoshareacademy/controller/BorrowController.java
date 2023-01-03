package com.infoshareacademy.controller;

import com.infoshareacademy.model.Borrow;
import com.infoshareacademy.service.BorrowService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class BorrowController {

    private final BorrowService borrowService;

    @PostMapping("borrow/{bookId}/{clientId}")
    ResponseEntity<Borrow> addBorrow(@PathVariable Long bookId, @PathVariable Long clientId) {
        return ResponseEntity.accepted().body(borrowService.borrowBookByClient(bookId, clientId));
    }
}