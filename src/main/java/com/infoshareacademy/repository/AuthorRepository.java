package com.infoshareacademy.repository;

import com.infoshareacademy.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}