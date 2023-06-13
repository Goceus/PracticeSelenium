package seleniumPractice;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import seleniumPractice.utility.WebDriverFactory;

public class HWP_1_Etsy_Title_Verification {

    WebDriver driver;

    @BeforeClass
    public void setupMethod() throws InterruptedException {

        //1. Open Chrome browser
        //2. Go to https://www.etsy.com
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.etsy.com");
        Thread.sleep(5000);
    }

   @AfterClass
   public void tearDown () {
       driver.quit();
   }

    @Test (priority = 1)
    public void searchWoodenSpoon() throws InterruptedException {
        //3. Search for "wooden spoon"
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='global-enhancements-search-query']"));
        Thread.sleep(1000);
        searchBox.sendKeys("wooden spoon" + Keys.ENTER);
    }

    @Test (priority = 2)
    public void verifyTitle(){
        //4. Verify title:
        //    Expected: "Wooden spoon - Etsy"
        String expectedTitle = "Wooden spoon - Etsy";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(expectedTitle, actualTitle);
    }





}
/*
HWP #1: Etsy Title Verification
1. Open Chrome browser
2. Go to https://www.etsy.com
3. Search for "wooden spoon"
4. Verify title:
    Expected: "Wooden spoon - Etsy"
 */
