package com.infoshareacademy.repository;

import com.infoshareacademy.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}