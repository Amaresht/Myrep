package Module1;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProviderForMutilpleTestcases {
	@DataProvider(name="MultiTestCasesData")
	
	public Object getdata(Method m){
		Object[][] data=null;
		if(m.getName().equals("testA")){
		 data=new Object[2][2];
		data[0][0]="U1";
		data[0][1]="p1";
		
		data[1][0]="U2";
		data[1][1]="p2";
		}else if(m.getName().equals("testB")){
			data=new Object[2][3];
			data[0][0]="U5";
			data[0][1]="p5";
			data[0][2]="abc@gmail.com";
			
			data[1][0]="U9";
			data[1][1]="p9";
			data[1][2]="xyz@gmail.com";
			
		}
		return data;
				
	}
}