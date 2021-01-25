package edu.umb.cs680.hw05;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.hamcrest.core.IsNot;
import org.junit.jupiter.api.Test;

public class CarTest {	
	private String[] CarToStringArray(Car c){
		String[] carInfo = 
			{ 
				c.getMake(), c.getModel(), Integer.toString(c.getYear()) 
			};
		return carInfo;
	}	
	
	
	@Test
	public void verifyCarEqualityWithMakeModelYear() {
		String[] expected = {"Toyota", "RAV4", "2020"};
		Car actual = new Car("Toyota", "RAV4", 2020);
		assertArrayEquals(expected, CarToStringArray(actual));
	}
	
	@Test
	public void verifyCarEqualityWithMakeModelYear_NotEqual() {
		String[] expected = {"Ford", "RAV5", "2020"};
		Car actual = new Car("Toyota", "RAV5", 2020);
		assertNotEquals(expected, CarToStringArray(actual));
	}	
}
		
