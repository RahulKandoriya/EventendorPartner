package com.kandoriyatech.apps.eventendorpartner.model;

public class leads_item {


    private String head, desc, image_url;

    public leads_item(String head, String desc, String image_url) {
        this.head = head;
        this.desc = desc;
        this.image_url = image_url;
    }

    public String getHead() {
        return head;
    }

    public String getDesc() {
        return desc;
    }

    public String getImage_url() {
        return image_url;
    }
}

