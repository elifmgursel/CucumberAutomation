package Steps;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {

    @Given("^Go to Amazon website$")
    public void go_to_Amazon_website() throws Throwable {
        System.out.println("Open Amazon Website");
    }

    @Given("^Click on login button$")
    public void click_on_login_button() throws Throwable {
        System.out.println("Click Login");
    }

    @Given("^Enter your username$")
    public void enter_your_username() throws Throwable {
        System.out.println("Enter username");
    }

    @Given("^Enter your password$")
    public void enter_your_password() throws Throwable {
        System.out.println("Enter password");
    }

    @When("^Click on submit button$")
    public void click_on_submit_button() throws Throwable {
        System.out.println("Click submit");
    }

    @Then("^Verify the success message$")
    public void verify_the_success_message() throws Throwable {
        System.out.println("Verify success");
    }
}
