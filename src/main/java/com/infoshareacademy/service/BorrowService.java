package com.infoshareacademy.service;

import com.infoshareacademy.model.Book;
import com.infoshareacademy.model.Borrow;
import com.infoshareacademy.model.Client;
import com.infoshareacademy.repository.BookRepository;
import com.infoshareacademy.repository.BorrowRepository;
import com.infoshareacademy.repository.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@AllArgsConstructor
public class BorrowService {

    private final BorrowRepository borrowRepository;
    private final ClientRepository clientRepository;
    private final BookRepository bookRepository;

    public Borrow createBorrow(Long clientId, Long bookId) {
        Borrow borrow = Borrow.builder()
                .client(clientRepository.findClientById(clientId))
                .book(bookRepository.findBookById(bookId))
                .isReturned(false)
                .borrowDate(LocalDate.now())
                .build();
        return borrowRepository.save(borrow);
    }

    public List<Borrow> findClientBorrowBooks(Long clientId, Boolean isReturned) {
        return borrowRepository.findBorrowByClientIdAndIsReturned(clientId, isReturned);
    }

    public Borrow returnBook(Long bookId) {
       Borrow borrow = borrowRepository.findBorrowByBookId(bookId);
       borrow.setIsReturned(true);
       return borrowRepository.save(borrow);
    }
}
