package learning;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SampleGetRequest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String URL = "https://www.google.com";

		//http://www.google.com
		Response response = RestAssured.get(URL);
		int statusCode = response.statusCode();
		String statusLine = response.statusLine();
		
		System.out.println(statusCode);
		System.out.println(statusLine);
		
		System.out.println("Outputmessage");


	}

}
