package com.personal.HotelBookingService;

import java.text.SimpleDateFormat;
import java.util.*;

public class BookingService implements Service {


    public Hotel findCheapest(String customer, ArrayList<Date> dates) {
        Hotel cheapestHotel;
        ArrayList<String> days=getDays(dates);
        ArrayList<Hotel> hotels=HotelList.getHotels();
        ArrayList<Integer> rates=new ArrayList<Integer>();
        for(Hotel hotel:hotels){
            int totalRate=0;
            for(String day:days){
                System.out.print(day+" ");
                int rate= hotel.getPrice(new RateType(customer,day));
                System.out.println(rate);
                totalRate+=rate;
            }
            rates.add(totalRate);
        }

        return findCheapest(hotels,rates);
    }



    public Hotel findCheapest(ArrayList<Hotel> hotels,ArrayList<Integer> rates){
        int minrate=Collections.min(rates);
        ArrayList<Hotel> cheapestHotels=new ArrayList<Hotel>();
        int size=rates.size();
        for(int i=0;i<size;i++){
            int index=rates.indexOf(minrate);
            if(index!=-1) {
                cheapestHotels.add(hotels.get(index));
                hotels.remove(index);
                rates.remove(index);
            }
            else{
                break;
            }
        }

        ArrayList<Integer> hotelRatings=new ArrayList<Integer>();
        for(Hotel hotel:cheapestHotels){
            hotelRatings.add(hotel.rating);
        }

        int index=hotelRatings.indexOf(Collections.max(hotelRatings));
        return cheapestHotels.get(index);
    }



    public ArrayList<String> getDays(ArrayList<Date> dates)
    {
        ArrayList<String> days = new ArrayList<String>();
        String day;
        for(Date date:dates){
        SimpleDateFormat toGetDayType=new SimpleDateFormat("EEEE");
        day=toGetDayType.format(date);
        if(day.equals("Saturday")||day.equals("Sunday")){
            day="Weekend";
        }
        else{
            day="Weekday";
        }
        days.add(day);
        }
        return days;
     }



 }
