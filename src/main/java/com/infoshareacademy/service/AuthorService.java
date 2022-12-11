package com.infoshareacademy.service;

import com.infoshareacademy.model.Auhtor;
import com.infoshareacademy.model.Book;
import com.infoshareacademy.repository.AuthorDao;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthorService {

    private final AuthorDao authorDao;

    public void createAuthor(Book book) {
        Auhtor author = Auhtor.builder()
                .name(book.getAuthor())
                .book(book)
                .build();
        authorDao.saveAuthor(author);
    }
}