package Validations;

import java.time.LocalDate;
import java.util.Map;
import com.*;
import Enums.train_type;
import Exceptions.InvalidTrainNoException;

public class validations {
	
	public static String validateTrainNo(String tNo) throws InvalidTrainNoException
	{
		if(tNo.length() != 6)
		{
			throw new InvalidTrainNoException("Invalid Train Number......\nShould be like --> ( tra123 ):");
		}
		return tNo;
	}
	
	public static train validateAll(String tNo, int no_ob_bogies, String dept_time, String arrival_time, String source, String destination,
			String type, String date_of_journey, Map<String, train> m) throws InvalidTrainNoException
	{
		return new train(validateTrainNo(tNo), no_ob_bogies, dept_time, arrival_time, source, destination, train_type.valueOf(type),LocalDate.parse(date_of_journey));
	}
}
