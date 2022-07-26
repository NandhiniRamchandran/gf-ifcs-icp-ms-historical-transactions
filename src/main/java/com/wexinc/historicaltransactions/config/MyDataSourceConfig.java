package com.wexinc.historicaltransactions.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration

public class MyDataSourceConfig {
    @Autowired
    DataSourceProperties dataSourceProperties;

    @Value("${spring.datasource.hikari.connection-timeout}")
    public long hikariConnectionTimeout;

    @Value("${spring.datasource.hikari.maximum-pool-size}")
    public int hikariMaximumPoolSize;

    @Value("${spring.datasource.hikari.minimum-idle}")
    public int hikariMinimumIdle;



    @Primary
    @Bean
    public DataSource dataSource(){
        HikariConfig hikariConfig=new HikariConfig();
        hikariConfig.setJdbcUrl(dataSourceProperties.getUrl());
        hikariConfig.setUsername(dataSourceProperties.getUsername());
        hikariConfig.setPassword(dataSourceProperties.getPassword());
        hikariConfig.setDriverClassName(dataSourceProperties.getDriverClassName());
        hikariConfig.setMaximumPoolSize(hikariMaximumPoolSize);
        hikariConfig.setConnectionTimeout(hikariConnectionTimeout);
        hikariConfig.setMinimumIdle(hikariMinimumIdle);
        HikariDataSource hikariDataSource=new HikariDataSource(hikariConfig);
        return hikariDataSource;
    }
}
