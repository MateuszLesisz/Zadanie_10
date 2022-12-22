package com.infoshareacademy.repository;

import com.infoshareacademy.model.Returned;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReturnedRepository extends JpaRepository<Returned, Long> {
}