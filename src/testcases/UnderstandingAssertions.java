package testcases;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class UnderstandingAssertions {

	@Rule
	public ErrorCollector errCollector = new ErrorCollector();
	
	@Test
	public void FBFriendListTest(){
		int Actual_NoOf_Friends=100; //value is extracted from selenium code and not hard coded
		int Expected_NoOf_Friends=1000; //value got from test document i.e xlxs 
		
		/*if(Actual_NoOf_Friends==Expected_NoOf_Friends){
			System.out.println("Pass");
		}else{
			System.out.println("Fail");
		}*/
		
		System.out.println("A");
		try{
		Assert.assertEquals(Expected_NoOf_Friends, Actual_NoOf_Friends);
		System.out.println("Pass");
		} catch(Throwable t){
			System.out.println("ERROR ENCOUNTERED IN THE TESTCASE");
			errCollector.addError(t);
		}
		System.out.println("B");
		
		try{
			Assert.assertEquals("A", "B");
			System.out.println("Pass");
			} catch(Throwable t){
				System.out.println("ERROR ENCOUNTERED IN THE TESTCASE");
				errCollector.addError(t);
			}
		
		try{
			Assert.assertEquals("A", "A");
			System.out.println("Pass");
			} catch(Throwable t){
				System.out.println("ERROR ENCOUNTERED IN THE TESTCASE");
				errCollector.addError(t);
			}
		
	}
	
}
