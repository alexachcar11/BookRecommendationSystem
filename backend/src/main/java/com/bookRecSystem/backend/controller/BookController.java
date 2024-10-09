package com.bookrecsystem.backend.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bookrecsystem.backend.model.Book;
import com.bookrecsystem.backend.service.BookService;


import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id) {
        return bookService.findBookById(id);
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.findAllBooks();
    }
}