package com.adnersen.maks.Components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@ComponentScan(basePackageClasses = UserDAO.class)
public class UserService {

    private UserDAO userDAO;

    public UserDAO getUser(){
        return userDAO;
    }
}
