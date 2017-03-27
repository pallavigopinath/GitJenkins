package testcases;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

//Step 1 - use @RunWith annotation
@RunWith(Parameterized.class) 

public class ParameterizedTest {

	//Step 2 - declare the test parameters at the global level
	String username;
	String password;
	int zip;
	
	//Step 3 - initialize the test parameters using constructor
	public ParameterizedTest(String username, String password, int zip){
		this.username=username;
		this.password=password;
		this.zip=zip;
	}
	
	//Step 4 - provide the values of the test parameters using Object array
	@Parameters
	public static Collection<Object[]> getData(){
		//No. of rows=Number of times the testcase to be executed
		//No. of columns=number of parameters
		
		Object[][] data =new Object[3][3];
		data[0][0]="User1";
		data[0][1]="password1";
		data[0][2]=98007;
		
		data[1][0]="User2";
		data[1][1]="password2";
		data[1][2]=98004;
		
		data[2][0]="User3";
		data[2][1]="password3";
		data[2][2]=98052;
		
		return Arrays.asList(data);
		
	}
	
	@Test
	public void registerUserTest()
	{
		System.out.println("Testing user registration:"+ username + "---"+ password + "---"+ zip);
	}
}
