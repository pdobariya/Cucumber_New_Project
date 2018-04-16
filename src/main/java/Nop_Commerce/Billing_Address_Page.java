package Nop_Commerce;

import Cucumber_New.Utils;
import org.openqa.selenium.By;

public class Billing_Address_Page extends Utils {
    public void billingAddress(){
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

    }
}
