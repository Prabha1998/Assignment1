package com.personal.HotelBookingService;

import java.util.ArrayList;
import java.util.Date;

public interface Service {
     Hotel findCheapest(String customer, ArrayList<Date> days);
}
