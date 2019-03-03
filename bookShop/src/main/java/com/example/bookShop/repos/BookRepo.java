package com.example.bookShop.repos;

import com.example.bookShop.domain.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepo extends CrudRepository<Book, Integer> {
    List<Book> findByAuthor(String author);
}
