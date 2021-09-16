package restassuredtest;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ExtractJSONEx {

	@Test
	void test1() {
		
//		RestAssured.baseURI="https://api.thecatapi.com";
//		RestAssured.basePath="/v1/images/search";
//		Response response = given().contentType(ContentType.JSON).log().all().get("/99");
//		response.prettyPrint();
//		
//		given().when().get("https://api.thecatapi.com/v1/images/search").then().log().all();
		
		
		RequestSpecification requestSpec = RestAssured.given();
		
		Response response = requestSpec.get("https://api.thecatapi.com/v1/images/search");
		response.prettyPrint();
		
	}
	
}
