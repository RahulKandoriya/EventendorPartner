package com.kandoriyatech.apps.eventendorpartner.model;

public class pricing_service_item {

    String title, details, price;

    public pricing_service_item(String title, String details, String price) {

        this.title = title;
        this.details = details;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getDetails() {
        return details;
    }

    public String getPrice() {
        return price;
    }
}
