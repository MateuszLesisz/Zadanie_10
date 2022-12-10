package com.infoshareacademy.repository;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class BookDao {

    @PersistenceContext
    private EntityManager entityManager;

    public BookDao saveBook(BookDao bookDao) {
        entityManager.persist(bookDao);
        return bookDao;
    }

    public BookDao findById(Long id) {
        return entityManager.find(BookDao.class, id);
    }

    public void delete(Long id) {
        BookDao bookDao = findById(id);
        if(bookDao != null) {
            entityManager.remove(bookDao);
        }
    }

    public BookDao update(BookDao bookDao) {
        entityManager.merge(bookDao);
            return bookDao;
    }
}
