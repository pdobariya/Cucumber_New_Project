package Nop_Commerce;

import Cucumber_New.Utils;
import org.openqa.selenium.By;

public class CheckOutAsAGuest_Page extends Utils {
    public void checkOutAsAGuest(){
        clickElement(By.xpath("//div[3]/input"));    // click on check out as a guest
    }
}
