package com.infoshareacademy.service;

import com.infoshareacademy.model.Author;
import com.infoshareacademy.repository.AuthorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthorService {

    private final AuthorRepository authorRepository;

    public void createAuthor(Author author) {
        Author authorCreator = Author.builder()
                .name(author.getName())
                .build();
        authorRepository.save(authorCreator);
    }
}