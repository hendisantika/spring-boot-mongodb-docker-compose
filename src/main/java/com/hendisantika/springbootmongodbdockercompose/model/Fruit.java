package com.hendisantika.springbootmongodbdockercompose.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-mongodb-docker-compose
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 26/09/20
 * Time: 08.32
 */
@Document
@Data
@Builder
public class Fruit {
    @Id
    private String id;
    private String name;
    private String color;
}
