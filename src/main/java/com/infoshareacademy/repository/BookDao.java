package com.infoshareacademy.repository;

import com.infoshareacademy.model.BookEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class BookDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public BookEntity saveBook(BookEntity bookEntity) {
        entityManager.persist(bookEntity);
        return bookEntity;
    }

    public BookEntity findById(Long id) {
        return entityManager.find(BookEntity.class, id);
    }

    public void delete(Long id) {
        BookEntity bookEntity = findById(id);
        if(bookEntity != null) {
            entityManager.remove(bookEntity);
        }
    }

    public BookEntity update(BookEntity bookEntity) {
        entityManager.merge(bookEntity);
            return bookEntity;
    }
}
