package hackerSolutions;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;



public class DaySol {
	public static String getDay(String day, String month, String year){
		
		String input_date=day+"/"+month+"/"+year;
		  SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
		  Date dt1;
		  String finalDay = null;
		try {
			dt1 = format1.parse(input_date);
		
		  DateFormat format2=new SimpleDateFormat("EEEE"); 
		   finalDay=format2.format(dt1).toUpperCase();
		   
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  return finalDay;
		
		
        
    }
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String month = in.next();
	        String day = in.next();
	        String year = in.next();
	        
	        System.out.println(getDay(day, month, year));
	    }
}
