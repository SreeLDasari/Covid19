package model.response;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import model.spec.SpecFactory;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.testng.Assert;
import static org.hamcrest.Matchers.*;


public class RestResponse{

	private Response response;
	private RequestSpecification request= RestAssured.given();

	public RestResponse(Response response){
		this.response=response;

	}

	public RequestSpecification Contentype() {
		return request.header("Content-Type", "application/json");
	}

	public Response getResponse() {
		return response;
	}

	public int getStatusCode() {
		return get().getStatusCode();
	}
	public String getContent() {
		return get().getContentType();
	}

	public Response doGetReq() {
		return given()
				.when()
				.get();
	}

	public void expectHeadersSatuscode() {
		given()
		.when()
		.get()
		.then()
		.spec(SpecFactory.getGenericResponseSpec()).log().all();

	}

	public void verifyDistrictWiseData() {
		given()
		.when()
		.queryParam("Andhra Pradesh","Prakasam")
		.get()
		.then()
		.body("active",equalTo(38),"confirmed",equalTo(62206),"deceased",equalTo(580)
				,"recovered",equalTo(61588))
		.statusCode(200);

	}
	public void verifyJsonResponse() throws IOException {
		String expected=new String(Files.readAllBytes(Paths.get(System.getProperty("user.dir")+
				File.separator+"file.txt")));
		String actual=given().when().get().asString();
		Assert.assertEquals(actual, expected);

	}

}
