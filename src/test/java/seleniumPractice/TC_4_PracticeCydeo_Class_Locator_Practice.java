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

public class TC_4_PracticeCydeo_Class_Locator_Practice {

    WebDriver driver;

    @BeforeClass
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterClass
    public void tearDown() throws InterruptedException{
        Thread.sleep(1500);
        driver.quit();
    }

    @Test
    public void classLocator(){
        driver.get("http://practice.cybertekschool.com/inputs");
        WebElement homeLink = driver.findElement(By.className("nav-link"));
        homeLink.click();

        String expected = "Practice";
        String actual = driver.getTitle();
        System.out.println("expected = " + expected);
        System.out.println("actual = " + actual);
        Assert.assertEquals(expected, actual);
    }




}


/*
TC_4_PracticeCydeo_Class_Locator_Practice
1. Open a chrome browser
2. Go to https:// practice.cydeo.com/inputs
3. Click to "Home" link
4. Verify title is as expected
    Expected: Practice

P.S Locate "Home" link using "className" locator
 */