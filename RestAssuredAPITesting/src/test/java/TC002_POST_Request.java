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
					
		// Request payload sending along with post request
		JSONObject requestParams = new JSONObject();
		
		requestParams.put("place_id", "de984fbc65821505f07ecea134e344d5");
		requestParams.put("address", "19, side layout, cohen 09");
		requestParams.put("key", "qaclick123");
		
		//Specify Base URI
		RestAssured.baseURI = "https://rahulshettyacademy.com/maps/api/place/get/json";
		
		RestAssured
			.given()
				.header("Content-Type", "application/json")
				.body(requestParams.toJSONString())
				.post("qaclick123")
			.then().statusCode(200);
		
		
		
		
		
	}

}
