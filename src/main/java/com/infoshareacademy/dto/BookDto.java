package com.infoshareacademy.dto;

import com.infoshareacademy.model.Category;
import com.infoshareacademy.model.ForKids;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDto {

    private String title;
    private Category category;
    private int pages;
    private ForKids forKids;
    private Boolean isBorrow;
    private Boolean isReturned;
    private AuthorDto authorName;
}