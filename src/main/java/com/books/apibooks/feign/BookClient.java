package com.books.apibooks.feign;


import com.books.apibooks.domain.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "api-books", url = "https://new-api-books.s3.us-east-2.amazonaws.com/api-books-s3.json")
public interface BookClient {

   @GetMapping()
   List<Book> getBooks();
}
