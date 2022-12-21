package com.infoshareacademy.repository;

import com.infoshareacademy.model.Author;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class AuthorDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public Author saveAuthor(Author author) {
        entityManager.persist(author);
        return author;
    }

    public Author findById(Long id) {
        return entityManager.find(Author.class, id);
    }

    public void delete(Long id) {
        Author author = findById(id);
        if (author != null) {
            entityManager.remove(author);
        }
    }

    public Author update(Author author) {
        entityManager.merge(author);
        return author;
    }
}