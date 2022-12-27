package com.infoshareacademy.service;

import com.infoshareacademy.dto.AuthorDto;
import com.infoshareacademy.model.Author;
import com.infoshareacademy.repository.AuthorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthorService {

    private final AuthorRepository authorRepository;

    public Author createAuthor(AuthorDto authorDto) {
        Author authorCreator = Author.builder()
                .name(authorDto.getName())
                .build();
       return authorRepository.save(authorCreator);
    }
}