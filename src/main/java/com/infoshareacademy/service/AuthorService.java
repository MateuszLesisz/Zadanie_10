package com.infoshareacademy.service;

import com.infoshareacademy.dto.AuthorDto;
import com.infoshareacademy.model.AuthorEntity;
import com.infoshareacademy.repository.AuthorDao;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthorService {

    private final AuthorDao authorDao;

    public void createAuthor(AuthorDto authorDto) {
        AuthorEntity authorEntity = AuthorEntity.builder()
                .name(authorDto.getName())
                .build();
        authorDao.saveAuthor(authorEntity);
    }
}
