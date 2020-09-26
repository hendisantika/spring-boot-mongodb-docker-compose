package com.hendisantika.springbootmongodbdockercompose.controller;

import com.hendisantika.springbootmongodbdockercompose.dto.FruitRequest;
import com.hendisantika.springbootmongodbdockercompose.model.Fruit;
import com.hendisantika.springbootmongodbdockercompose.service.FruitService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-mongodb-docker-compose
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 26/09/20
 * Time: 08.37
 */
@RestController
@Slf4j
public class FruitController {

    private final FruitService fruitService;

    public FruitController(FruitService fruitService) {
        this.fruitService = fruitService;
    }

    @PostMapping("/fruits")
    public ResponseEntity addFruit(@RequestBody FruitRequest fruitRequest) {
        log.info("Request : {}", fruitRequest);
        fruitService.saveFruit(fruitRequest.toFruitModel());
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/fruits")
    public List<Fruit> getAllFruit() {
        return fruitService.findAll();
    }

}
