package com.infoshareacademy.repository;

import com.infoshareacademy.model.Book;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class BookDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public Book saveBook(Book book) {
        entityManager.persist(book);
        return book;
    }

    public Book findById(Long id) {
        return entityManager.find(Book.class, id);
    }

    public void delete(Long id) {
        Book book = findById(id);
        if (book != null) {
            entityManager.remove(book);
        }
    }

    public Book update(Book book) {
        entityManager.merge(book);
        return book;
    }
}