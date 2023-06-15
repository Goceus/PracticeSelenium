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

public class TC_1_Xpath_And_CssSelector_Practices {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://practice.cydeo.com/forgot_password");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void CssSelectorHome(){

        //"Home" link
        // WebElement homeLink = driver.findElement(By.cssSelector("a[class='nav-link']"));
        WebElement homeLink = driver.findElement(By.cssSelector("li[class='nav-item'] > a"));
        Assert.assertTrue(homeLink.isDisplayed());

    }

    @Test
    public void cssSelectorForgotPassHeader(){
        //"Forgot password" header
        //WebElement forgotPassHeader = driver.findElement(By.cssSelector("h2"));
        WebElement forgotPassHeader = driver.findElement(By.cssSelector("div.example > h2"));
        Assert.assertTrue(forgotPassHeader.isDisplayed());
    }

    @Test
    public void cssSelectorEmailText(){
        //"E-mail" text
        //WebElement emailText = driver.findElement(By.cssSelector("label[for='email']"));
        WebElement emailText = driver.findElement(By.cssSelector("div.large-6 >label"));
        Assert.assertTrue(emailText.isDisplayed());
    }

    @Test
    public void cddSelectorEmailBox(){
        //E-mail input box
        //WebElement emailBox = driver.findElement(By.cssSelector("div.large-6 > input"));
        WebElement emailBox = driver.findElement(By.cssSelector("input[type='text']"));
        Assert.assertTrue(emailBox.isDisplayed());
    }

    @Test
    public void cssSelectorRetrievePassBtn(){
        //"Retrieve password" button
        //WebElement retrievePassBtn = driver.findElement(By.cssSelector("button#form_submit"));
        WebElement retrievePassBtn = driver.findElement(By.cssSelector("button.radius"));
        Assert.assertTrue(retrievePassBtn.isDisplayed());
    }

    @Test
    public void cssSelectorPoweredByCydeo(){
        //"Powered by Cydeo" text
//        WebElement pwredByCydeoText = driver.findElement(By.cssSelector("div[style='text-align: center;']"));
//        System.out.println(pwredByCydeoText.getText());
          WebElement pwredByCydeoText = driver.findElement(By.cssSelector("div.large-4 > div"));
        Assert.assertTrue(pwredByCydeoText.isDisplayed());
    }
//----------------------------------------------------------------------------------------------------------------------

    @Test
    public void xpathHome(){
        //"Home" link
        //WebElement homeLinkXpath = driver.findElement(By.xpath("//a[@class='nav-link']"));
        WebElement homeLinkXpath = driver.findElement(By.xpath("//a[.='Home']"));
        Assert.assertTrue(homeLinkXpath.isDisplayed());
    }

    @Test
    public void XpathForgotPassHeader(){
        //"Forgot password" header
        //WebElement forgotPassHeader = driver.findElement(By.xpath("//div[@class='example']//h2"));
        WebElement forgotPassHeader = driver.findElement(By.xpath("//h2[.='Forgot Password']"));
        Assert.assertTrue(forgotPassHeader.isDisplayed());
    }

    @Test
    public void xpathEmailText(){
        //"E-mail" text
        //WebElement emailTextBox = driver.findElement(By.xpath("//label[.='E-mail']"));
        WebElement emailTextBox = driver.findElement(By.xpath("//div[contains(@class, 'large-6 small-12 columns')]"));
        Assert.assertTrue(emailTextBox.isDisplayed());
    }

    @Test
    public void xpathEmailBox(){
        //E-mail input box
        //WebElement emailBox = driver.findElement(By.xpath("//div//input[@type='text']"));
        WebElement emailBox = driver.findElement(By.xpath("//input[@name='email']"));
        Assert.assertTrue(emailBox.isDisplayed());
    }

    @Test
    public void xpathRetrievePassBtn(){
        //"Retrieve password" button
        //WebElement retrievePassBtn = driver.findElement(By.xpath("//form[@name='forgot_password']//button"));
        WebElement retrievePassBtn = driver.findElement(By.xpath("//i[.='Retrieve password']/.."));
        Assert.assertTrue(retrievePassBtn.isDisplayed());
    }

    @Test
    public void xpathPoweredByCydeo(){
        //"Powered by Cydeo" text.
       //WebElement pwredByCydeoText = driver.findElement(By.xpath("//div[@style='text-align: center;']"));
        WebElement pwredByCydeoText = driver.findElement(By.xpath("//a[.='CYDEO']/.."));
        System.out.println("pwredByCydeoText = " + pwredByCydeoText.getText());
        Assert.assertTrue(pwredByCydeoText.isDisplayed());
    }

}
/*
TC_1_Xpath_And_CssSelector_Practices
1. Open Chrome browser
2. Go to https://practice.cydeo.com/forgot_password
3. Locate all the WebElements on the page using Xpath and/or cssSelector locator only(total of 6)

a. "Home" link
b. "Forgot password" header
c. "E-mail" text
d. E-mail input box
e. "Retrieve password" button
f. "Powered by Cydeo" text.

4. Verify all web elements are displayed.

First solve the task using cssSelector only. Try to create 2 different cssSelector locator if possible

Then solve the task using XPATH only. Try to create 2 different XPATH locator if possible


 */