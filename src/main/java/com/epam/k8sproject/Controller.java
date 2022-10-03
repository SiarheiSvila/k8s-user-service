package com.epam.k8sproject;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/")
public class Controller {

    private final JdbcTemplate jdbcTemplate;
    private final UserMapper userMapper;

    public Controller(JdbcTemplate jdbcTemplate, UserMapper userMapper) {
        this.jdbcTemplate = jdbcTemplate;
        this.userMapper = userMapper;
    }

    @GetMapping
    public List<User> getMapping() {
        return jdbcTemplate.query("select * from users", userMapper);
    }
}
