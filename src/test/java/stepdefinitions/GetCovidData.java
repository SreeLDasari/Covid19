package stepdefinitions;

import java.io.IOException;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import model.response.RestResponse;

public class GetCovidData {
	Response response;
	RestResponse rest=new RestResponse(response);
	@Given("Data of all the Covid in the country")
	public void data_of_all_the_covid_in_the_country() {
		rest.getContent();
		try {
			rest.verifyJsonResponse();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@When("I get the details of all states in India")
	public void i_get_the_details_of_all_states_in_india() {
		rest.doGetReq();
	}

	@Then("Covid details should be displayed with status code {int}")
	public void covid_details_should_be_displayed_with_status_code(int expected) {
		int actual=rest.getStatusCode();
		Assert.assertEquals(expected, actual);
	}
	@Then("Verify the headers and log the data")
	public void verify_the_headers_and_log_the_data() {
		//rest.expectHeadersSatuscode();
	}
	@Then("Verify District data")
	public void verify_district_data() {
		rest.verifyDistrictWiseData();
	}

}
