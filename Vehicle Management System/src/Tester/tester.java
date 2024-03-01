package Tester;
import java.util.*;
import com.Vehicle;

import Enums.Enum_Color;
import Exceptions.*;
import ValidationRules.valid_Rules;

public class tester {

	public static void main(String[] args) {
		
		List<Vehicle> list1 = new ArrayList<>();
		try {
			list1.add(valid_Rules.ValidAllRules("101", "BMW", "black", 50000, "2023-10-01"));
			System.out.println("List: "+list1);
		} catch (InvalidManufactureDateException | Vehicle_Color_is_InValid e) {
			e.printStackTrace();
		}
 
	}

}
