package com.lms.BookService.service;

import com.lms.BookService.model.Book;
import com.lms.BookService.model.User;

import java.util.List;

public interface BookService {
    Book saveBook(Book book);
    Book findById(Integer id);
    Book updateBook(Book book);
    List<User> getUserList(Integer id);
    List<Book> findAll();
    Book borrowBook(Integer id);
    Book returnBook(Integer id);
    Book renewTransaction(Integer id);
    Book deleteBook(Integer id);
}
