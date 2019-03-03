package com.example.bookShop.controller;

import com.example.bookShop.domain.Book;
import com.example.bookShop.repos.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@Controller
public class MainController {
    @Autowired
    private BookRepo bookRepo;
    @GetMapping("/")
    public String greeting(Model model) {
        return "greeting";
    }

    @GetMapping("/main")
    public String main(Model model) {
        Iterable<Book> books = bookRepo.findAll();
        model.addAttribute("books", books);
        return "main";
    }

    @PostMapping("add")
    public String add(@RequestParam String title, @RequestParam String author, @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date dateOfPublication, @RequestParam String publishingHouse, Model model) {
        Book book = new Book(title, author, dateOfPublication, publishingHouse);

        bookRepo.save(book);

        Iterable<Book> books = bookRepo.findAll();
        model.addAttribute("books", books);

        return "main";
    }

    @PostMapping("filter")
    public String filter(@RequestParam String filter, Model model) {
        Iterable<Book> books;

        if(filter != null && !filter.isEmpty()) {
            books = bookRepo.findByAuthor(filter);
        } else {
            books = bookRepo.findAll();
        }


        model.addAttribute("books", books);

        return "main";
    }


}