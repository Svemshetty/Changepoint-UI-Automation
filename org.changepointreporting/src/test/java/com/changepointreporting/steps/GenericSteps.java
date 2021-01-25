package com.changepointreporting.steps;

//import org.changepointreporting.framework.BaseClass;

import io.cucumber.java.en.*;

public class GenericSteps {
	
	//BaseClass bc;
	
//	public GenericSteps() {
//		
//	}
	
	//public GenericSteps(BaseClass bc) {
	//	this.bc = bc;		
	//}
	@Given("^User open BROWSER$")
	public void user_open_BROWSER() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}

	@When("^User navigates to URL$")
	public void user_navigates_to_URL() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}

	@Then("^Page title should be \"([^\"]*)\"$")
	public void page_title_should_be(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}


	
//	@Given("^User open (.*)$")
//	public void openBrowser(String browserName) {	
//		//bc.openBrowser(browserName);
//		System.out.println("Opening Browser "+ browserName);
//		
//	}
//	
//	@When("^User navigates to (.*)$")
//	public void navigate(String url) {
//		System.out.println("Navigating to "+ url);
//		
//	}
//	
//	@Then("^Page title should be \"([^\"]*)\"$")
//	public void page_title_should_be(String arg1) throws Throwable {
//	   //homePage.verifyHomePageTitle();
//	}

}
