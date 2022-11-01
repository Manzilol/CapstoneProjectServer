package com.example.VeloVault.models.mainCatagory.subCatagory.individualItem;

import com.example.VeloVault.models.User;
import com.example.VeloVault.models.mainCatagory.subCatagory.Tent;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Entity
public class SnuggleZone extends Tent {

    public SnuggleZone(String name, String brand, List<Integer> ratings, List<String> comments, User user, int weight, int capacity, String packSize, boolean footprint, String poleType) {
        super(name, brand, ratings, comments, user, weight, capacity, packSize, footprint, poleType);
    }


}
