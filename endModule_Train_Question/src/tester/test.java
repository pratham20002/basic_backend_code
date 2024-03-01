package tester;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.train;

import Enums.train_type;
import Exceptions.InvalidTrainNoException;
import Validations.validations;

public class test {

	public static void main(String[] args) throws InvalidTrainNoException {
		// TODO Auto-generated method stub
		try(Scanner sc  = new Scanner(System.in))
		{
			Map<String, train> train_data_map = new HashMap<>();
//			Iterator<train> iterator = train_data_map.values().iterator();
			train_data_map.put("tra123", new train("tra123", 16 , "11:40", "11:30", "pune", "jalgaon", Enums.train_type.valueOf("EXPRESS"), LocalDate.parse("2023-10-14")));
			train_data_map.put("tra124", new train("tra124", 15 , "11:40", "11:30", "pune", "jalgaon", Enums.train_type.valueOf("EXPRESS"), LocalDate.parse("2023-11-19")));
			train_data_map.put("tra125", new train("tra125", 14 , "11:40", "11:30", "pune", "jalgaon", Enums.train_type.valueOf("EXPRESS"), LocalDate.parse("2023-10-01")));
			boolean exit=false;
			while(!exit)
			{
				System.out.println("\n1: Add Data\n2: Delete Data Which has less than 15 bogies\n3: Display Data\n4: Sorting Data\n5: Exit\nEnter Your Choice:");
	//			String train_no, int no_of_bogies, String dept_time, String arrival_time, String source, String destination,
	//			train_type type, LocalDate date_of_journey
				
				switch(sc.nextInt())
				{
					case 1:	System.out.println("Enter TrainNo, No of Bogies, dept_time, arrival_time, source, destinition, type, date_of_journey: ");
							String tNo = sc.next();
							train_data_map.put(tNo, validations.validateAll(tNo, sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next().toUpperCase(), train_data_map));
							break;
							
					case 2:	System.out.println("Do You Want to Delete train having less than 15 bogies (y/n): ");
							String ch = sc.next();
							if(ch.equals("y") || ch.equals("Y"))
							{
								train_data_map.values().removeIf(p-> p.getNo_of_bogies() < 15);
								System.out.println("Removed Sucessfully/////!");
							}	
							break;
							
					case 3: System.out.println("\nDisplaying Data: ");
							train_data_map.values().stream().forEach(System.out::println);
							System.out.println("\n");
							break;
							

					case 4:	System.out.println("\nSorting Accordingly\n1: Using Train Number\n2: Using Num of Bogies\n3: Using Date\nEnter Your Choice: ");
							switch(sc.nextInt())
							{
								case 1: train_data_map.values().stream().sorted((p1, p2) -> p1.getTrain_no().compareTo(p2.getTrain_no())).forEach(System.out::println);
										break;
										
								case 2: train_data_map.values().stream().sorted((p1, p2) -> ((Integer)p1.getNo_of_bogies()).compareTo(p2.getNo_of_bogies())).forEach(System.out::println);
										break;
									
								case 3: train_data_map.values().stream().sorted((p1, p2) -> p1.getDate_of_journey().compareTo(p2.getDate_of_journey())).forEach(System.out::println);
										break;
							}
							
					case 5: exit = true;
				}
			}
		}
		//tra126 17 11:40 11:30 pune jalgaon EXPRESS 2023-10-10
	}

}
