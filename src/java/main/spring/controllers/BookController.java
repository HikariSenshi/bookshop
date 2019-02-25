package spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import spring.database.entities.Book;
import spring.database.repos.BookRepo;

import java.util.Map;

public class BookController {


    @Autowired
    private BookRepo books;

    @GetMapping
    public String getUser(Map<String, Object> params) {
        Iterable<Book> allBooks = books.findAll();
        params.put("books", allBooks);
        return "books";
    }

    @PostMapping
    public String addUser(@RequestParam Book book, Map<String, Object> params) {
        books.save(book);
        params.put("books", books.findAll());
        return "books";
    }

}
