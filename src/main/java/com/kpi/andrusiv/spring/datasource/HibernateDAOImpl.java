package com.kpi.andrusiv.spring.datasource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;


@Service
@Primary
public class HibernateDAOImpl implements UserDAO{

    @Autowired
    UsersRepository usersRepository;

    String salt = "$2r!`6#xW6]N{eb$";
    BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder(5);

    @Override
    public boolean checkIfUserExists(String login, String password) {
        Users users = usersRepository.findByLogin(login);
        if (passwordEncoder.matches((password+salt), users.getPassword())==true){
            System.out.println(users.getLogin());
            return true;
        }
        return false;
    }

    @Override
    public void setUser(String login, String password) {
        Date created = new Date();
        String encodedPassword = passwordEncoder.encode(password+salt);

        usersRepository.save(new Users(login, encodedPassword, created));
    }

}
