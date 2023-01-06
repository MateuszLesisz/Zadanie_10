package com.infoshareacademy.controller;

import com.infoshareacademy.dto.BorrowDto;
import com.infoshareacademy.model.Borrow;
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

    @PostMapping("borrow/{clientId}/{bookId}")
    ResponseEntity<Borrow> addNewBorrow(@PathVariable Long clientId, @PathVariable Long bookId) {
        return ResponseEntity.accepted().body(borrowService.createBorrow(clientId, bookId));
    }

    @GetMapping("borrow/{clientId}/{isReturned}")
    ResponseEntity<List<Borrow>> getBorrowBooks(@PathVariable Long clientId, @PathVariable Boolean isReturned) {
        return ResponseEntity.ok(borrowService.findClientBorrowBooks(clientId, isReturned));
    }

    @GetMapping("borrow/{bookId}")
    ResponseEntity<Borrow> getBorrowBooks(@PathVariable Long bookId) {
        return ResponseEntity.ok(borrowService.returnBook(bookId));
    }
}
