import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class TC001_GET_Request {
	
	@Test
	void getPlaceDetails() {
		
		//Specify Base URI
		RestAssured.baseURI = "https://rahulshettyacademy.com/maps/api/place/get/json";
		
		ValidatableResponse response = RestAssured
				.given()
					.param("", "")
					.header("","")
				.when()
					.get("qaclick123")
				.then()
					.statusCode(200);
		
		/*
		 * //Request object RequestSpecification httpRequest = RestAssured.given();
		 * 
		 * //Response Object Response response =
		 * httpRequest.request(Method.GET,"qaclick123");
		 * 
		 * 
		 * 
		 * String responseBody=response.getBody().asString();
		 * System.out.println("Response Body: " +responseBody);
		 * 
		 * //status code verification int statusCode=response.getStatusCode();
		 * System.out.println("Status Code: " +statusCode);
		 * Assert.assertEquals(statusCode, 200);
		 * 
		 * //status line verification String statusLine=response.statusLine();
		 * System.out.println("Status Line: " +statusLine);
		 * Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
		 */
		
	}

}
