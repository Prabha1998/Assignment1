package com.personal.HotelBookingService;

import java.util.ArrayList;
import java.util.HashMap;

public class HotelList {
    public static ArrayList<Hotel> getHotels(){
        ArrayList<Hotel> hotels = new ArrayList<Hotel>();
        HashMap<RateType, Integer> rateCard1 = new HashMap<RateType, Integer>();
        rateCard1.put(new RateType("Regular","Weekday"),110);
        rateCard1.put(new RateType("Regular","Weekend"),90);
        rateCard1.put(new RateType("Reward","Weekday"),80);
        rateCard1.put(new RateType("Reward","Weekend"),80);
        Hotel Lakewood=new Hotel("Lakewood",3,rateCard1);

        HashMap<RateType, Integer> rateCard2 = new HashMap<RateType, Integer>();
        rateCard2.put(new RateType("Regular","Weekday"),160);
        rateCard2.put(new RateType("Regular","Weekend"),60);
        rateCard2.put(new RateType("Reward","Weekday"),110);
        rateCard2.put(new RateType("Reward","Weekend"),50);
        Hotel Bridgewood=new Hotel("Bridgewood",4,rateCard2);

        HashMap<RateType, Integer> rateCard3 = new HashMap<RateType, Integer>();
        rateCard3.put(new RateType("Regular","Weekday"),220);
        rateCard3.put(new RateType("Regular","Weekend"),150);
        rateCard3.put(new RateType("Reward","Weekday"),100);
        rateCard3.put(new RateType("Reward","Weekend"),40);
        Hotel Ridgewood=new Hotel("Ridgewood",5,rateCard3);

        hotels.add(Lakewood);
        hotels.add(Bridgewood);
        hotels.add(Ridgewood);
        return hotels;

    }
}
