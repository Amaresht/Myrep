package Module1;

import org.testng.annotations.Test;

public class DatagetingformOtherProgram {
	
		@Test(dataProviderClass=Dataprovider.class,dataProvider="RegData")
		public void Login(String U,String p,String P,String Br){

}
}
