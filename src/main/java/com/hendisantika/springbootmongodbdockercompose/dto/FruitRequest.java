package com.hendisantika.springbootmongodbdockercompose.dto;

import com.hendisantika.springbootmongodbdockercompose.model.Fruit;
import lombok.Data;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-mongodb-docker-compose
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 26/09/20
 * Time: 08.35
 */
@Data
public class FruitRequest {
    private String name;
    private String color;

    public Fruit toFruitModel() {
        return Fruit.builder().color(this.color).name(this.name).build();
    }
}
