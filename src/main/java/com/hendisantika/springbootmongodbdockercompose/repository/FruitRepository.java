package com.hendisantika.springbootmongodbdockercompose.repository;

import com.hendisantika.springbootmongodbdockercompose.model.Fruit;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-mongodb-docker-compose
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 26/09/20
 * Time: 08.34
 */
@Component
public interface FruitRepository extends MongoRepository<Fruit, String> {
}