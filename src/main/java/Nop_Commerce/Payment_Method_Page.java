package Nop_Commerce;

import Cucumber_New.Utils;
import org.openqa.selenium.By;

public class Payment_Method_Page extends Utils {
    public void payMentMethod(){
        clickElement(By.id("paymentmethod_1"));     // click on credit card
        clickElement(By.xpath("(//input[@value='Continue'])[4]"));  //click on countinue
    }
}
