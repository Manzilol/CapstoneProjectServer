package com.example.VeloVault.components;

import com.example.VeloVault.models.Booking;
import com.example.VeloVault.models.Item;
import com.example.VeloVault.models.User;
import com.example.VeloVault.models.mainCatagory.Cooking;
import com.example.VeloVault.models.mainCatagory.subCatagory.*;
import com.example.VeloVault.repositories.BookingRepository;
import com.example.VeloVault.repositories.ItemRepository;
import com.example.VeloVault.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Profile("!test")
@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    ItemRepository itemRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    BookingRepository bookingRepository;


    public DataLoader() {
    }

    public void run(ApplicationArguments args){

        User user1 = new User("Steve", "steve@bike.com");
        userRepository.save(user1);

        User user2 = new User("John", "wkerjgh");
        userRepository.save(user2);

        Item tent1 = new Tent("SNuggleZone", "cosyTime", null, null, user1, 2000, 2, "30cm x 30cm", true, "poles");
        itemRepository.save(tent1);

        Booking booking1 = new Booking("10/12/2020", "15/12/2020", user1, tent1);
        bookingRepository.save(booking1);

        Item insulated1 = new Insulated("Vest", "Northface", null, null, user2, "M", "synthetic");
        itemRepository.save(insulated1);

        Booking booking2 = new Booking("12/12/2022", "24/12/2022", user1, insulated1);
        bookingRepository.save(booking2);

        Item waterproof1 = new Waterproof("Jacket", "Patagonia", null, null, user1, "L", "10000mm");
        itemRepository.save(waterproof1);

        Booking booking3 = new Booking("03/03/2022", "07/03/2022", user2, waterproof1);
        bookingRepository.save(booking3);

        Item crockery1 = new Crockery("pot", "john lewis", null, null, user1, 100, 30, 4);
        itemRepository.save(crockery1);

        Booking booking4 = new Booking("12/02/2023", "18/02/2023", user2, crockery1);
        bookingRepository.save(booking4);

        Item stove1 = new Stove("gassy", "sprakies", null, null, user2, 100, 100, "gas", false);
        itemRepository.save(stove1);

        Booking booking5 = new Booking("12/04/2023", "17/04/2023", user1, stove1);
        bookingRepository.save(booking5);

        Item lighting1 = new Lighting("super bright", "maglite", null, null, user1, true, 1000, "LED");

        Booking booking6 = new Booking("12/03/2023", "20?03", user2, lighting1);
        bookingRepository.save(booking6);



    }
}
