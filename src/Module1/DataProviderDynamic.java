package Module1;

import org.testng.annotations.DataProvider;

public class DataProviderDynamic {

	@DataProvider(name="RegData")
	public Object[][] getdata(){
		Object[][] data=new Object[2][3];
		data[0][0]="U1";
		data[0][1]="P1";
		data[0][2]="xyz@gmail.com";
		
		data[1][0]="U2";
		data[1][1]="p2";
		data[1][2]="abc@gmail.com";
		
		return data;
}

}