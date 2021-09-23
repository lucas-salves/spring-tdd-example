package com.example.tdd;


import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class BookingServiceTest {

	@Autowired
	BookinService bookingService;
	
	@Test
	public void bookingTestServiceDaysCalculator() {
		String name = "Lucas"
		int days = bookingService.daysCalculatorWithDatabase(name);
		
		
		Assertions.assertEquals(days, 10);
		
	}
	
}
