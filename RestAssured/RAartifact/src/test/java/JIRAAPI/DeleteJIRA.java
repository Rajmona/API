package JIRAAPI;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteJIRA {

	
	@Test
	public void getDeleteJIRA() 
		{
			
			RestAssured.baseURI="https://janrestapimona2023.atlassian.net/rest/api/2";
			
			RestAssured.authentication=RestAssured.preemptive().basic("rajmonapraveen@gmail.com","ATATT3xFfGF0E1ch0h4Xbofg8DWK_NSCkdNK-1wiOacD_QUcbtgr93SrMeswwJ2CSZ671KNvJnAnO9FPT2nfIFi-w4Jq2VNqb1iMWcSvSitUXnfx-F5Yp2AezQROkp5OpHYnfg6cZHOLwKOjNzdcIAPukmaXU_xl8rFFbiV6iHaFGJWGAQX-yxQ=6F586059");
			
			RequestSpecification requestspecification=RestAssured.given()
					.contentType("application/json")
					.when()
					.body("{\r\n"
							+ "    \"fields\": {\r\n"
							+ "\r\n"
							+ "        \"description\": \"Update Using REST API for testing\"\r\n"
							+ "    }\r\n"
							+ "}\r\n"
							+ "");
			
			Response response = requestspecification.delete("/issue/10072");
			
			System.out.println("Status Code : " + response.getStatusCode());
			response.prettyPrint();
		}

	}