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

public class TC_2_NextBaseCrm_locators_getText_getAttribute_Practice {

    WebDriver driver;


    @BeforeMethod
    public void setupMethod(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://login1.nextbasecrm.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


    @Test (priority = 1)
    public void nextBaseCRM_2(){

        WebElement rememberMeText = driver.findElement(By.xpath("//label[.='Remember me on this computer']"));
        String expected = "Remember me on this computer";
        String actual = rememberMeText.getText();
        System.out.println("actual = " + actual);
        System.out.println("expected = " + expected);

        Assert.assertEquals(expected, actual);

    }

    @Test (priority = 2)
    public void forgotPassHref(){
        WebElement forgotPass = driver.findElement(By.xpath("//a[.='Forgot your password?']"));
        String expectedForgotPass = "forgot_password=yes";
        String actualForgotPass = forgotPass.getAttribute("href");
        System.out.println("actualForgotPass = " + actualForgotPass);
        System.out.println("expectedForgotPass = " + expectedForgotPass);

        Assert.assertTrue(actualForgotPass.contains(expectedForgotPass));
    }

}
/*
TC_2_NextBaseCrm_locators_getText_getAttribute_Practice
1. Open a Chrome browser
2. Go to https://login1.nextbasecrm.com/
3. Verify "remember me" label text is as expected:
    Expected: Remember me on this computer
4. Verify "forgot password" link text as expected:
    Expected: Forgot your password?
5. Verify "forgot password" href attribute's value contains expected:
    Expected: forgot_password=yes

PS: Inspect and decide which locator you should be using to locate web elements.
 */