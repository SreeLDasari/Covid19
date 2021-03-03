package model.spec;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class SpecFactory {


	public static RequestSpecification getGenericRequestSpec() {

		RequestSpecBuilder requestSpec;
		RequestSpecification requestSpecification;

		requestSpec = new RequestSpecBuilder();

		requestSpecification = requestSpec.setContentType("application/json;charset=UTF-8").build();

		return requestSpecification;

	}
	public static ResponseSpecification getGenericResponseSpec() {

		ResponseSpecBuilder responseSpec;
		ResponseSpecification responseSpecification;

		responseSpec = new ResponseSpecBuilder();
		responseSpec.expectHeader("Content-Type","application/json; charset=utf-8");
		responseSpec.expectHeader("Content-Encoding","gzip");
		responseSpec.expectHeader("Connection","keep-alive");
		responseSpec.expectHeader("Content-Length","17991");
		responseSpec.expectHeader("Server","GitHub.com");
		responseSpec.expectHeader("Strict-Transport-Security","max-age=31556952");
		responseSpec.expectHeader("Access-Control-Allow-Origin","*");
		responseSpec.expectHeader("last-modified","Wed, 03 Mar 2021 07:17:57 GMT");
		responseSpec.expectHeader("Cache-Control","max-age=600");
		responseSpec.expectHeader("Accept-Ranges","bytes");


		responseSpecification = responseSpec.build();


		return responseSpecification;

	}

}
