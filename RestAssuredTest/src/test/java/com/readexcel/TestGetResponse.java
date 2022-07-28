package com.readexcel;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestGetResponse {
//	  @Test
	public void getUserResponse() {
		  
		RestAssured.baseURI = "https://reqres.in";
		
		RequestSpecification given = RestAssured.given();
		Response response = given.request(Method.GET, "api/users/2");
		System.out.println(response.getStatusCode());
		Assert.assertEquals(response.getStatusCode(), 200);
		System.out.println(response.getBody().asString());
		System.out.println(response.getTime());
		System.out.println(response.getHeader("Content-Type"));
		//	  https://reqres.in/api/users/2
	}

	  @Test
	public void addUserResponse() {
		  
		RestAssured.baseURI = "https://reqres.in";

		RequestSpecification given = RestAssured.given();
		JSONObject reqParam = new JSONObject();
		reqParam.put("name", "Raj Gaurav");
		reqParam.put("job", "leader");
		given.header("Content-Type", "application/json");
		given.body(reqParam.toJSONString());
		Response response = given.request(Method.POST, "/api/users");
		System.out.println(response.getBody().asString());
	}

//	@Test
//	public void testSSL() {
//		RequestSpecification given = RestAssured.given();
//		given.relaxedHTTPSValidation().when().get("https://www.bupa.com.au/").then().statusCode(200);
//
//		Response resp = given.request(Method.GET,"https://www.bupa.com.au/");
//		System.out.println(resp.getBody().asString());
//		System.out.println(resp.getStatusCode());
//
//
//
//		//		https://www.bupa.com.au/
//	}
//
//
//	//	@Test
//	public void testOUath() {
//
//		RestAssured.baseURI = "https://svn.apache.org";
//		Response postResp = RestAssured.given().auth().oauth2("jwpEZSI0r5g7o6JNLdcqU5B59fs1PpNi2SY8mfer3gQQmErq-PcEJOmRrTXMIJxJmkqfD0t0")
//				.post("https://www.oauth.com/playground/authorization-code.html");
//		System.out.println(postResp.getStatusCode());
//		System.out.println(postResp.getBody().asString());
//
//	}
//
//	//  https://svn.apache.org/repos/asf/airavata/sandbox/xbaya-web/test/Calculator.wsdl
//
//	//  @Test
//	public void testXMLResponse() {
//
//		RestAssured.baseURI = "https://svn.apache.org";
//		RequestSpecification given = RestAssured.given();
//
//		Response response = given.request(Method.GET, "/repos/asf/airavata/sandbox/xbaya-web/test/Calculator.wsdl");
//		System.out.println(response.asString());
//	}

}
