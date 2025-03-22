package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@SpringBootApplication
@RestController
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/greet")
    public GreetRecord greet(){
        GreetRecord response = new GreetRecord(
            "Hello",
            List.of("Python", "Java", "C++"),
            new Person("Angela", 20, 160)
            );
        return response;
    }

    record Person(
        String name,
        int age,
        double height
        ){}

    record GreetRecord(
        String greet, 
        List<String> favProgrammingLanguages,
        Person person
        ){}
}
