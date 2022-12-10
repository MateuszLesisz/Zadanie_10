package com.infoshareacademy.controller;

import com.infoshareacademy.domain.Book;
import com.infoshareacademy.repository.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Random;

@RestController
public class RandomBookController {


    @GetMapping("book-for-today")
    public Book printRandomBook() {
  Books book = new Books();
  Random random = new Random();
  int randomBook = random.nextInt(book.getBooks().size());
  return book.getBooks().get(randomBook);
    }
}
