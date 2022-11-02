package com.example.VeloVault.components;

import com.example.VeloVault.models.Booking;
import com.example.VeloVault.models.Item;
import com.example.VeloVault.models.User;
import com.example.VeloVault.models.mainCatagory.subCatagory.Insulated;
import com.example.VeloVault.models.mainCatagory.subCatagory.Tent;
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




    }
}
