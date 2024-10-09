package com.bookrecsystem.backend.service;

import java.util.List;
import com.bookrecsystem.backend.model.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookrecsystem.backend.repository.BookRepository;

@Service
public class BookService {
    
    @Autowired
    private BookRepository bookRepository;

    public Book addBook(Book book) {
        return bookRepository.save(book); 
    }

    public Book findBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }
    
}
