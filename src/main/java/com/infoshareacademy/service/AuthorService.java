package com.infoshareacademy.service;

import com.infoshareacademy.model.Author;
import com.infoshareacademy.model.Book;
import com.infoshareacademy.repository.AuthorDao;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthorService {

    private final AuthorDao authorDao;

//    public void createAuthor(Book book) {
//        Author author = Author.builder()
//                .name()
//                .book(book)
//                .build();
//        authorDao.saveAuthor(author);
//    }
}