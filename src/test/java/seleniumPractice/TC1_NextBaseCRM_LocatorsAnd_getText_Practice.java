package seleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC1_NextBaseCRM_LocatorsAnd_getText_Practice {

    WebDriver driver;

    @BeforeClass
    public void setupMethod(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void nextBaseCrm(){
        driver.get("https://nextbasecrm.com/");
        WebElement loginLink = driver.findElement(By.xpath("//ul[@id='top-menu']//li[7]//a"));
        loginLink.click();

        WebElement usernameBox = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        usernameBox.sendKeys("incorrect");
        WebElement passwordBox = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        passwordBox.sendKeys("incorrect");

        WebElement loginBtn = driver.findElement(By.xpath("//input[@class='login-btn']"));
        loginBtn.click();

        WebElement errorMsg = driver.findElement(By.xpath("//div[@class='errortext']"));

        String expected = "Incorrect login or password";
        String actual = errorMsg.getText();

        System.out.println("expected = " + expected);
        System.out.println("actual = " + actual);

        Assert.assertEquals(expected, actual);
    }

}
/*
TC1_NextBaseCRM_LocatorsAnd_getText_Practice
1. Open a chrome browser
2. Go to: https://nextbasecrm.com/
3. Click on Login link
3. Enter incorrect username: 'incorrect'
4. Enter incorrect password: 'incorrect'
5. Click ro login button
6. Verify error message text is as expected:
    Expected: Incorrect login or password
 */