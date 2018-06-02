package calendar;

import java.util.Calendar;
import java.util.Random;
import java.util.GregorianCalendar;

import org.junit.Test;

import static org.junit.Assert.*;


/**
 * Random Test Generator  for CalDay class.
 */

public class CalDayRandomTest {
	
	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=10;

	/**
	 * Return a randomly selected method to be tests !.
	 */
    public static String RandomSelectMethod(Random random){
        String[] methodArray = new String[] {"addAppt"};// The list of the of methods to be tested in the Appt class

    	int n = random.nextInt(methodArray.length);// get a random number between 0 (inclusive) and  methodArray.length (exclusive)
    	            
        return methodArray[n] ; // return the method name 
        }
   /**
     * Generate Random Tests that tests CalDay Class.
     */
	 @Test
	  public void radnomtest()  throws Throwable  {

		 long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;
		 
		 System.out.println("Start testing...");
		 
		try{ 
			for (int iteration = 0; elapsed < TestTimeout; iteration++) {
				long randomseed =System.currentTimeMillis(); //10
				Random random = new Random(randomseed);
				
		 		//CalDay calday = new CalDay();
				//GregorianCalendar calday = new GregorianCalendar(1989, 6, 21);
				CalDay calday = new CalDay(new GregorianCalendar(1989, 6, 21));


				 int startHour=ValuesGenerator.getRandomIntBetween(random, -3, 25);
				 int startMinute=ValuesGenerator.getRandomIntBetween(random, -3, 61);
				 int startDay=ValuesGenerator.getRandomIntBetween(random, -3, 32);
				 int startMonth=ValuesGenerator.getRandomIntBetween(random, -3, 13);
				 int startYear=ValuesGenerator.getRandomIntBetween(random, 1985, 1991);
				 String title="Birthday Party";
				 String description="This is my birthday party.";
				 String emailAddress="xyz@gmail.com";
				 
				 //Construct a new Appointment object with the initial data	 
				 Appt appt = new Appt(startHour,
				          startMinute ,
				          startDay ,
				          startMonth ,
				          startYear ,
				          title,
				          description,
				          emailAddress);
				 
				 if(!appt.getValid())continue;
				 // Get new values for new appt2
				 startHour=ValuesGenerator.getRandomIntBetween(random, 0, 24);
				 startMinute=ValuesGenerator.getRandomIntBetween(random, 0, 60);
				 startDay=ValuesGenerator.getRandomIntBetween(random, 0, 31);
				 startMonth=ValuesGenerator.getRandomIntBetween(random, 0, 12);
				 startYear=ValuesGenerator.getRandomIntBetween(random, 1985, 1995);
				 title="Work Part";
				 description="This is my work party";
				 emailAddress="yzx@gmail.com";
				 // Create a new appt
				 Appt appt2 = new Appt(startHour,
						 startMinute,
				         startDay,
				         startMonth,
				         startYear,
				         title,
				         description,
				         emailAddress);
				// try adding appointments to a given day
				for (int i = 0; i < NUM_TESTS; i++) {
					// Testing addAppt here
					calday.addAppt(appt);
					calday.addAppt(appt2);
					int hit = ValuesGenerator.getRandomIntBetween(random, 0, 7);
					if(hit == 5){
						appt2.setStartHour(hit);
						calday.addAppt(appt2);
					}				   
				}
				 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			        if((iteration%10000)==0 && iteration!=0 )
			              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
			 
			}
		}catch(NullPointerException e){
			
		}
	 
		 System.out.println("Done testing...");
	 }


	
}
