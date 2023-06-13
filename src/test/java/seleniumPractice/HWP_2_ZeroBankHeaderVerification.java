package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import seleniumPractice.utility.WebDriverFactory;

public class HWP_2_ZeroBankHeaderVerification {

    WebDriver driver;

    @BeforeClass
    public void setupDriver(){
        //1. Open Chrome browser
        //2. Go to http://zero.webappsecurity.com/login.html
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://zero.webappsecurity.com/login.html");
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void verifyHeaderText(){
        //3. Verify header text
        //    Expected: "Log in to ZeroBank"
        String expectedHeaderText = "Log in to ZeroBank";
        String actualHeaderText = driver.findElement(By.xpath("//h3[.='Log in to ZeroBank']")).getText();

        Assert.assertEquals(expectedHeaderText, actualHeaderText);
    }



}
/*
HWP #2: Zero Bank header verification
1. Open Chrome browser
2. Go to https://zero.webappsecurity.com/login.html
3. Verify header text
    Expected: "Log in to ZeroBank"
 */