package com.simple_sales_tickets.sales_tickets_app.services;

import com.simple_sales_tickets.sales_tickets_app.entity.Concert;
import org.springframework.stereotype.Component;

import java.util.*;
@Component
public class ConcertCollector {
    private Map<String, Concert> concertsList = new HashMap<>();

    public void addConcert(Concert concert) {
        concertsList.put(concert.getName(), concert);
    }

    public void removeConcert(String name) {
        concertsList.remove(name);
    }

    public void getSoloConcert(String name) {
        System.out.println(concertsList.get(name));
    }

    public void getAllConcerts() {
        System.out.println(concertsList.keySet());
    }

    public void buyTicket(String name) {
       System.out.println("Билет на " + name + " успешно приобретен.");
    }

    public void returnTicket(String name) {
        System.out.println("Билет на " + name + " успешно сдан.");
    }
}
