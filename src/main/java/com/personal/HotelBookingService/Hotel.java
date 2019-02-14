package com.personal.HotelBookingService;

import java.util.Map;

public class Hotel {
    String name;
    int rating;
    Map<RateType,Integer> rateCard;

    public Hotel(String name, int rating, Map<RateType, Integer> rateCard) {
        this.name = name;
        this.rating = rating;
        this.rateCard = rateCard;
    }

    public int getPrice(RateType key) {
        System.out.println(rateCard.get(key));
        int rate=rateCard.get(key);
        return rate;
    }
}
