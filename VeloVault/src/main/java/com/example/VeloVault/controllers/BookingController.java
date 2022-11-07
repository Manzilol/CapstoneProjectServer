package com.example.VeloVault.controllers;

import com.example.VeloVault.models.*;
import com.example.VeloVault.repositories.BookingRepository;
import com.example.VeloVault.repositories.ItemRepository;
import com.example.VeloVault.repositories.UserRepository;
import com.example.VeloVault.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookingController {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    ItemRepository itemRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    BookingService bookingService;

    @GetMapping(value = "/bookings")
    public List<Booking> getAllBookings(){ return bookingRepository.findAll();}

    @GetMapping(value = "/bookings/{id}")
    public Booking getBookingById(@PathVariable("id") Long id){
        Optional<Booking> booking = bookingRepository.findById(id);
        return booking.isPresent() ? booking.get() : null;
    }

//    @PostMapping(value = "/bookings")
//    public ResponseEntity postBooking(@RequestBody Booking booking){
//        bookingRepository.save(booking);
//        return new ResponseEntity<>(booking, HttpStatus.CREATED);
////        this has become redundant - ask me why
//    }

    @PostMapping(value = "/bookings")
    public ResponseEntity rentItem(@RequestBody RentItemRequest rentItemRequest){
        Optional<User> user = userRepository.findById(rentItemRequest.getUserId());
        if(!user.isPresent()) {
            return new ResponseEntity<>(new ResponseMessage(false, "User " + rentItemRequest.getUserId() + " not found."), HttpStatus.NOT_FOUND);
        }
        Optional<Item> item = itemRepository.findById(rentItemRequest.getItemId());
        if(!item.isPresent()) {
            return new ResponseEntity<>(new ResponseMessage( false, "Item " + rentItemRequest.getItemId() + " not found."), HttpStatus.NOT_FOUND);
        }
        try {
            return new ResponseEntity<>(bookingService.rentItem(user.get(), item.get(), rentItemRequest.getStartDate(), rentItemRequest.getEndDate()), HttpStatus.CREATED);
        }
        catch(RentItemException ex) {
            return new ResponseEntity<>(new ResponseMessage( false, ex.getMessage()), HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping(value = "/bookings/{id}")
    public ResponseEntity putBooking(@RequestBody Booking booking, @PathVariable Long id){
        Booking bookingToUpdate = bookingRepository.findById(id).get();
        try {
            bookingService.updateBooking(bookingToUpdate, booking.getStartDate(), booking.getEndDate() );
        }
        catch(RentItemException ex) {
            return new ResponseEntity<>(new ResponseMessage( false, ex.getMessage()), HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(bookingToUpdate, HttpStatus.OK);
    }

    @DeleteMapping(value = "/bookings/{id}")
    public ResponseEntity deleteBooking(@PathVariable Long id){
        Optional<Booking> booking = bookingRepository.findById(id);
        if(!booking.isPresent()) {
            return new ResponseEntity<>(new ResponseMessage( false, "Booking " + id + " not found."), HttpStatus.NOT_FOUND);
        }
        bookingRepository.deleteById(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }
}
