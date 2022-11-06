package com.example.VeloVault.services;

import com.example.VeloVault.models.Booking;
import com.example.VeloVault.models.Item;
import com.example.VeloVault.models.RentItemException;
import com.example.VeloVault.models.User;
import com.example.VeloVault.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    public Booking rentItem(User user, Item item, Date startDate, Date endDate) throws RentItemException {
        // do the start/end dates overlap?
        // if so, renting is not possible - throw an exception
        // 1. find all date ranges for selected item
        // 2. do any of those date ranges overlap with startDate/endDate
        if(doesDateRangeOverlap(item, startDate, endDate)) {
            throw new RentItemException("Item is already booked for the given date range");
        }
        else if(startDate.compareTo(endDate) > 0) {
            throw new RentItemException("start date must be before end date");
        }
        return bookingRepository.save(new Booking(startDate, endDate, user, item));
    }

    public void updateBooking(Booking bookingToUpdate, Date startDate, Date endDate) throws RentItemException {
        if(doesDateRangeOverlap(bookingToUpdate.getItem(), startDate, endDate, bookingToUpdate.getId())) {
            throw new RentItemException("Item is already booked for the given date range");
        }
        else if(startDate.compareTo(endDate) > 0) {
            throw new RentItemException("start date must be before end date");
        }
        bookingToUpdate.setStartDate(startDate);
        bookingToUpdate.setEndDate(endDate);
        bookingRepository.save(bookingToUpdate);
    }

    private boolean doesDateRangeOverlap(Item item, Date startDate, Date endDate) {
        return doesDateRangeOverlap(item, startDate, endDate, null);
    }

    private boolean doesDateRangeOverlap(Item item, Date startDate, Date endDate, Long ignoredBookingId) {
        for (Booking booking : item.getBookings()) {
            if ( ! booking.getId().equals(ignoredBookingId)
                    && booking.getEndDate().compareTo(startDate) >= 0 // booking.endDate >= startDate
                    && booking.getStartDate().compareTo(endDate) <= 0) // booking.startDate >= endDate
                return true;
        }
        return false;
    }
}
