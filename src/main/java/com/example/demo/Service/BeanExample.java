package com.example.demo.Service;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;


public class BeanExample {
    @Bean
    @ConditionalOnBean(name = {"dataSource"})
    public DataSource jdbc(DataSource dataSource){
       return dataSource;
    }
}
