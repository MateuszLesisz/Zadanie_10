package com.infoshareacademy.repository;

import com.infoshareacademy.model.Auhtor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class AuthorDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public Auhtor saveAuthor(Auhtor auhtor) {
        entityManager.persist(auhtor);
        return auhtor;
    }

    public Auhtor findById(Long id) {
        return entityManager.find(Auhtor.class, id);
    }

    public void delete(Long id) {
        Auhtor auhtor = findById(id);
        if(auhtor != null) {
            entityManager.remove(auhtor);
        }
    }

    public Auhtor update(Auhtor auhtor) {
        entityManager.merge(auhtor);
        return auhtor;
    }
}