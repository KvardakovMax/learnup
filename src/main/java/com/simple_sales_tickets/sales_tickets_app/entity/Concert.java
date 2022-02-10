package com.simple_sales_tickets.sales_tickets_app.entity;

import org.springframework.stereotype.Component;

@Component
public class Concert {
    private String name;
    private String description;
    private String ageCategory;
    private int freeSpaceCnt;

    public Concert(String name, String description, String ageCategory, int freeSpaceCnt) {
        this.name = name;
        this.description = description;
        this.ageCategory = ageCategory;
        this.freeSpaceCnt = freeSpaceCnt;
    }

    public Concert() {
    }

    public void changeInfo(String changeField, String newInfo) {
        switch (changeField) {
            case "name":
                setName(newInfo);
                break;
            case "description":
                setDescription(newInfo);
                break;
            case "ageCategory":
                setAgeCategory(newInfo);
                break;
            case "freeSpaceCnt":
                setFreeSpaceCnt(Integer.parseInt(newInfo));
                break;
            default:
                System.out.println("Error");
                break;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAgeCategory() {
        return ageCategory;
    }

    public void setAgeCategory(String ageCategory) {
        this.ageCategory = ageCategory;
    }

    public int getFreeSpaceCnt() {
        return freeSpaceCnt;
    }

    public void setFreeSpaceCnt(int freeSpaceCnt) {
        this.freeSpaceCnt = freeSpaceCnt;
    }

    @Override
    public String toString() {
        return "Concert{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", ageCategory='" + ageCategory + '\'' +
                ", freeSpaceCnt=" + freeSpaceCnt +
                '}';
    }
}
