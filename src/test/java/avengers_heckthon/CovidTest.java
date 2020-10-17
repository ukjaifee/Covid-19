package avengers_heckthon;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Covid19.page.CovidPage;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utility.BaseTest;

import api.covid.Data;
import api.covid.Statewise;

import java.util.*;
import java.util.stream.Collectors;

import static com.jayway.restassured.RestAssured.given;


import api.covid.Data;
import api.covid.Statewise;

import java.util.*;
import java.util.stream.Collectors;

import static com.jayway.restassured.RestAssured.given;

public class CovidTest extends BaseTest {

	private CovidPage covidPage;

	@BeforeTest()
	public void intializeCovidPage() {

		covidPage = new CovidPage(driver);
	}

	@Test
	public void apiCovidTest() {

		String baseURI = RestAssured.baseURI = "https://api.covid19india.org/data.json";
		com.jayway.restassured.specification.RequestSpecification httpRequest = given();
		com.jayway.restassured.response.Response response = httpRequest.request().get(baseURI);
		Assert.assertEquals(response.statusCode(), 200);
		Data data = response.as(Data.class);
		List<Statewise> activeStateWise = data.getStatewise();
		Map<String, String> activeMap = activeStateWise.stream().collect(Collectors.toMap(Statewise::getState,
				Statewise::getActive, (oldValue, newValue) -> oldValue, LinkedHashMap::new));
		System.out.println(activeMap);

		List<Statewise> confirmedStateWise = data.getStatewise();
		Map<String, String> confirmedMap = confirmedStateWise.stream().collect(Collectors.toMap(Statewise::getState,
				Statewise::getConfirmed, (oldValue, newValue) -> oldValue, LinkedHashMap::new));
		System.out.println(confirmedMap);
		String state = activeMap.get((activeMap.keySet().toArray())[0]);
		System.out.println(state);
	}

	@Test
	public void verifyCovidData() {
		driver.get("https://www.covid19india.org/");
		covidPage.getDataFromRows();
	}

	@AfterTest
	public void closeBrowser() {
		driver.quit();

	}
}
