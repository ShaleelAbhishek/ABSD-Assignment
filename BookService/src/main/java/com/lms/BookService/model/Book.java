package com.lms.BookService.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Book {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    private String isbn;
    private String title;
    private String author;
    private String publisher;
    private String year_of_publication;
    private String location;
    private String price;
    private Integer num_of_copies;
    private LocalDate last_available_date;
    private boolean enabled;
    private boolean isDelete;
    @Transient
    Transaction currentUsers = new Transaction();
}
