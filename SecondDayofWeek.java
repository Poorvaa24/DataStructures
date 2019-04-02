import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class SecondDayofWeek {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");	
		GregorianCalendar calendar = new GregorianCalendar();

	calendar.set(GregorianCalendar.YEAR,1943);
	calendar.set(GregorianCalendar.MONTH,GregorianCalendar.OCTOBER); // Jan = 0, dec = 11
	calendar.set(GregorianCalendar.DAY_OF_WEEK,GregorianCalendar.TUESDAY); 
    calendar.set(GregorianCalendar.WEEK_OF_MONTH,2);
		
		int dayOfMonth = calendar.get(GregorianCalendar.DAY_OF_WEEK_IN_MONTH);
		
		System.out.println(dayOfMonth);
		

	}

}
