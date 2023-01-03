package com.infoshareacademy.repository;

import com.infoshareacademy.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {

    Client findClientById(Long id);
}