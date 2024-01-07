package com.practice.graphql.service;

import com.practice.graphql.entity.Book;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BookService {

    //create
    Book create(Book book);

    //get all
    List<Book> getAll();

    //get single book
    Book get(int bookId);
}
