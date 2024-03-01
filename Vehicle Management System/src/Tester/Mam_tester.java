//Customer Code Temp Likha Hai

//this is mam written code not a part of this program file -----Xtra------

package Tester;

import java.util.*;
import com.Vehicle;

public class Mam_tester {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in))
		{
			List <Vehicle> vehicles = new ArrayList<>();
			boolean exit = false;
			while(!exit) {
				System.out.println("Option 1: Signup    Option 2: Signin    Option 3: Display    Option 4: Reset Password    Option 5: Exit");
				try {
					switch(sc.nextInt()) {
					case 1:	
							break;
						
					case 2:
							break;
					}
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
		}

	}

}
