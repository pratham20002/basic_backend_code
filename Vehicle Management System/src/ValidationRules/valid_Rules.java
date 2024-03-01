package ValidationRules;
import java.time.LocalDate;
import com.Vehicle;
import Enums.Enum_Color;
import Exceptions.*;

public class valid_Rules {
	
	public static LocalDate ManufactureDate(String Date) throws InvalidManufactureDateException{
		if(LocalDate.parse(Date).isBefore(LocalDate.parse("2021-01-01"))) {
			throw new InvalidManufactureDateException("Invalid Manufacture Date...!");	
		}
		
		return LocalDate.parse(Date);
	}
	
	public static Enum_Color Vehicle_Color_is_InValid(String Color) throws Vehicle_Color_is_InValid{
		boolean output=false;
		
		for(Enum_Color enumCol : Enum_Color.values())	
		{
			if(enumCol.toString().equals(Color))
			{
				output=true;
			}
		}
		if(output==false)
		{
			throw new Vehicle_Color_is_InValid("Invalid Color...!");
		}
		
		return Enum_Color.valueOf(Color);
	}	
	
	public static Vehicle ValidAllRules(String ChNo, String Company, String Color, double Price, String Date) throws InvalidManufactureDateException, Vehicle_Color_is_InValid
	{
		Enum_Color eCol = Vehicle_Color_is_InValid(Color.toUpperCase());
		LocalDate d1 = ManufactureDate(Date);
		
		return new Vehicle(ChNo, Company, eCol, Price, d1);
	}
	
}
