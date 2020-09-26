package com.hendisantika.springbootmongodbdockercompose.service;

import com.hendisantika.springbootmongodbdockercompose.model.Fruit;
import com.hendisantika.springbootmongodbdockercompose.repository.FruitRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-mongodb-docker-compose
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 26/09/20
 * Time: 08.36
 */
@Service
public class FruitService {

    private final FruitRepository fruitRepository;

    public FruitService(FruitRepository fruitRepository) {
        this.fruitRepository = fruitRepository;
    }

    public Fruit saveFruit(Fruit fruitModel) {
        return fruitRepository.save(fruitModel);
    }

    public List<Fruit> findAll() {
        return fruitRepository.findAll();
    }
}
