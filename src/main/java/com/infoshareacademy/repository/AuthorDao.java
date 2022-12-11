package com.infoshareacademy.repository;

import com.infoshareacademy.model.AuthorEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class AuthorDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public AuthorEntity saveAuthor(AuthorEntity authorEntity) {
        entityManager.persist(authorEntity);
        return authorEntity;
    }

    public AuthorEntity findById(Long id) {
        return entityManager.find(AuthorEntity.class, id);
    }

    public void delete(Long id) {
        AuthorEntity authorEntity = findById(id);
        if(authorEntity != null) {
            entityManager.remove(authorEntity);
        }
    }

    public AuthorEntity update(AuthorEntity authorEntity) {
        entityManager.merge(authorEntity);
        return authorEntity;
    }
}