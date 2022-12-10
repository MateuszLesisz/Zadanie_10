package com.infoshareacademy.service;

import com.infoshareacademy.repository.BookDao;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BookService {

    private final BookDao bookDao;

}
