package com.kandoriyatech.apps.eventendorpartner.model;

public class Reviews {

    private String name;
    private String review;
    private String time;

    public Reviews(String name, String review, String time){

        this.name = name;
        this.review = review;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public String getReview() {
        return review;
    }

    public String getTime() {
        return time;
    }
}
