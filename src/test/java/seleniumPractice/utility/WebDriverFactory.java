package seleniumPractice.utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

    public static WebDriver getDriver(String arr) {
        
        WebDriver driver = null;
        if (arr.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (arr.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (arr.equalsIgnoreCase("edge") || arr.equalsIgnoreCase("microsoft edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new FirefoxDriver();
        }
        return driver;
    }
}
