package com.example.VeloVault;

import com.example.VeloVault.models.Item;
import com.example.VeloVault.models.User;
import com.example.VeloVault.models.mainCatagory.subCatagory.Insulated;
import org.junit.Before;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@ActiveProfiles("test")
@SpringBootTest
public class VeloVaultApplicationTests {

	User user;
	Item insulated;


//	@Before
//	public void setUp(){
//		user = new User("Jack", "jack@gmail.com");
//		insulated = new Insulated("Vest", "Northface", null, null, user, "M", "synthetic");
//	}

	@Test
	public void contextLoads() {
	}

//
//	@Test
//	public void canRentItem(){
//		insulated.rentItem(user, insulated, "1/1/2022", "3/1/2022");
//		assertEquals(1, insulated.getBookingListSize());
//	}

}
