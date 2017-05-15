package Module1;

import org.testng.annotations.Test;

public class TestNG {

	  @Test(priority=1,dataProviderClass=DataProviderDynamic.class,dataProvider="RegData")
	  public void testLogin(String username,String pswd,String mail) {
		 // Assert.assertEquals("A", "B");
		  System.out.println("Login Test is passed");
	  }
	  @Test (priority=2,dependsOnMethods={"testLogin"})
	  public void ChangePassword(){
		  System.out.println("change password is successfully completed");
	  }
	  @Test(priority=2,dependsOnMethods={"testLogin","ChangePassword"})
	  public void Logout(){
		  System.out.println("Successfully Log Out");
	  }
	  
	}