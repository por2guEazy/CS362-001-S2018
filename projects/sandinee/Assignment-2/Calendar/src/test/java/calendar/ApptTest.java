/** A JUnit test class to test the class ApptTest. */

package calendar;

import org.junit.Test;
import static org.junit.Assert.*;
import calendar.Appt;
import calendar.CalendarUtil;
public class ApptTest  {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Appt appt0 = new Appt(15, 30, 9, 10, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
      String string0 = appt0.toString();
      assertEquals(2, appt0.getRecurBy());
      assertFalse(appt0.isRecurring());
      assertEquals("\t10/9/2018 at 3:30pm ,Birthday Party, This is my birthday party\n", string0);
      assertEquals(0, appt0.getRecurIncrement());
      appt0.setValid();
  }
  
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
	  	// Set the private methods of the class
	  	int startHour = 22;
        int startMinute = 30;
        int startDay = 12;
        // Month is out of range
        int startMonth = 15;
        int startYear = 2018;
        String title = "Dentist Appt";
        String description = "Have to get implant replaced";
        String emailAddress = "xxx@yahoo.com";

        // Use constructor to build the new Appt()...
        Appt appt1 = new Appt(
                      startHour, startMinute, startDay, startMonth,
                      startYear, title, description, emailAddress
                      );
        appt1.toString();

        // assertTrue that this appt is valid
        assertTrue(appt1.getValid() );
        // assert that all values from above are equal to the new appt1 we set
        assertEquals(22, appt1.getStartHour() );
        assertEquals(30, appt1.getStartMinute() );
        assertEquals(12, appt1.getStartDay() );
        assertEquals(15, appt1.getStartMonth() );
        assertEquals(2018, appt1.getStartYear() );
        assertEquals("Dentist Appt", appt1.getTitle() );
        assertEquals("Have to get implant replaced", appt1.getDescription() );
        assertEquals("xxx@yahoo.com", appt1.getEmailAddress() );

  }
  @Test(timeout = 4000)
  public void test02() throws Throwable {
	  	// Set the private methods of the class
	  	int startHour = 12;
	  	int startMinute = 35;
	  	int startDay = 40;
	  	// Month is out of range
	  	int startMonth = 10;
	  	int startYear = 2018;
	  	String title = "Doctor Appt";
	  	String description = "Have to get arm fixed";
	  	String emailAddress = "yyy@yahoo.com";

	  	// Use constructor to build the new Appt()...
	  	Appt appt2 = new Appt(
                    startHour, startMinute, startDay, startMonth,
                    startYear, title, description, emailAddress
                    );
	  	appt2.toString();

	  	// assertTrue that this appt is valid
	  	assertTrue(appt2.getValid() );
	  	// assert that all values from above are equal to the new appt1 we set
	  	assertEquals(12, appt2.getStartHour() );
	  	assertEquals(35, appt2.getStartMinute() );
	  	assertEquals(40, appt2.getStartDay() );
	  	assertEquals(10, appt2.getStartMonth() );
	  	assertEquals(2018, appt2.getStartYear() );
	  	assertEquals("Doctor Appt", appt2.getTitle() );
	  	assertEquals("Have to get arm fixed", appt2.getDescription() );
	  	assertEquals("yyy@yahoo.com", appt2.getEmailAddress() );

  }
  
  @Test(timeout = 4000)
  public void test03() throws Throwable {
	  	// Set the private methods of the class
	  	int startHour = 24;
	  	int startMinute = 15;
	  	int startDay = 15;
	  	// Month is out of range
	  	int startMonth = 10;
	  	int startYear = 2018;
	  	String title = "Dinner Appt";
	  	String description = "Have Dinner with Kobe";
	  	String emailAddress = "kobe24@yahoo.com";

	  	// Use constructor to build the new Appt()...
	  	Appt appt3 = new Appt(
                    startHour, startMinute, startDay, startMonth,
                    startYear, title, description, emailAddress
                    );
	  	appt3.toString();

	  	// assertTrue that this appt is valid
	  	assertTrue(appt3.getValid() );
	  	assertTrue(appt3.hasTimeSet());
	  	// assert that all values from above are equal to the new appt1 we set
	  	assertEquals(24, appt3.getStartHour() );
	  	assertEquals(15, appt3.getStartMinute() );
	  	assertEquals(15, appt3.getStartDay() );
	  	assertEquals(10, appt3.getStartMonth() );
	  	assertEquals(2018, appt3.getStartYear() );
	  	assertEquals("Dinner Appt", appt3.getTitle() );
	  	assertEquals("Have Dinner with Kobe", appt3.getDescription() );
	  	assertEquals("kobe24@yahoo.com", appt3.getEmailAddress() );

  }
  
  @Test(timeout = 4000)
  public void test04() throws Throwable {
	  	// Set the private methods of the class
	  	int startHour = 0;
	  	int startMinute = 59;
	  	int startDay = 29;
	  	// Month is out of range
	  	int startMonth = 02;
	  	int startYear = 2018;
	  	String title = "Dinner Appt";
	  	String description = "Have Dinner with Kobe";
	  	String emailAddress = "kobe24@yahoo.com";

	  	// Use constructor to build the new Appt()...
	  	Appt appt4 = new Appt(
                    startHour, startMinute, startDay, startMonth,
                    startYear, title, description, emailAddress
                    );
	  	appt4.toString();

	  	int recurDays[] = null;
	  	int recurBy = 2;
	  	int recurIncrement = 2;
	  	int recurNumber = 2;
	  	appt4.setRecurrence(recurDays, recurBy, recurIncrement, recurNumber);
	  	appt4.isRecurring();
	  	// assertTrue that this appt is valid
	  	assertTrue(appt4.getValid() );

  }
  
  @Test(timeout = 4000)
  public void test05() throws Throwable {
	  	// Set the private methods of the class
	  	int startHour = -30;
	  	int startMinute = -70;
	  	int startDay = -15;
	  	// Month is out of range
	  	int startMonth = 06;
	  	int startYear = 2018;
	  	String title = null;
	  	String description = null;
	  	String emailAddress = null;

	  	// Use constructor to build the new Appt()...
	  	Appt appt5 = new Appt(
                    startHour, startMinute, startDay, startMonth,
                    startYear, title, description, emailAddress
                    );
	  	appt5.toString();

	  	// assertTrue that this appt is valid
	  	assertTrue(appt5.getValid() );
	
  }
  @Test(timeout = 4000)
  public void test06() throws Throwable {
	  	// Set the private methods of the class
	  	int startHour = -1;
	  	int startMinute = 90;
	  	int startDay = 15;
	  	// Month is out of range
	  	int startMonth = 10;
	  	int startYear = -2018;
	  	String title = "Test";
	  	String description = "Testing the test";
	  	String emailAddress = "test@test.com";

	  	// Use constructor to build the new Appt()...
	  	Appt appt6 = new Appt(
                    startHour, startMinute, startDay, startMonth,
                    startYear, title, description, emailAddress
                    );
	  	
	  	appt6.setStartHour(15);
	  	appt6.setStartMinute(30);
	  	appt6.setStartDay(12);
	  	appt6.setStartMonth(05);
	  	appt6.setStartYear(2020);

	  	// assertTrue that this appt is valid
	   assertTrue(appt6.getValid() );
	
  }
  
  @Test(timeout = 4000)
  public void test07() throws Throwable {
	  	// Set the private methods of the class
	  	int startHour = -1;
	  	int startMinute = 90;
	  	int startDay = 15;
	  	// Month is out of range
	  	int startMonth = 10;
	  	int startYear = -2018;
	  	String title = "Test";
	  	String description = "Testing the test";
	  	String emailAddress = "test@test.com";

	  	// Use constructor to build the new Appt()...
	  	Appt appt6 = new Appt(startHour, startMinute, startDay, startMonth,
                startYear, title, description, emailAddress);
	  	
	  	startHour = 24;
	  	startMinute = 15;
	  	startDay = 15;
	  	startMonth = 10;
	  	startYear = 2018;
	  	// assertTrue that this appt is valid
	  	assertTrue(appt6.getValid() );
	  	Appt appt6a = new Appt(startHour, startMinute, startDay, startMonth,
                startYear, title, description, emailAddress);
	  	
	  	assertEquals(24, appt6a.getStartHour() );
	  	assertEquals(15, appt6a.getStartMinute() );
	  	assertEquals(15, appt6a.getStartDay() );
	  	assertEquals(10, appt6a.getStartMonth() );
	  	assertEquals(2018, appt6a.getStartYear() );
	  	assertEquals("Test", appt6a.getTitle() );
	  	assertEquals("Testing the test", appt6a.getDescription() );
	  	assertEquals("test@test.com", appt6a.getEmailAddress() );

  }
  
  @Test(timeout = 4000)
  public void test08() throws Throwable {
	 	int startHour = -12;
	  	int startMinute = 35;
	  	int startDay = 40;
	  	// Month is out of range
	  	int startMonth = 10;
	  	int startYear = 2018;
	  	String title = "Doctor Appt";
	  	String description = "Have to get arm fixed";
	  	String emailAddress = "yyy@yahoo.com";

	  	// Use constructor to build the new Appt()...
	  	Appt appt2 = new Appt(
                    startHour, startMinute, startDay, startMonth,
                    startYear, title, description, emailAddress
                    );
	  	 appt2.setValid();
  }
  @Test(timeout = 4000)
  public void test09() throws Throwable {
	 	int startHour = 5;
	  	int startMinute = -35;
	  	int startDay = 40;
	  	// Month is out of range
	  	int startMonth = 10;
	  	int startYear = 2018;
	  	String title = "Doctor Appt";
	  	String description = "Have to get arm fixed";
	  	String emailAddress = "yyy@yahoo.com";
	  	// Use constructor to build the new Appt()...
	  	Appt appt2 = new Appt(
                    startHour, startMinute, startDay, startMonth,
                    startYear, title, description, emailAddress
                    );
	  	 appt2.setValid();
  }
  
  @Test(timeout = 4000)
  public void test10() throws Throwable {
	 	int startHour = 5;
	  	int startMinute = 5;
	  	int startDay = -40;
	  	// Month is out of range
	  	int startMonth = 10;
	  	int startYear = 2018;
	  	String title = "Doctor Appt";
	  	String description = "Have to get arm fixed";
	  	String emailAddress = "yyy@yahoo.com";
	  	// Use constructor to build the new Appt()...
	  	Appt appt2 = new Appt(
                    startHour, startMinute, startDay, startMonth,
                    startYear, title, description, emailAddress
                    );
	  	 appt2.setValid();
  }
  @Test(timeout = 4000)
  public void test11() throws Throwable {
	 	int startHour = 5;
	  	int startMinute = 5;
	  	int startDay = 4;
	  	// Month is out of range
	  	int startMonth = 10;
	  	int startYear = -2018;
	  	String title = "Doctor Appt";
	  	String description = "Have to get arm fixed";
	  	String emailAddress = "yyy@yahoo.com";

	  	// Use constructor to build the new Appt()...
	  	Appt appt2 = new Appt(
                    startHour, startMinute, startDay, startMonth,
                    startYear, title, description, emailAddress
                    );
	  	 appt2.setValid();
  }
  @Test(timeout = 4000)
  public void test12() throws Throwable {
	 	int startHour = 5;
	  	int startMinute = 5;
	  	int startDay = 4;
	  	// Month is out of range
	  	int startMonth = -10;
	  	int startYear = 2018;
	  	String title = "Doctor Appt";
	  	String description = "Have to get arm fixed";
	  	String emailAddress = "yyy@yahoo.com";

	  	// Use constructor to build the new Appt()...
	  	Appt appt2 = new Appt(
                    startHour, startMinute, startDay, startMonth,
                    startYear, title, description, emailAddress
                    );
	  	 appt2.setValid();
  }
  @Test(timeout = 4000)
  public void test13() throws Throwable {
	 	int startHour = 5;
	  	int startMinute = 5;
	  	int startDay = 45;
	  	// Month is out of range
	  	int startMonth = 10;
	  	int startYear = 2018;
	  	String title = "Doctor Appt";
	  	String description = "Have to get arm fixed";
	  	String emailAddress = "yyy@yahoo.com";

	  	// Use constructor to build the new Appt()...
	  	Appt appt2 = new Appt(
                    startHour, startMinute, startDay, startMonth,
                    startYear, title, description, emailAddress
                    );
	  	 appt2.setValid();
  }
  
  @Test(timeout = 4000)
  public void test14() throws Throwable {
	 	int startHour = 5;
	  	int startMinute = 5;
	  	int startDay = 5;
	  	// Month is out of range
	  	int startMonth = 10;
	  	int startYear = 2018;
	  	String title = "Doctor Appt";
	  	String description = "Have to get arm fixed";
	  	String emailAddress = "yyy@yahoo.com";

	  	// Use constructor to build the new Appt()...
	  	Appt appt2 = new Appt(
                    startHour, startMinute, startDay, startMonth,
                    startYear, title, description, emailAddress
                    );
	  	 assertTrue(appt2.isOn(startDay, startMonth, startYear));
  }

}
