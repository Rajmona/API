package RAPackage1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RAClass1 {

	
	@Test
	
	public void getChangeReq() {
		
		RestAssured.baseURI = "https://dev144453.service-now.com/api/now/table";
		
		RestAssured.authentication=RestAssured.basic("admin","1t+ReKZ2woG*");
		
		RequestSpecification inputRequest = RestAssured.given()
				.contentType("application/JSON")
				.queryParam("sysparm_fields","sys_id,short_description,description")
		        .when().body("{\r\n"
		        		+ "    \"short_description\": \"Test Short Assignment des\",\r\n"
		        		+ "        \"description\": \"Test Assignment description created\"\r\n"
		        		+ "}");
	
		
		Response response = inputRequest.post("/change_request");
				System.out.println(response.getStatusCode());
		response.prettyPrint();
				

		
	}
}
