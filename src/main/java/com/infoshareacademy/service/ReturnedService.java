package com.infoshareacademy.service;

import com.infoshareacademy.model.Borrow;
import com.infoshareacademy.model.Returned;
import com.infoshareacademy.repository.ReturnedRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ReturnedService {

    private ReturnedRepository returnedRepository;

    public void createReturned(Borrow borrow) {

        Returned returned = Returned.builder()
                .borrow(borrow)
                .build();
        returnedRepository.save(returned);
    }
}