package com.example.realestateapp;

public class Property {
    Integer image;
    String address, bed, bath, car, rent;

    public Property(Integer image, String address, String bed, String bath, String car, String rent) {
        this.image = image;
        this.address = address;
        this.bed = bed;
        this.bath = bath;
        this.car = car;
        this.rent = rent;
    }

    public Integer getImage() {
        return image;
    }

    public String getAddress() {
        return address;
    }

    public String getBed() {
        return bed;
    }

    public String getBath() {
        return bath;
    }

    public String getCar() {
        return car;
    }

    public String getRent() {
        return rent;
    }

}

