/** A JUnit test class to test the class ApptTest. */

package calendar;

import org.junit.Test;
import static org.junit.Assert.*;
import calendar.Appt;
import calendar.CalendarUtil;
public class ApptTest  {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Appt appt0 = new Appt(15, 30, 9, 14, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
      String string0 = appt0.toString();
      assertEquals(2, appt0.getRecurBy());
      assertFalse(appt0.isRecurring());
      assertEquals("\t14/9/2018 at 3:30pm ,Birthday Party, This is my birthday party\n", string0);
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
        String description = "Have to get implent replaced";
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
        assertEquals("Have to get implent replaced", appt1.getDescription() );
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

}
