package com.infoshareacademy.dto;

import com.infoshareacademy.model.Category;
import com.infoshareacademy.model.ForKids;
import lombok.Data;

@Data
public class BookDto {

    private Long id;
    private String title;
    private Category category;
    private int pages;
    private ForKids forKids;
    private boolean isBorrow;
    private boolean isReturned;
}