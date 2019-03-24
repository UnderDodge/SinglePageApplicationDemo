package com.kpi.andrusiv.spring.conroller;


import com.kpi.andrusiv.spring.datasource.GamesRepository;
import com.kpi.andrusiv.spring.datasource.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class HomeController {

    @Autowired
    UsersRepository usersRepository;

    @Autowired
    GamesRepository gamesRepository;

    @RequestMapping(value = "/home" , method = RequestMethod.GET)
    public String doGet(ModelMap model) {
        model.put("game1", gamesRepository.findAll());

        return "home";
    }

    @RequestMapping(value = "/home" , method = RequestMethod.POST)
    public String doPost(@RequestParam Map<String, String> reqParam, ModelMap model) {

            model.put("game1", gamesRepository.findAll());

            return "home";
    }


}
