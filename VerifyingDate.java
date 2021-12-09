package allConceptsPrep;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.*;
import java.util.Date;
import java.util.Scanner;

public class VerifyingDate 
{
	

	public static void main(String[] args)
	{
		LocalDate localClockRef= LocalDate.now(Clock.systemUTC());// todays date
		LocalDate localClockRef1= LocalDate.of(2021,12,10);// future date
//		System.out.println(localClockRef);
//		LocalDate localFromDates = LocalDate.of(2021,12,9);
//		System.out.println(localFromDates);
		
//		System.out.println(localClockRef1+ "is 09th Of"+localClockRef1.isAfter(localClockRef));
		if(localClockRef1.isAfter(localClockRef))
		{
			System.out.println(localClockRef1+ " is in future :");
		}
		else if(localClockRef1.equals(localClockRef))
		{
			System.out.println( localClockRef1+" is a present day : ");
		}
		else
		{
			System.out.println(localClockRef1+" is in past");
		}
	}
	}


