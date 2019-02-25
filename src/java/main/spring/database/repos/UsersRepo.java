package spring.database.repos;

import org.springframework.data.mongodb.repository.MongoRepository;
import spring.database.entities.User;

import java.math.BigInteger;

public interface UsersRepo extends MongoRepository<User, BigInteger> {
}
