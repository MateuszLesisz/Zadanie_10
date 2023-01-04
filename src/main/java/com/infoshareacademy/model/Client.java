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
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @NotNull
    private String name;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;
}