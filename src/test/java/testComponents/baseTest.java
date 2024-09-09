package testComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.homePage;

public class baseTest {
	WebDriver driver;
public homePage homepage;
@BeforeMethod
public void init() throws IOException
{
	initialise();
	homepage =new homePage(driver);
}
	
	public void initialise() throws IOException
	{
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\resources\\globaldata.properties");
		prop.load(fis);
		String browser = prop.getProperty("browser");

		if (browser.contains("chrome")) {
			
			WebDriverManager.chromedriver().setup();;
			
			driver = new ChromeDriver();
			
		}
		else if(browser.contains("firefox")) 
		{
			//
			}
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
	}
	@AfterMethod
public void TearDown()
{
	driver.quit();
}
}
