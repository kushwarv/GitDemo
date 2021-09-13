package stepDefinations;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefination {
	@Given("^user is on landing page$")
	public void user_is_on_landing_page() {
		
	System.out.println("user is naviagted");
	}
	
@When("^user login in application with \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_login_in_application_with_and_password(String arg1, String arg2) throws Throwable {
	    System.out.println(arg1);
	    System.out.println(arg2);
	}
@Then("^home page is dispayed$")

public void home_page_is_dispayed() {
	
}
@Then("^cards are dislayed \"([^\"]*)\"$")
public void cards_are_dislayed(String arg1) throws Throwable {
    System.out.println(arg1);
}


}

