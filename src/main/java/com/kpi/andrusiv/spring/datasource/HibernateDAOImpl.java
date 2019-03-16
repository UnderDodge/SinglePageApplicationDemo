package com.kpi.andrusiv.spring.datasource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;


@Service
@Primary
public class HibernateDAOImpl implements UserDAO{

    @Autowired
    UsersRepository usersRepository;


    @Override
    public boolean checkIfUserExists(String login, String password) {
        Users users = usersRepository.findByLoginAndPassword(login, password);



        if (users!=null){
            System.out.println(users.getLogin());
            return true;
        }
        return false;
    }

}
