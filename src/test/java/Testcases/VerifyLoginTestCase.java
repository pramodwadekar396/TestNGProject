package Testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjectmodel.LoginPage;
import Resources.BaseClass;

public class VerifyLoginTestCase extends BaseClass {

	@Test
	public void login() throws IOException {
		
		LaunchBrower();
		driver.get("https://login.salesforce.com/?locale=in");
		
		LoginPage LPO = new LoginPage(driver);
		
		LPO.EnterUsername().sendKeys("Rahul");

		LPO.EnterPassword().sendKeys("123");
		
		LPO.Login().click();
		
		
		
		
	}

}
