package com.infoshareacademy.repository;

import com.infoshareacademy.model.Borrow;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BorrowRepository extends JpaRepository<Borrow, Long> {

    List<Borrow> findBorrowByClientIdAndIsReturned(Long clientId, Boolean isReturned);
}
