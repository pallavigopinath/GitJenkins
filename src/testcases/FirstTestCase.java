package testcases;

import org.junit.Ignore;
import org.junit.Test;

public class FirstTestCase {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

		@Test 
		public void loginTest(){
		
			//selenium code for the actual testing
			System.out.println("User login");
			
		}
		
		
		@Test
		public void registerTest(){
			System.out.println("Registering a user");
			
		}
		
		@Ignore
		@Test 
		public void database(){
			System.out.println("Database testing");
		}
		
		
	//}

}
