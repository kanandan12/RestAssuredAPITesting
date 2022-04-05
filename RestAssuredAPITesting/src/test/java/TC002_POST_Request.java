import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class TC002_POST_Request {
	
	@Test
	void addPlaceDetails() {
		
		//Specify Base URI
		RestAssured.baseURI = "https://rahulshettyacademy.com/maps/api/place/get/json";
				
		//Request object
		RequestSpecification httpRequest = RestAssured.given();
		
		// Request payload sending along with post rquest
		JSONObject requestParams = new JSONObject();
		
		//requestParams.put("accuracy", "50");
		//requestParams.put("name", "Secondline house");
		requestParams.put("place_id", "de984fbc65821505f07ecea134e344d5");
		requestParams.put("address", "19, side layout, cohen 09");
		requestParams.put("key", "qaclick123");
		
		//requestParams.put("phone_number", "(+91) 983 123 5467");
		//requestParams.put("types", "Shoe Shop");
		
		httpRequest.header("Content-Type", "application/json");
		
		httpRequest.body(requestParams.toJSONString());
		
		//Response Object
		Response response = httpRequest.request(Method.POST,"qaclick123");
		
		String responseBody=response.getBody().asString();
		System.out.println("Response Body: " +responseBody);
				
		//status code verification
		int statusCode=response.getStatusCode();
		System.out.println("Status Code: " +statusCode);
		Assert.assertEquals(statusCode, 200);
		
		//sucesscode validation
		String sucesscode = response.jsonPath().get("place_id");
		System.out.println("sucess Code: " +sucesscode);
		Assert.assertEquals(statusCode, "OK");
		
	}

}
