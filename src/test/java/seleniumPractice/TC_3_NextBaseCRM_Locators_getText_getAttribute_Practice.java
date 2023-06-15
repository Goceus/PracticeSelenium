package seleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC_3_NextBaseCRM_Locators_getText_getAttribute_Practice {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://login1.nextbasecrm.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void logInBtnText(){
        WebElement logInBtn = driver.findElement(By.xpath("//input[@class='login-btn']"));
        String expected = "Log In";
        String actual = logInBtn.getAttribute("value");
        System.out.println("actual = " + actual);
        System.out.println("expected = " + expected);

        Assert.assertEquals(expected, actual);

    }

}
/*
TC_3_NextBaseCRM_Locators_getText_getAttribute_Practice
1. Open a chrome browser
2. Go to: https://login1.nextbasecrm.com
3. Verify "Log in" button text is as expected:
    Expected: Log In

PS: Inspect and decide which locator you should be using to locate web elements
PS2: Pay attention to where to get the text of this button from
 */