package Cucumber_New;

import HRM.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class MyHRMStepDefs extends Utils{
    HomePage homePage = new HomePage();

    @Given("^user should be on login page$")
    public void userShouldBeOnLoginPage()  {
        homePage.getUrl();

    }

    @When("^user enter invalid \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userEnterInvalidAnd(String uname, String pward)  {
        homePage.enterLogInCredentials(uname,pward);

    }

    @And("^click on login button$")
    public void clickOnLoginButton() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^user should not able to log in with \"([^\"]*)\"$")
    public void userShouldNotAbleToLogInWith(String Errormassage)  {
        Assert.assertEquals(driver.findElement(By.id("spanMessage")).getText(),Errormassage);
        System.out.println("hello");
        //homePage.errorMassage(Errormassage);

    }
}
