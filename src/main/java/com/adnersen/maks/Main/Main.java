package com.adnersen.maks.Main;

import com.adnersen.maks.Components.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(UserService.class);

        UserService userService = (UserService) context.getBean("userService");
        userService.getUser();
     }
}
