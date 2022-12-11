package com.infoshareacademy.service;

import com.infoshareacademy.dto.BookDto;
import com.infoshareacademy.model.BookEntity;
import com.infoshareacademy.repository.BookDao;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BookService {

    private final BookDao bookDao;

    public void createBook(BookDto bookDto) {
        BookEntity bookEntity = BookEntity.builder()
                .title(bookDto.getTitle())
                .category(bookDto.getCategory())
                .pages(bookDto.getPages())
                .forKids(bookDto.getForKids())
                .build();
        bookDao.saveBook(bookEntity);
    }
}