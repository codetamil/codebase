package dateFormatting;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringToDate {
	
	public static void convertStringToDate(String date)
	{
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");

        

        LocalDate localDate = LocalDate.parse(date, formatter);

        System.out.println(localDate);

        System.out.println(formatter.format(localDate));
        
        System.out.println(localDate.getYear());
        
        System.out.println(localDate.getDayOfMonth());
        
        System.out.println(localDate.getMonth());
        
     

	}
	
	public static void main(String args[])
	{
		convertStringToDate("18/06/1996");
	}
	
  

}
