package com.wexinc.historicaltransactions.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Objects;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        basePackages = "com.wexinc.historicaltransactions.repository.ifcs",
        entityManagerFactoryRef = "IFCSEntityManagerFactory",
        transactionManagerRef = "IFCSTransactionManager")
public class IFCSDataSourceConfiguration {

    @Primary
    @Bean
    @ConfigurationProperties(prefix = "spring.ifcs.datasource")
    public DataSource IFCSDataSource() {

        return DataSourceBuilder.create().build();
    }

    @Primary
    @Bean
    public PlatformTransactionManager IFCSTransactionManager(@Qualifier("IFCSEntityManagerFactory") LocalContainerEntityManagerFactoryBean IFCSEntityManager) {

        return new JpaTransactionManager(Objects.requireNonNull(IFCSEntityManager.getObject()));
    }

    @Primary
    @Bean
    LocalContainerEntityManagerFactoryBean IFCSEntityManagerFactory(@Qualifier("IFCSDataSource") DataSource IFCSDataSource, EntityManagerFactoryBuilder builder) {

        return builder.dataSource(IFCSDataSource).packages("com.wexinc.historicaltransactions.model.ifcs").build();
    }
}


