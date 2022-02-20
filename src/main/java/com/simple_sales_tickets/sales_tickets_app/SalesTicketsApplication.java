package com.simple_sales_tickets.sales_tickets_app;


import com.simple_sales_tickets.sales_tickets_app.entity.Concert;
import com.simple_sales_tickets.sales_tickets_app.services.ConcertCollectorService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SalesTicketsApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SalesTicketsApplication.class, args);
        ConcertCollectorService collector = context.getBean(ConcertCollectorService.class);

        collector.addConcert(new Concert("Fun fen", "This is a really long-long description","16+", 100));
        collector.addConcert(new Concert("Sad sad things", "This is not so long-long description as you think","16+", 100));
        //Sales ticket
        collector.buyTicket("Fun fen");
        collector.returnTicket("Fun fen");
        //Printing
        collector.printSoloConcert("Fun fen");
        collector.changeInfo(collector.getConcert("Fun fen"),"name", "Funny girl");
        collector.printAllConcerts();
        //Removing
        collector.removeConcert("Sad sad things");
        collector.printAllConcerts();
        context.close();
    }

}
