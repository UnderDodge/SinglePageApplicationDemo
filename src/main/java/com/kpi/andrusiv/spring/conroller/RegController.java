package com.kpi.andrusiv.spring.conroller;

import com.kpi.andrusiv.spring.datasource.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class RegController {


    @Autowired
    public UserDAO userDAO;

    @RequestMapping(value = "/registration" , method = RequestMethod.GET)
    public String doGet() {
        return "registration";
    }

    @RequestMapping(value = "/registration" , method = RequestMethod.POST)
    public String doPost(@RequestParam Map<String, String> reqParam, ModelMap model) {
        String login = reqParam.get("login");
        String password = reqParam.get("password");

        if(userDAO.checkIfUserExists(login, password)) {
            model.put("info", "User already exists");
            return "next";
        } else {
            userDAO.setUser(login,password);
            model.put("info", "New User created");
            return "next";
        }
    }
}
