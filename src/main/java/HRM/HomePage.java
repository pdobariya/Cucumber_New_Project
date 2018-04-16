package HRM;

import Cucumber_New.Load_Properties;
import Cucumber_New.Utils;
import org.openqa.selenium.By;

import static Cucumber_New.Utils.clickElement;
import static Cucumber_New.Utils.enterText;

public class HomePage extends Utils {
    Load_Properties load_properties=new Load_Properties();
        String url = load_properties.getProperty("url");

    public void getUrl(){
        driver.get(url);
    }
    public void enterLogInCredentials(String uname , String pward)
    {
        enterText(By.id("txtUsername"), uname);
        enterText(By.id("txtPassword"), pward);
        clickElement(By.id("btnLogin"));
        }
     public void serchProduct(String product)
     {
        enterText(By.id("small-searchterms"),product);
        clickElement(By.xpath("//input[@value='Search']"));

     }



}

