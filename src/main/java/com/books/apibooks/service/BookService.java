package com.books.apibooks.service;


import com.books.apibooks.domain.Book;
import com.books.apibooks.feign.BookClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookClient bookClient;

    public BookService(BookClient bookClient){
        this.bookClient = bookClient;
    }

    public List<Book> getBooks(){
        return this.bookClient.getBooks();
    }

}
