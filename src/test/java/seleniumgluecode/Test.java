package seleniumgluecode;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.table.*;	
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.collect.Table;

import org.junit.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Test {

	@Given("^google maps url$")
	public void google_maps_url(DataTable table) throws Throwable {
		 
		List<List<String>> data= table.raw(); 
		System.out.println(data.get(0).toString());
	    
	    throw new PendingException();
	}

	@When("^user navigates to google maps$")
	public void user_navigates_to_google_maps() throws Throwable {
	   


	    throw new PendingException();
	}

	@Then("^successful opening of google maps$")
	public void successful_opening_of_google_maps() throws Throwable {


		
	    throw new PendingException();
	}




	
	
}
