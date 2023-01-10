package com.infoshareacademy.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BorrowDto {

    private Boolean isReturned;
    private LocalDate borrowDate;
}
