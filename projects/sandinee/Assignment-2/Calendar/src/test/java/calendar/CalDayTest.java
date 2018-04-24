/** A JUnit test class to test the class CalDay. */

package calendar;

import org.junit.Test;
import static org.junit.Assert.*;
import calendar.Appt;
import calendar.CalDay;
import java.util.GregorianCalendar;
import java.util.Iterator;

public class CalDayTest{

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
	  
	  int day = 30;
	  int month = 12;
	  int year = 2018;
	  
	  GregorianCalendar cal = new GregorianCalendar();
	  CalDay calDay = new CalDay(cal);
	  
	  assertTrue(calDay.isValid() );
	  
	 int startHour = 12;
	 int startMinute = 30;
	 int startDay = 15;
	 int startMonth = 06;
	 int startYear = 2018;
	 String title = "Calday";
	 String description = "Calday Description";
	 String emailAddress = "zzz@ppp.com";
	 
	 Appt appt = new Appt(startHour, startMinute, startDay, startMonth,
             startYear, title, description, emailAddress);
  
	 java.util.LinkedList <calendar.Appt> apptB;
	 calDay.addAppt(appt);
	 apptB = calDay.getAppts();
	 assertTrue(appt.getValid() );
	 assertEquals(apptB, calDay.appts);
  }
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {

	  int day = 12;
	  int month = 4;
	  int year = 2018;
	  
	  GregorianCalendar cal = new GregorianCalendar();
	  CalDay calDay = new CalDay(cal);
	  
	  
	 int startHour = 24;
	 int startMinute = 60;
	 int startDay = 15;
	 int startMonth = 12;
	 int startYear = 2018;
	 String title = "Calday";
	 String description = "Calday Description";
	 String emailAddress = "zzz@ppp.com";
	 
	 Appt appt = new Appt(startHour, startMinute, startDay, startMonth,
             startYear, title, description, emailAddress);
  
	 java.util.LinkedList <calendar.Appt> apptB;
	 
	 String asString = calDay.toString();
	 
	 assertTrue(appt.getValid() );
	  
	  
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {

	  int day = 12;
	  int month = 4;
	  int year = 2018;
	  
	  GregorianCalendar cal = new GregorianCalendar();
	  CalDay calDay = new CalDay(cal);
	  
      Iterator itr = ((CalDay)calDay).iterator();
	  
  }
  
}
