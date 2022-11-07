package com.example.VeloVault.services;

import com.example.VeloVault.models.Booking;
import com.example.VeloVault.models.Item;
import com.example.VeloVault.models.RentItemException;
import com.example.VeloVault.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class ItemService {

    @Autowired
    ItemRepository itemRepository;


    public void updateItem(Item itemToUpdate){

    }


//    public void updateBooking(Booking bookingToUpdate, Date startDate, Date endDate) throws RentItemException {
//        if(doesDateRangeOverlap(bookingToUpdate.getItem(), startDate, endDate, bookingToUpdate.getId())) {
//            throw new RentItemException("Item is already booked for the given date range");
//        }
//        else if(startDate.compareTo(endDate) > 0) {
//            throw new RentItemException("start date must be before end date");
//        }
//        bookingToUpdate.setStartDate(startDate);
//        bookingToUpdate.setEndDate(endDate);
//        bookingRepository.save(bookingToUpdate);
//    }

}
