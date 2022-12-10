package com.infoshareacademy.repository;

import com.infoshareacademy.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface Books extends JpaRepository<Book, UUID> {
}
