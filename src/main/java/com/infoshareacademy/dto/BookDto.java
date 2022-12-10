package com.infoshareacademy.dto;

import com.infoshareacademy.model.Category;
import lombok.Data;
@Data
public class BookDto {

    private Long id;
    private String title;
    private Category category;
    private int pages;
    private boolean forKids;
}