package com.infoshareacademy.controller;

import com.infoshareacademy.domain.Book;
import com.infoshareacademy.repository.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FindBookController {

    @Autowired
    private Books books;

    @GetMapping("/book/{title}/search")
    @ResponseBody
    public List<Book> findTitleFromString(@PathVariable String title) {
        List<Book> newBookList = new ArrayList<>();
        for (Book book : books.getBooks()) {
            if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                newBookList.add(book);
            }
        }
        return newBookList;
    }

}
