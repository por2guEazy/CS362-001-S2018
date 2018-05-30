
/** A JUnit test class to test the class DataHandler. */


package calendar;

import org.junit.Test;
import static org.junit.Assert.*;
import calendar.Appt;
import calendar.CalDay;
import calendar.DataHandler;

import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;


public class DataHandlerTest{

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
	 
	  new DataHandler();
  }
 
  @Test(timeout = 4000)
  public void test01() throws Throwable {
	  int day = 1;
	  int month = 1;
	  int year = 2018;
	  
	  GregorianCalendar calOne = new GregorianCalendar(year, month, day);
	  GregorianCalendar calTwo = new GregorianCalendar(year, month, day+10);

	  DataHandler dh =   new DataHandler();
	  List<CalDay> days = dh.getApptRange(calOne, calTwo);
      System.out.println(days);

	  assertEquals(10, days.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
	 
	  DataHandler dh =   new DataHandler();
	  dh.save();
	  DataHandler dh2 =   new DataHandler();

	 
  }
  
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
		 
	  DataHandler dh =   new DataHandler();
	  int startHour = 22;
      int startMinute = 30;
      int startDay = 12;
      // Month is out of range
      int startMonth = 10;
      int startYear = 2018;
      String title = "Dentist Appt";
      String description = "Have to get implant replaced";
      String emailAddress = "xxx@yahoo.com";

      // Use constructor to build the new Appt()...
      Appt appt = new Appt(
                    startHour, startMinute, startDay, startMonth,
                    startYear, title, description, emailAddress
                    );
      dh.saveAppt(appt);
      

  }
}
