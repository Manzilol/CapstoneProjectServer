package com.example.VeloVault.components;

import com.example.VeloVault.models.Item;
import com.example.VeloVault.models.User;
import com.example.VeloVault.models.mainCatagory.subCatagory.Tent;
import com.example.VeloVault.models.mainCatagory.subCatagory.individualItem.SnuggleZone;
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

    public DataLoader() {
    }

    public void run(ApplicationArguments args){

        User user1 = new User("Steve John", "sj@bike.com", null, null);

        Item snuggleZone = new SnuggleZone("SnuggleZone", "CuddleTimes", null, null, user1, 2000, 2, "30cm x 10cm x 15cm", true, "poles");


    }
}
