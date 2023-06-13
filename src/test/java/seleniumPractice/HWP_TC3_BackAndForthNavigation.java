package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import seleniumPractice.utility.WebDriverFactory;

import java.time.Duration;

public class HWP_TC3_BackAndForthNavigation {

    WebDriver driver;

    @BeforeClass
    public void setUpDriver(){
        //1. Open a Chrome browser
        //2. Go to: https://google.com
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://google.com");
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    @Test (priority = 1)
    public void verifyGmail(){
        //3. Click to Gmail from top right.
        //4. Verify title contains:
        //    Expected: Gmail
        WebElement gmailLink = driver.findElement(By.cssSelector("a[href='https://mail.google.com/mail/&ogbl']"));
        gmailLink.click();

        String expected = "Gmail";
        String actual = driver.getTitle();
        System.out.println("Test #1 executes...");
        Assert.assertTrue(actual.contains(expected));
    }

    @Test (priority = 2)
    public void verifyHomeTitle(){
        //5. Go back to Google by using the .back();
        //6. Verify title equals:
        //    Expected: Google
        driver.navigate().back();
        String expected = "Google";
        String actual = driver.getTitle();
        System.out.println("Test #2 executes...");
        Assert.assertEquals(expected, actual);

    }


}
/*
TC #3: Back and Forth navigation
1. Open a Chrome browser
2. Go to: https://google.com
3. Click to Gmail from top right.
4. Verify title contains:
    Expected: Gmail
5. Go back to Google by using the .back();
6. Verify title equals:
    Expected: Google
 */