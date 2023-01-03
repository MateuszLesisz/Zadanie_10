package com.infoshareacademy.service;

import com.infoshareacademy.dto.AuthorDto;
import com.infoshareacademy.dto.BookDto;
import com.infoshareacademy.model.Author;
import com.infoshareacademy.model.Book;
import com.infoshareacademy.repository.AuthorRepository;
import com.infoshareacademy.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class BookService {

    private final BookRepository bookRepository;
    private final AuthorService authorService;

    public Book createBook(BookDto bookDto, AuthorDto authorDto) {
        Book book = Book.builder()
                .title(bookDto.getTitle())
                .category(bookDto.getCategory())
                .pages(bookDto.getPages())
                .forKids(bookDto.getForKids())
                .isBorrow(false)
                .isReturned(null)
                .author(authorService.createAuthor(authorDto))
                .build();
       return bookRepository.save(book);
    }

    public List<Book> findByAuthor(String author) {
        return bookRepository.findBookByAuthorName(author);
    }

}