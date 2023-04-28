package com.lms.BookService.repository;

import com.lms.BookService.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {

    @Query(value = "SELECT * FROM Book u WHERE u.isDelete = false",nativeQuery = true)
    List<Book> findAll();
}
