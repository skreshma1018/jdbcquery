package com.springdatajdbc.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class TestData implements CommandLineRunner {
    @Autowired
    private JdbcTemplate jt;
    @Autowired
    private DataSource ds;
    @Override
    public void run(String... args) throws Exception {
        System.out.println(jt.getClass().getName());
        System.out.println("Welcome");
        System.out.println(ds.getClass().getName());
    }
}
