package testcases;

import java.util.Arrays;

public class Collections_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Object[][] data=new Object[2][3];
		data[0][0]="User1";
		data[0][1]="password1";
		data[0][2]=98007;
		
		data[1][0]="User2";
		data[1][1]="password2";
		data[1][2]=98004;
		
		Arrays.asList(data);
		
	}

}
