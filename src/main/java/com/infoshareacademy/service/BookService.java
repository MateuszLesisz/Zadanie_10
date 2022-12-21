package com.infoshareacademy.service;

import com.infoshareacademy.dto.BookDto;
import com.infoshareacademy.model.Book;
import com.infoshareacademy.repository.BookDao;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BookService {

    private final BookDao bookDao;
    private final AuthorService authorService;

//    public void createBook(BookDto bookDto) {
//        Book book = Book.builder()
//                .title(bookDto.getTitle())
//                .category(bookDto.getCategory())
//                .pages(bookDto.getPages())
//                .forKids(bookDto.getForKids())
//                .author(bookDto.getAuthor())
//                .build();
//        bookDao.saveBook(book);
//        authorService.createAuthor(book);
//    }
}