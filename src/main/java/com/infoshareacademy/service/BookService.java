package com.infoshareacademy.service;

import com.infoshareacademy.dto.AuthorDto;
import com.infoshareacademy.dto.BookDto;
import com.infoshareacademy.dto.ClientDto;
import com.infoshareacademy.model.Author;
import com.infoshareacademy.model.Book;
import com.infoshareacademy.model.Client;
import com.infoshareacademy.repository.AuthorRepository;
import com.infoshareacademy.repository.BookRepository;
import com.infoshareacademy.repository.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class BookService {

    private final BookRepository bookRepository;
    private final AuthorService authorService;

    private final ClientRepository clientRepository;

    public Book createBook(BookDto bookDto, AuthorDto authorDto) {
        Book book = Book.builder()
                .title(bookDto.getTitle())
                .category(bookDto.getCategory())
                .pages(bookDto.getPages())
                .forKids(bookDto.getForKids())
                .isBorrow(false)
                .isReturned(true)
                .author(authorService.createAuthor(authorDto))
                .client(null)
                .build();
       return bookRepository.save(book);
    }

    public List<Book> findByAuthor(String author) {
        return bookRepository.findBookByAuthorName(author);
    }

    public Book findByTitle(String title) {
        return bookRepository.findBookByTitle(title);
    }

    public Book borrowBook(Long bookId, Long clientId) {
        Book book = bookRepository.findBookById(bookId);
        book.setIsBorrow(true);
        book.setIsReturned(false);
        book.setClient(clientRepository.findClientById(clientId));
        return bookRepository.save(book);
    }

    public List<Book> findBorrowBooks(Long clientId) {
        return bookRepository.findBookByClientId(clientId);
    }

}