package Nop_Commerce;

import Cucumber_New.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Book_Page extends Utils {
    public void addToCart(){
        clickElement(By.xpath("//img[@alt='Picture of First Prize Pies']"));
        // clickElement(By.xpath("//input[@value='Add to cart']"));    // click add to cart
        WebDriverWait wait = new WebDriverWait(driver,30);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='add-to-cart-button-38']")));
        clickElement(By.xpath("//input[@id='add-to-cart-button-38']"));
        clickElement(By.className("cart-label"));       // click on shpoping cart button
    }
}
