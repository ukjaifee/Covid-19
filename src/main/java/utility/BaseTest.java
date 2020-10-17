package utility;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;



public class BaseTest {


	protected static WebDriver driver;

	@Parameters({ "browserName" })
	@BeforeTest
	public void getDriver(String browserName) {
		driver = DriverFactory.getDriver(browserName);
		driver.manage().window().maximize();

	}
	
	
}
