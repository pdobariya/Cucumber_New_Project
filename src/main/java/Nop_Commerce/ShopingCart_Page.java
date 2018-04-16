package Nop_Commerce;

import Cucumber_New.Utils;
import org.openqa.selenium.By;

public class ShopingCart_Page extends Utils {
    public void shopingCart(){
        clickElement(By.id("termsofservice"));     //  click on agree times and condition
        clickElement(By.id("checkout"));    // click on check out
    }
}
