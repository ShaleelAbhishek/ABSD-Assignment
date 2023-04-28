package com.lms.transactionservice.service;

import com.lms.transactionservice.model.Book;
import com.lms.transactionservice.model.Transaction;
import com.lms.transactionservice.model.User;

import java.util.List;
import java.util.Optional;

public interface TransactionService {
    Transaction saveTransaction(Transaction transaction);
    Transaction findById(Integer id);
    List<Transaction> findByUniversityId(Integer id);
    List<Transaction> findByBookId(Integer id);
    List<Book> getCurrentBookListByUserId(Integer id);
    List<User> getUserListByBookId(Integer id);
    List<Transaction> findAll();
    Transaction updateTransaction(Transaction transaction);
    Transaction returnBook(Integer id);
    Transaction renewTransaction(Integer id);
    List<Transaction> getFineNotReturned();
}
