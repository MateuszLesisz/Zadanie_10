package com.infoshareacademy.controller;

import com.infoshareacademy.dto.BorrowDto;
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

    @PostMapping("borrow/{clientId}/{bookId}")
    ResponseEntity<Borrow> addNewBorrow(@PathVariable Long clientId, @PathVariable Long bookId) {
        return ResponseEntity.accepted().body(borrowService.createBorrow(clientId, bookId));
    }
}
