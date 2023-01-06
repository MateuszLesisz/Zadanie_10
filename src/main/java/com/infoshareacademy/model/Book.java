package com.infoshareacademy.model;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @NotNull
    private String title;

    @Column
    @NotNull
    @Enumerated(EnumType.STRING)
    private Category category;

    @Column
    @NotNull
    private int pages;

    @Column
    @NotNull
    @Enumerated(EnumType.STRING)
    private ForKids forKids;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

}