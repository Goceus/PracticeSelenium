package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import seleniumPractice.utility.WebDriverFactory;

public class TC2_BackAndForthNavigation {

    public static void main(String[] args) throws InterruptedException{

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("A/B Testing")).click();

        Thread.sleep(1500);

        //Title verification:
        String expectedTitle = "No A/B Test";
        String actualTitle = driver.getTitle();
        System.out.println("expectedTitle = " + expectedTitle);
        System.out.println("actualTitle = " + actualTitle);
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!");
        }

        Thread.sleep(1500);

        driver.navigate().back();

        //Title of homepage verification:
        String expectedHPTitle = "Practice";
        String actualHPTitle = driver.getTitle();
        System.out.println("expectedHPTitle = " + expectedHPTitle);
        System.out.println("actualHPTitle = " + actualHPTitle);
        if(actualHPTitle.equals(expectedHPTitle)){
            System.out.println("Home page title verification PASSED!");
        }else {
            System.out.println("Home page title verification PASSED!");
        }

    }

}
/*
TC #2: Back and forth navigation
1- Open a chrome browser
2- Go to: https://practice.cydeo.com
3- Click to A/B Testing from top of the list.
4- Verify title is:
Expected: No A/B Test
5- Go back to home page by using the .back();
6- Verify title equals:
Expected: Practice
 */