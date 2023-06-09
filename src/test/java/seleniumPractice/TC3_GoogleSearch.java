package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import seleniumPractice.utility.WebDriverFactory;

public class TC3_GoogleSearch {

    public static void main(String[] args) throws InterruptedException{

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://google.com");

        WebElement searchBox = driver.findElement(By.id("APjFqb"));
        Thread.sleep(1500);
        searchBox.sendKeys("apple" + Keys.ENTER);
        String expectedTitle = "apple";
        String actualTitle = driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);
        System.out.println("expectedTitle = " + expectedTitle);
        if(actualTitle.startsWith(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else System.out.println("Title verification PASSED!");


    }
}
/*
TC#3: Google search
1- Open a chrome browser
2- Go to: https://google.com
3- Write “apple” in search box
4- Press ENTER to search
5- Verify title:
Expected: Title should start with “apple” word
 */