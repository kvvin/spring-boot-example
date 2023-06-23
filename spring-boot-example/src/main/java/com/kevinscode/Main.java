package com.kevinscode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }
    @GetMapping("/")
    public GreetResponse greet(){
        return new GreetResponse("Hello",List.of("Java,JavaScript"),new Person("Kevin"));
    }
    record Person(String name){

    }
    record GreetResponse(String greet, List<String> favPgmLangs, Person person){

    }

}
