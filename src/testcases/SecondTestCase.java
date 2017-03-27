package testcases;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assume;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SecondTestCase {

	public static boolean checkLogin(){
		return false; //if login fails
		//true - if login is successful
		
	}
	
	@BeforeClass
	public static void begin(){
		System.out.println("**************Beginning***************");
		//Assume.assumeTrue(checkLogin()); 
		//if the parameter of assumetrue() function is false, then all the tests will be skipped.
	}
	
	@AfterClass
	public static void end(){
		System.out.println("**************Ending***************");
	}
	
	@Before
	public void openBrowser(){
		//open the browser - selenium code
		System.out.println("Opening the browser");
	}
	
	@Test
	public void sendemailTest()
	{
		System.out.println("Send an email to user");
	}
	
	@Test
	public void sendSMSTest()
	{
		System.out.println("Send an SMS to user");
	}
	
	@After
	public void closeBrowser(){
		//close the browser - selenium code
		System.out.println("Closing the browser");
		
	}
}
