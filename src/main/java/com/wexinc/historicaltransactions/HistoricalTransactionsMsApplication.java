package com.wexinc.historicaltransactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ServletComponentScan
@SpringBootApplication
@EnableCaching
@EntityScan(basePackages = {"com.wexinc.historicaltransactions.model"})
@EnableJpaRepositories(basePackages = {"com.wexinc.historicaltransactions.repository"})
public class HistoricalTransactionsMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HistoricalTransactionsMsApplication.class, args);
	}

}
