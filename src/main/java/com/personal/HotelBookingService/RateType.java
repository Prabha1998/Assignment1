package com.personal.HotelBookingService;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RateType {
    String customer;
    String day;
    int hashcodeValue;
    public RateType(String customer, String day) {
        this.customer = customer;
        this.day=day;
        if(customer.equals("Regular")&&day.equals("Weekday")){
           hashcodeValue=0;
        }
        else if(customer.equals("Regular")&&day.equals("Weekend")){
            hashcodeValue=1;
        }
        else if(customer.equals("Reward")&&day.equals("Weekday")){
            hashcodeValue=2;
        }
        else if(customer.equals("Reward")&&day.equals("Weekend")){
            hashcodeValue=3;
        }
        else {
            hashcodeValue=-1;
        }
    }
    @Override
    public boolean equals(Object obj)
    {

       if(obj!=null){
           return true;
       }
       else{
           return false;
       }
    }

    @Override
    public int hashCode() {
        return hashcodeValue;
    }
}
