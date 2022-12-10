package com.infoshareacademy.mappers;

import com.infoshareacademy.dto.BookDto;
import com.infoshareacademy.model.BookEntity;

public class BookMapper {

    public BookDto toDto(BookEntity bookEntity) {
        BookDto bookDto = new BookDto();
        bookDto.setId(bookEntity.getId());
        bookDto.setTitle(bookEntity.getTitle());
        bookDto.setCategory(bookEntity.getCategory());
        bookDto.setPages(bookEntity.getPages());
        bookDto.setForKids(bookEntity.isForKids());
        return bookDto;
    }

    public BookEntity toEntity(BookDto bookDto) {
        BookEntity bookEntity = new BookEntity();
        bookEntity.setId(bookDto.getId());
        bookEntity.setTitle(bookEntity.getTitle());
        bookEntity.setCategory(bookEntity.getCategory());
        bookEntity.setPages(bookEntity.getPages());
        bookEntity.setForKids(bookDto.isForKids());
        return bookEntity;
    }
}
