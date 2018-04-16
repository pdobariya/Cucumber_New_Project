package Cucumber_New;

import Nop_Commerce.*;
import HRM.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SerchNPCstepDefs extends Utils{
    HomePage homePage = new HomePage();
    Book_Page book_page = new Book_Page();
    ShopingCart_Page shopingCart_page = new ShopingCart_Page();
    CheckOutAsAGuest_Page checkOutAsAGuest_page = new CheckOutAsAGuest_Page();
    Confirm_CheckOut_Page confirm_checkOut_page = new Confirm_CheckOut_Page();
    Billing_Address_Page billing_address_page = new Billing_Address_Page();
    Shiping_Method_Page shiping_method_page = new Shiping_Method_Page();
    Payment_Info_Page payment_info_page = new Payment_Info_Page();
    Payment_Method_Page payment_method_page = new Payment_Method_Page();

    Nop_Commerce nop_commerce = new Nop_Commerce();
    @Given("^User on home page$")
    public void user_on_home_page()  {
    }
    @When("^User enter \"([^\"]*)\" name in serch box$")
    public void user_enter_name_in_serch_box(String arg1)  {
        nop_commerce.serch_Product();
        }
    @Then("^user able to serch the product$")
    public void user_able_to_serch_the_product()  {
        }

    @Given("^User should be on book page$")
    public void userShouldBeOnBookPage()  {
        nop_commerce.getUrl();

    }
    @When("^User click on add to cart button of first book And shoping Cart$")
    public void userClickOnAddToCartButtonOfFirstBookAndShopingCart()  {
        book_page.addToCart();
    }

    @And("^User click on I agree with Terms of service And checkOut button$")
    public void userClickOnIAgreeWithTermsOfServiceAndCheckOutButton()  {
        shopingCart_page.shopingCart();
    }

    @And("^click on checkOut as guest$")
    public void clickOnCheckOutAsGuest()  {
        checkOutAsAGuest_page.checkOutAsAGuest();
    }

    @And("^Fill The all details of billing address and click on countinue$")
    public void fillTheAllDetailsOfBillingAddressAndClickOnCountinue()  {
        billing_address_page.billingAddress();
    }

    @And("^click on continue$")
    public void clickOnContinue()  {
        shiping_method_page.shipingMethod();
    }

    @And("^select the credit card and click on countinue$")
    public void selectTheCreditCardAndClickOnCountinue()  {
        payment_method_page.payMentMethod();
    }

    @And("^fill the all credit card details and click on countinue$")
    public void fillTheAllCreditCardDetailsAndClickOnCountinue()  {
        payment_info_page.paymentInformation();
    }

    @And("^click On confirm$")
    public void clickOnConfirm() {
        confirm_checkOut_page.confirmCheckOut();
    }

    @Then("^User can see This msg 'Your order has been successfully processed!'$")
    public void userCanSeeThisMsgYourOrderHasBeenSuccessfullyProcessed()  {
        WebDriverWait wait = new WebDriverWait(driver,30);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//strong")));
        Assert.assertEquals(driver.findElement(By.xpath("//strong")).getText(),"Your order has been successfully processed!");

    }
}
