package PageObjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	
	private By userName=By.xpath("//input[@id='username']");
	private By Password=By.xpath("//input[@id='password']");
	private By Login=By.xpath("//input[@id='Login']");
	private By TryFree=By.xpath("//a[@id='signup_link']");
	
	////a[@id='signup_link']
	
	public LoginPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver2;
		
	}

	public WebElement EnterUsername() {
		
		return driver.findElement(userName);
		
	}
	
	public WebElement EnterPassword() {
		return driver.findElement(Password);
		
	}
	
	
	public WebElement Login() {
		return driver.findElement(TryFree);
		
	}

	public WebElement TryFree() {
		return driver.findElement(TryFree);
		
	}

}
