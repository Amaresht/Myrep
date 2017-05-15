package Module1;

import org.testng.annotations.Test;

public class DataProviderFromOtherClass {
	@Test(dataProviderClass=DataProviderDynamic.class,dataProvider="RegData")
	public void RestData(String username,String passwd, String mail){
		
	}

}