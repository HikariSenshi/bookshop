package spring.database.repos;

import org.springframework.data.mongodb.repository.MongoRepository;
import spring.database.entities.Book;

public interface BookRepo extends MongoRepository<Book, Long> {
}
