package com.practice.graphql.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "project_books")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String desc;
    private String author;
    private double price;
    private int pages;

}
