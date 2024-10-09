package com.bookrecsystem.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bookrecsystem.backend.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

    // couple possible options to go next 
    // think abt different ways to search for a new book 
    //  - author 
    //  - by rating 
    //  - generate new recommendations (is this possible in context here?)
}
