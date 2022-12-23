package com.infoshareacademy.service;

import com.infoshareacademy.dto.BookDto;
import com.infoshareacademy.model.Author;
import com.infoshareacademy.model.Book;
import com.infoshareacademy.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    public void createBook(BookDto bookDto, Author author) {
        Book book = Book.builder()
                .title(bookDto.getTitle())
                .category(bookDto.getCategory())
                .pages(bookDto.getPages())
                .forKids(bookDto.getForKids())
                .isBorrow(false)
                .isReturned(true)
                .author(author)
                .build();
        bookRepository.save(book);
    }
}