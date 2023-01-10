package com.infoshareacademy.repository;

import com.infoshareacademy.model.Borrow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BorrowRepository extends JpaRepository<Borrow, Long> {

    List<Borrow> findBorrowByClientIdAndIsReturned(Long clientId, Boolean isReturned);

    Borrow findBorrowByBookId(Long bookId);

    @Query(value = "SELECT b FROM Borrow b WHERE b.borrowDate >= '2023-01-11' AND b.borrowDate <= '2023-01-11'")
    List<Borrow> findBorrowByBorrowDate();
}
