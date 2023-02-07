package JIRAAPI;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostIssueJIRA {
	
	@Test
	
	public void getIssueJIRA() {
		
		RestAssured.baseURI="https://janrestapimona2023.atlassian.net/rest/api/2";
		
		RestAssured.authentication=RestAssured.preemptive().basic("rajmonapraveen@gmail.com","ATATT3xFfGF0E1ch0h4Xbofg8DWK_NSCkdNK-1wiOacD_QUcbtgr93SrMeswwJ2CSZ671KNvJnAnO9FPT2nfIFi-w4Jq2VNqb1iMWcSvSitUXnfx-F5Yp2AezQROkp5OpHYnfg6cZHOLwKOjNzdcIAPukmaXU_xl8rFFbiV6iHaFGJWGAQX-yxQ=6F586059");
		
		RequestSpecification requestspecification=RestAssured.given()
				.contentType("application/json")
				.when()
				.body("{\r\n"
						+ "    \"fields\": {\r\n"
						+ "        \"project\": {\r\n"
						+ "            \"key\": \"TES\"\r\n"
						+ "        },\r\n"
						+ "        \"summary\": \"create issue in RA1 project\",\r\n"
						+ "        \"description\": \"Creating of an issue using project keys and issue type names using the REST API\",\r\n"
						+ "        \"issuetype\": {\r\n"
						+ "            \"name\": \"Bug\"\r\n"
						+ "        }\r\n"
						+ "    }\r\n"
						+ "}");
		
		Response response = requestspecification.post("/issue");
		
		System.out.println("Status Code : " + response.getStatusCode());
		response.prettyPrint();
	}

}
