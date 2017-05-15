package Module1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	@Test(dataProvider="getdata")
	public void Login(String U,String p,String P,String Br){
//System.out.println(username+"---"+Password);
}
@DataProvider(name="RegData")
public Object[][] getdata(){
	Object[][] obj=new Object[3][4];

	obj[0][0]="U1";
	obj[0][1]="Password";
	obj[0][2]="pass";
	obj[0][3]="Mozilla";
	
	obj[1][0]="U2";
	obj[1][1]="Password";
	obj[1][2]="pass";
	obj[1][3]="Chrome";
	
	obj[2][0]="U3";
	obj[2][1]="P3";
	obj[2][2]="Fail";
	obj[2][3]="IE";
	
	return obj;	
	
	
}
}