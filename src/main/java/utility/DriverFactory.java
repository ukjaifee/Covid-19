package utility;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	private static WebDriver driver;
	private static final Supplier<WebDriver> chrome=()->{
		WebDriverManager.chromedriver().setup();
		return driver= new ChromeDriver();
		
	};
	
	private static final Map<String, Supplier<WebDriver>> MAP=new HashMap<>();
	
	static{
		
		MAP.put("chrome", chrome);
		
	}
	
	public static WebDriver getDriver(String browserName){
		return MAP.get(browserName).get();
		
	
	}
	
	
	
}
