package Nop_Commerce;

import Cucumber_New.BasePage;
import Cucumber_New.Load_Properties;
import Cucumber_New.Utils;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import static Cucumber_New.Utils.clickElement;
import static Cucumber_New.Utils.enterText;

public class Nop_Commerce extends BasePage {
    Utils utils = new Utils();
    Load_Properties load_properties=new Load_Properties();
    String url = load_properties.getProperty("url");
    String product = load_properties.getProperty("product");
    public void getUrl() {
        driver.get(url);
        }

        public void serch_Product(){
            enterText(By.id("small-searchterms"),product);
            clickElement(By.xpath("//input[@value='Search']"));

        }
    public void checkOutProduct(){
        //selectByVisibleText(By.id("products-orderby"), "Name: A to Z");     // select a to z short by

        //img[@alt='Picture of First Prize Pies']
        clickElement(By.xpath("//img[@alt='Picture of First Prize Pies']"));
       // clickElement(By.xpath("//input[@value='Add to cart']"));    // click add to cart
        clickElement(By.xpath("//input[@id='add-to-cart-button-38']"));
        clickElement(By.className("cart-label"));       // click on shpoping cart button
        clickElement(By.id("termsofservice"));     //  click on agree times and condition
        clickElement(By.id("checkout"));    // click on check out
        clickElement(By.xpath("//div[3]/input"));    // click on check out as a guest
        enterText(By.id("BillingNewAddress_FirstName"), "angel");    // enter first name
        enterText(By.id("BillingNewAddress_LastName"), "doshi");    // anter last name
        enterText(By.id("BillingNewAddress_Email"), "angeldoshi2@gmail.com");      //enter email address


        //selectByVisibleText(By.id("BillingNewAddress_CountryId"), "United Kingdom");    //enter country name
        clickElement(By.xpath("//option[@value='82']"));


       // selectByVisibleText(By.xpath("//option[@value='82']"),"United Kingdom");
        enterText(By.id("BillingNewAddress_City"), "london");    // enter city name
        enterText(By.id("BillingNewAddress_Address1"), "51,carpenders park");     // enter address
        enterText(By.id("BillingNewAddress_ZipPostalCode"), "ha0 2hl");     // enter postcode
        enterText(By.id("BillingNewAddress_PhoneNumber"), "07518367875");    // enter mobile number
        clickElement(By.xpath("//input[@value='Continue']"));    // click on countinue

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {     // 3 second sleep
            e.printStackTrace();
        }
        System.out.println("fill the details");
        clickElement(By.xpath("(//input[@value='Continue'])[3]"));     //click on continue
        clickElement(By.id("paymentmethod_1"));     // click on credit card
        clickElement(By.xpath("(//input[@value='Continue'])[4]"));  //click on countinue
        enterText(By.id("CardholderName"), "angel");   //  click on card holdername
        enterText(By.id("CardNumber"), "4532461796446428");  //click on card number
        clickElement(By.xpath("//option[@value='2024']"));
       // selectByVisibleText(By.id("ExpireYear"), "2022");   // select expire year
        enterText(By.id("CardCode"), "502");    //enter card code number
        clickElement(By.xpath("(//input[@value='Continue'])[5]"));   // click on countinue

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickElement(By.xpath("//input[@value='Confirm']"));      //click on confirm
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("your order details is completed");   //

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  // implicity wait
        String actualMsg = driver.findElement(By.tagName("body")).getText();  // store get text in actualmsg
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(actualMsg.contains("Thank you"));  // assert

    }

}
