package com.infoshareacademy.service;

import com.infoshareacademy.model.Book;
import com.infoshareacademy.model.Borrow;
import com.infoshareacademy.model.Client;
import com.infoshareacademy.repository.BookRepository;
import com.infoshareacademy.repository.BorrowRepository;
import com.infoshareacademy.repository.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BorrowService {

    private final BorrowRepository borrowRepository;
    private final BookRepository bookRepository;
    private final ClientRepository clientRepository;

    public Borrow createBorrow(Book book, Client client) {

        Borrow borrowCreator = Borrow.builder()
                .book(book)
                .client(client)
                .build();
        return borrowRepository.save(borrowCreator);
    }

    public Borrow borrowBookByClient(Long bookId, Long clientId) {
        Book book = bookRepository.findBookById(bookId);
        book.setIsBorrow(true);
        book.setIsReturned(false);
        bookRepository.save(book);
        Client client = clientRepository.findClientById(clientId);
        return createBorrow(book, client);
    }
}