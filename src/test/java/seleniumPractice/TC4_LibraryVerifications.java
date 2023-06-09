package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import seleniumPractice.utility.WebDriverFactory;

public class TC4_LibraryVerifications {

    public static void main(String[] args) throws InterruptedException{

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://library2.cybertekschool.com/login.html");
        Thread.sleep(1000);
        WebElement userNameBox = driver.findElement(By.className("form-control"));
        Thread.sleep(1000);
        userNameBox.sendKeys("incorrect@email.com");
        Thread.sleep(1000);
        WebElement passwordBox = driver.findElement(By.id("inputPassword"));
        passwordBox.sendKeys("incorrect password");
        Thread.sleep(1000);
        WebElement signInButton = driver.findElement(By.tagName("button"));
        Thread.sleep(1000);
        signInButton.click();

        if(driver.findElement(By.cssSelector("div[class='alert alert-danger']")).isDisplayed()) System.out.println("Alert message is displayed!");


    }


}
/*
TC #4: Library verifications
1. Open Chrome browser
2. Go to http://library2.cybertekschool.com/login.html
3. Enter username: “incorrect@email.com”
4. Enter password: “incorrect password”
5. Verify: visually “Sorry, Wrong Email or Password”
displayed
PS: Locate username input box using “className” locator
Locate password input box using “id” locator
Locate Sign in button using “tagName” locator
 */