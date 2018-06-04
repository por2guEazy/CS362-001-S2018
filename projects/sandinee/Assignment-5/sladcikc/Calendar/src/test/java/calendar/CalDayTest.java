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
	  
	  GregorianCalendar cal = new GregorianCalendar(day, month, year);
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
	  
	  GregorianCalendar cal = new GregorianCalendar(day, month, year);
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
	  
	  GregorianCalendar cal = new GregorianCalendar(day, month, year);
	  CalDay calDay = new CalDay(cal);
	  
      Iterator itr = ((CalDay)calDay).iterator();
 
  }
  
  
  @Test
	public void test03()  throws Throwable  {
		int day=23;
		int month=9;
		int year=2018;
		GregorianCalendar cal = new GregorianCalendar(day, month, year);

		CalDay calday = new CalDay(cal);

		String one = calday.getFullInfomrationApp(calday);
		
		
	}


	@Test
	public void test04()  throws Throwable  {
	
		CalDay calday = new CalDay();
		assertFalse(calday.isValid());
	}

  
	@Test
	public void test05()  throws Throwable  {

		int day=29;
		int month=1;
		int year=2018;
		GregorianCalendar cal = new GregorianCalendar(day, month, year);


		CalDay calday = new CalDay(cal);

		int startHour=21;
		int startMinute=30;
		int startDay=29;
		int startMonth=01;
		int startYear=2018;
		String title="Birthday Party";
		String description="This is my birthday party.";
		String emailAddress="xyz@abc.com";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description, emailAddress);
		java.util.LinkedList <calendar.Appt> appts2;


		startHour = 20;
		Appt appt3 = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description, emailAddress);
		startHour = 23;
		Appt appt4 = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description, emailAddress);

		calday.addAppt(appt);
		calday.addAppt(appt3);
		calday.addAppt(appt4);

		appts2= calday.getAppts();
		String convert;
		convert = calday.toString();

		assertTrue(appt.getValid());
		assertTrue(appt3.getValid());
		assertTrue(appt4.getValid());
		assertEquals(appts2, calday.appts);

	}
	

	@Test
	public void test08()  throws Throwable  {

		int day=29;
		int month=1;
		int year=2018;
		GregorianCalendar cal = new GregorianCalendar(month, day, year);


		CalDay calday = new CalDay(cal);

		int startHour=21;
		int startMinute=30;
		int startDay=29;
		int startMonth=01;
		int startYear=2018;
		String title="Birthday Party";
		String description="This is my birthday party.";
		String emailAddress="xyz@abc.com";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description, emailAddress);
		java.util.LinkedList <calendar.Appt> appts2;


		startHour = 20;
		Appt appt3 = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description, emailAddress);
		startHour = 23;
		Appt appt4 = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description, emailAddress);

		calday.addAppt(appt);
		calday.addAppt(appt3);
		calday.addAppt(appt4);

		appts2= calday.getAppts();
		
		String one = calday.getFullInfomrationApp(calday);
		System.out.println(one);

		int size;

		size = calday.getSizeAppts();
		assertTrue(appt.getValid());
		assertEquals(3, size);
	}
}

