package com.kpi.andrusiv.spring.datasource;

import com.kpi.andrusiv.spring.datasource.entity.Games;
import com.kpi.andrusiv.spring.datasource.entity.Users;
import org.springframework.data.repository.CrudRepository;

public interface GamesRepository extends CrudRepository<Games, Long> {
    Games findByUsers(Users users);
}
