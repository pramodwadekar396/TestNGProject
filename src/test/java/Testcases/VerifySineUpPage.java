package Testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjectmodel.LoginPage;
import Resources.BaseClass;

public class VerifySineUpPage extends BaseClass {
	
	@Test
	public void sineUp() throws IOException, InterruptedException {
		LaunchBrower();
		driver.get("https://login.salesforce.com/");
		
		LoginPage LPO = new LoginPage(driver);
		Thread.sleep(1000);
		
		LPO.TryFree().click();
		
		
		
	}
	

}
