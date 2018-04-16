package Nop_Commerce;

import Cucumber_New.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Confirm_CheckOut_Page extends Utils {
    public void confirmCheckOut(){
        WebDriverWait wait = new WebDriverWait(driver,30);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Confirm']")));
        clickElement(By.xpath("//input[@value='Confirm']"));      //click on confirm
    }
}
