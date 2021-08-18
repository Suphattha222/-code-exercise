package com.excersice;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class api {

	@Test
	public void Test_Get() {
		
	RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
	RequestSpecification httprequest = RestAssured.given();
	
	Response response = httprequest.request(Method.GET,"/employee/1");
	
	System.out.println(response.getBody().asString());
	
	Assert.assertEquals(response.getStatusCode(), 200);
}
	
	@Test
	public void Test_Delete() {
		
	RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
	RequestSpecification httprequest = RestAssured.given();
	
	Response response = httprequest.request(Method.DELETE,"/delete/2");
	
	System.out.println(response.jsonPath().get("message").toString());

}
	
}
