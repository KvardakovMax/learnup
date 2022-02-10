package com.simple_sales_tickets.sales_tickets_app.config;

import com.simple_sales_tickets.sales_tickets_app.services.ConcertCollector;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.simple_sales_tickets.sales_tickets_app.services")
public class MyConfig {

    @Bean
    public ConcertCollector concertCollector() {
        return new ConcertCollector();
    }
}
