package com.personal.HotelBookingService;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.*;

public class BookingServiceTest {
    @Test
public void testCheapestHotel(){
    BookingService book=new BookingService();
    ArrayList<Date> dates=new ArrayList<Date>();
    Calendar c = Calendar.getInstance();
    c.set(2009, 2, 26);
    Date d1 = c.getTime();
    c.set(2009, 2, 27);
    Date d2 = c.getTime();
    c.set(2009, 2, 28);
    Date d3 = c.getTime();
    dates.add(d1);
    dates.add(d2);
    dates.add(d3);
       String name=book.findCheapest("Reward",dates).name;
        Assert.assertEquals("Ridgewood",name);
}
}