package Nop_Commerce;

import Cucumber_New.Utils;
import org.openqa.selenium.By;

public class Shiping_Method_Page extends Utils {
    public void shipingMethod(){
        clickElement(By.xpath("(//input[@value='Continue'])[3]"));     //click on continue
    }
}
