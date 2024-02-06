package com.books.apibooks.controllers;

import com.books.apibooks.domain.Book;
import com.books.apibooks.feign.BookClient;
import com.books.apibooks.service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BooksController {

    private final BookService bookService;

    public BooksController(BookService bookService){
        this.bookService = bookService;
    }

    @GetMapping
    public ResponseEntity <List<Book>> getBooks(){
        List<Book> Books = this.bookService.getBooks();
        return ResponseEntity.ok().body(Books);
    }
}
