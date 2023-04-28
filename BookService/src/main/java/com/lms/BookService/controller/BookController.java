package com.lms.BookService.controller;

import com.lms.BookService.model.Book;
import com.lms.BookService.model.User;
import com.lms.BookService.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;

    @RequestMapping(value = "",method = RequestMethod.POST)
    public Book saveBook(@RequestBody Book book) {

        return bookService.saveBook(book);
    }

    @RequestMapping(value = "",method = RequestMethod.GET)
    public List<Book> findAll(){
        return bookService.findAll();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Book findById(@PathVariable Integer id){
        return bookService.findById(id);
    }

    @RequestMapping(value = "",method = RequestMethod.PUT)
    public Book updateBook(@RequestParam("book") Book book) {
        return bookService.updateBook(book);
    }

    @RequestMapping(value = "/currentusers/{id}",method = RequestMethod.GET)
    public List<User> getUserList(@PathVariable Integer id){
        return bookService.getUserList(id);
    }

    @RequestMapping(value = "/borrow/{id}",method = RequestMethod.GET)
    public Book borrowBook(@PathVariable Integer id){
        return bookService.borrowBook(id);
    }

    @RequestMapping(value = "/return/{id}",method = RequestMethod.GET)
    public Book returnBook(@PathVariable Integer id){
        return bookService.returnBook(id);
    }

    @RequestMapping(value = "/renew/{id}",method = RequestMethod.GET)
    public Book renewTransaction(@PathVariable Integer id){
        return bookService.renewTransaction(id);
    }

    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    public Book deleteBook(@PathVariable Integer id){
        return bookService.deleteBook(id);
    }
}
