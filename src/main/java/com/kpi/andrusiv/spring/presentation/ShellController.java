package com.kpi.andrusiv.spring.presentation;


import com.kpi.andrusiv.spring.domain.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class ShellController {

    @Autowired
    //@Qualifier("BasicLoginService")
    public LoginService loginService;

    @ShellMethod("login")
    public void login(String str1, String str2){
        loginService.login(str1, str2);
    }

    @ShellMethod("create")
    public void create(String str1, String str2){
        loginService.create(str1, str2);
    }






}
