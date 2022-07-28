package com.readexcel;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class FlyAwayAssured {
//	  @Test
	public void getUserResponse() {
		  
		RestAssured.baseURI = "http://localhost:8080";
		
		RequestSpecification given = RestAssured.given();
		Response response = given.request(Method.GET, "/login");
		System.out.println(response.getStatusCode());
		Assert.assertEquals(response.getStatusCode(), 200);
		System.out.println(response.getBody().asString());
		System.out.println(response.getTime());
		System.out.println(response.getHeader("Content-Type"));
		//	  https://reqres.in/api/users/2
	}

	  @Test
	public void addUserResponse() {
		  
		RestAssured.baseURI = "http://localhost:8080";

		RequestSpecification given = RestAssured.given();
		JSONObject reqParam = new JSONObject();
		reqParam.put("name", "Raj Gaurav");
		reqParam.put("job", "leader");
		given.header("Content-Type", "application/html");
		given.body(reqParam.toJSONString());
		Response response = given.request(Method.POST, "/login");
		System.out.println(response.getBody().asString());
	}


}
