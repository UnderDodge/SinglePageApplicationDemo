package com.kpi.andrusiv.spring.domain;

import com.kpi.andrusiv.spring.datasource.UserDAO;
import com.kpi.andrusiv.spring.domain.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class BasicLoginService implements LoginService {

    @Autowired
    public UserDAO userDAO;


    @Override
    public void login(String login, String password) {
        if(userDAO.checkIfUserExists(login, password)) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login failed");
        }

    }

    @Override
    public void create(String login, String password) {
        userDAO.setUser(login,password);
    }
}
