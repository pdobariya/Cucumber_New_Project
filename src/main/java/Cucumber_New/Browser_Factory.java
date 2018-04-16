package Cucumber_New;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Browser_Factory extends BasePage {

    Load_Properties load_properties = new Load_Properties();
    String browser1 = load_properties.getProperty("browser");

    public void selectBrowser(){

        if (browser1.equalsIgnoreCase("Firefox")) {
            System.setProperty("webdriver.gecko.driver", "src\\Resources\\java\\Driver_Resources\\geckodriver.exe");
            driver = new FirefoxDriver();
        }else if (browser1.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver","src\\Resources\\java\\Driver_Resources\\chromedriver.exe");
            driver=new ChromeDriver();
        }else if (browser1.equalsIgnoreCase("IE")){
            System.setProperty("webdriver.ie.driver","src\\Resources\\java\\Driver_Resources\\IEDriverServer.exe");
            DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
                // Settings to Accept the SSL Certificate in the Capability object
            capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
            driver=new InternetExplorerDriver(capabilities);
        }else {
            System.out.println("Browser name is wrong:-  " +browser1);
        }


    }
}
