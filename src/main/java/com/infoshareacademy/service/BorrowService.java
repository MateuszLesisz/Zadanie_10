package com.infoshareacademy.service;

import com.infoshareacademy.model.Book;
import com.infoshareacademy.model.Borrow;
import com.infoshareacademy.model.Client;
import com.infoshareacademy.repository.BorrowRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BorrowService {

    private BorrowRepository borrowRepository;

    public void createBorrow(Book book, Client client) {

        Borrow borrowCreator = Borrow.builder()
                .book(book)
                .client(client)
                .build();
        borrowRepository.save(borrowCreator);
    }
}