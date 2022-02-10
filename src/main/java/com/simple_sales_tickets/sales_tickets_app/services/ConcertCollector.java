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

    public void printSoloConcert(String name) {
        System.out.println(concertsList.get(name));
    }

    public void printAllConcerts() {
        System.out.println(concertsList.keySet());
    }

    public Concert getConcert(String name) {
        return concertsList.get(name);
    }

    public void buyTicket(String name) {
       System.out.println("Билет на " + name + " успешно приобретен.");
    }

    public void returnTicket(String name) {
        System.out.println("Билет на " + name + " успешно сдан.");
    }

    public void changeInfo(Concert concert, String changeField, String newInfo) {
        switch (changeField) {
            case "name":
                concertsList.remove(concert.getName());
                concert.setName(newInfo);
                concertsList.put(concert.getName(), concert);
                break;
            case "description":
                concert.setDescription(newInfo);
                break;
            case "ageCategory":
                concert.setAgeCategory(newInfo);
                break;
            case "freeSpaceCnt":
                concert.setFreeSpaceCnt(Integer.parseInt(newInfo));
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}
