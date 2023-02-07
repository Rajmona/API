package RAPackage1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PutClass {

	
	@Test
	
	public void putChangeReq() {
		
		RestAssured.baseURI = "https://dev144453.service-now.com/api/now/table";
		
		RestAssured.authentication=RestAssured.basic("admin","1t+ReKZ2woG*");
		
		RequestSpecification inputRequest = RestAssured.given()
				.contentType("application/JSON")
				.accept("application/xml")
				.queryParam("sysparm_fields","sys_id,short_description,description")
		        .when().body("{\r\n"
		        		+ "    \"short_description\": \"Test Short Assignment des updated\",\r\n"
		        		+ "        \"description\": \"Test Assignment description updated\"\r\n"
		        		+ "}");
	
		
		Response response = inputRequest.put("/change_request/85b37db61b3021107df3fcc8cc4bcb3c");
				System.out.println(response.getStatusCode());
		response.prettyPrint();
				

		
	}
}
