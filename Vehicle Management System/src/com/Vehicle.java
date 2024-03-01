package com;
import java.time.*;

import Enums.Enum_Color;

public class Vehicle {
	private String chasisNo, company;
	private Enum_Color color;
	private double basePrice;
	private LocalDate manufactureDate;
	private boolean isAvailable;
	
	public Vehicle(String ChNo, String Company, Enum_Color Color, double Price, LocalDate Date)
	{
		this.chasisNo = ChNo;
		this.company = Company;
		this.color = Color;
		this.basePrice = Price;
		this.manufactureDate = Date;
		this.isAvailable = true;
	}
	
	@Override
	public String toString()
	{
		return "Chasis Number: "+chasisNo+"    Company: "+company+"    Color: "+color+"    Base Price: "+basePrice+"    Manufacture Date: "+manufactureDate;
	}
}
