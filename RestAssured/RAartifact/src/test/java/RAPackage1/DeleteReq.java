package RAPackage1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteReq {

	
	@Test
	
	public void DeleteChangeReq() {
		
		RestAssured.baseURI = "https://dev144453.service-now.com/api/now/table";
		
		RestAssured.authentication=RestAssured.basic("admin","1t+ReKZ2woG*");
		
		RequestSpecification inputRequest = RestAssured.given();
		
	
		
		Response response = inputRequest.delete("/change_request/85b37db61b3021107df3fcc8cc4bcb3c");
				System.out.println(response.getStatusCode());
		response.prettyPrint();
				

		
	}
}
