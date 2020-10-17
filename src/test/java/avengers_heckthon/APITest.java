package avengers_heckthon;

import static com.jayway.restassured.RestAssured.given;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.testng.Assert;
import org.testng.annotations.Test;

import api.covid.Data;
import api.covid.Statewise;
import io.restassured.RestAssured;

public class APITest {
	
	@Test
	public void apiCovidTest() {
	
		String baseURI = RestAssured.baseURI = "https://api.covid19india.org/data.json";
		RestAssured.useRelaxedHTTPSValidation();
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

}
