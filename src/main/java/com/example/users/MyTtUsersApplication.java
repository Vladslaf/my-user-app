package com.example.users;

import com.example.users.controller.UserController;
import com.example.users.util.CustomProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class MyTtUsersApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyTtUsersApplication.class, args);
    }

}
