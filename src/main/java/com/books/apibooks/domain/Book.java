package com.books.apibooks.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Book {
    public String title;
    public String author;
    public String area;
    public String publisher;
    @JsonProperty("year_of_publication")
    public String yearOfPublish;
    public String isbn;
}
