package Nop_Commerce;

import Cucumber_New.Utils;
import org.openqa.selenium.By;

public class Payment_Info_Page extends Utils {
    public void paymentInformation(){
        enterText(By.id("CardholderName"), "angel");   //  click on card holdername
        enterText(By.id("CardNumber"), "4532461796446428");  //click on card number
        clickElement(By.xpath("//option[@value='2024']"));
        // selectByVisibleText(By.id("ExpireYear"), "2022");   // select expire year
        enterText(By.id("CardCode"), "502");    //enter card code number
        clickElement(By.xpath("(//input[@value='Continue'])[5]"));   // click on countinue


    }
}
