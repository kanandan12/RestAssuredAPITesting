import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class TC001_GET_Request {
	
	@Test
	void getPlaceDetails() {
		
		//Specify Base URI
		RestAssured.baseURI = "https://rahulshettyacademy.com/maps/api/place/get/json";
				
		//Request object
		RequestSpecification httpRequest = RestAssured.given();
		
		//Response Object
		Response response = httpRequest.request(Method.GET,"qaclick123");
				
		/*Response response = given().queryParam("key","qaclick123")
        .queryParam("place_id","d3689a4d7a7ed0d8ab97535cb8036e2e")
        .when().get("https://rahulshettyacademy.com/maps/api/place/get/json").then().log().body();
        */
		
		String responseBody=response.getBody().asString();
		System.out.println("Response Body: " +responseBody);
		
		//status code verification
		int statusCode=response.getStatusCode();
		System.out.println("Status Code: " +statusCode);
		Assert.assertEquals(statusCode, 200);
		
		//status line verification
		String statusLine=response.statusLine();
		System.out.println("Status Line: " +statusLine);
		Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
		
	}

}
