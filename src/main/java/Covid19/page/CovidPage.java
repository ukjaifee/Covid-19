package Covid19.page;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CovidPage {

	private WebDriver driver;
	private WebDriverWait wait;

	@FindBy(xpath = "//div[@class='row']/div[3]")
	private List<WebElement> rows;
	private List<String> data;

	public CovidPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 20);
		PageFactory.initElements(driver, this);
	}

	public List<String> getDataFromRows() {
		wait.until(ExpectedConditions.visibilityOfAllElements(rows));

		data = rows.stream().map(el -> el.findElement(By.tagName("div")).getText()).collect(Collectors.toList());

		Collections.reverse(data);
		
		System.out.println(data);

		return data;

	}
	
	
	
     
}
