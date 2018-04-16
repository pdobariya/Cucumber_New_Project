package Cucumber_New;


import Nop_Commerce.Nop_Commerce;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.util.concurrent.TimeUnit;

public class Hooks extends Utils {

    Browser_Factory browser_factory =new Browser_Factory();
    Nop_Commerce nop_commerce =new Nop_Commerce();

    @Before

    public void set_up_Browser() {
        browser_factory.selectBrowser();
        //nop_commerce.getUrl();
        // driver.get("http://opensource.demo.orangehrmlive.com/");
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @After
    public void closeBrowser(){
    driver.quit();
    }
}

