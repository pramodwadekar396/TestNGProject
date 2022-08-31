package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public WebDriver driver;
	
	
	public WebDriver LaunchBrower() throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\ADMIN\\eclipse-workspace\\TestFramework\\src\\main\\java\\Resources\\data.properties");
		
		Properties prop= new Properties();
		
		prop.load(fis);
		
		String browserName = prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Desktop\\Chrome driver\\chromedriver.exe");
	         driver = new ChromeDriver();
	        
		}
		else
		{
			//no browser 
		}
		
		return driver;
		
	}

}
