package com.kpi.andrusiv.spring.conroller;


import com.kpi.andrusiv.spring.datasource.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Controller
public class LoginController {

    @Autowired
    public UserDAO userDAO;

    @RequestMapping(value = "/login" , method = RequestMethod.GET)
    public String doGet() {
        return "index";
    }

    @RequestMapping(value = "/login" , method = RequestMethod.POST)
    public String doPost(@RequestParam Map<String, String> reqParam, ModelMap model) {
        String login = reqParam.get("login");
        String password = reqParam.get("password");

        if(userDAO.checkIfUserExists(login, password)) {
            model.put("info", "Login successful");
            return "next";
        } else {
            model.put("info", "Login failed");
            return "next";
        }
    }


}
