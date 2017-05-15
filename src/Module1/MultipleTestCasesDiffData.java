package Module1;

import org.testng.annotations.Test;

public class MultipleTestCasesDiffData {
@Test(priority=1,dataProviderClass=DataProviderForMutilpleTestcases.class,dataProvider="MultiTestCasesData")
	
	public void testA(String username,String pswd){
		
	}
	@Test(priority=2,dataProviderClass=DataProviderForMutilpleTestcases.class,dataProvider="MultiTestCasesData")
	public void testB(String username,String pswd,String mail){
		
	}
	

}