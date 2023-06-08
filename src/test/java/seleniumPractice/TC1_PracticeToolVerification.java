package seleniumPractice;

import org.openqa.selenium.WebDriver;
import seleniumPractice.utility.WebDriverFactory;

public class TC1_PracticeToolVerification {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com");

        // URL verification:
        String expectedURL = "cydeo";
        String actualURL = driver.getCurrentUrl();
        System.out.println("expectedURL = " + expectedURL);
        System.out.println("actual URL = " + actualURL);
        if(actualURL.contains(expectedURL)){
            System.out.println("URL verification PASSED!");
        }else{
            System.out.println("URL verification FAILED!");
        }

        //Title verification:
        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();
        System.out.println("expectedTitle = " + expectedTitle);
        System.out.println("actualTitle = " + actualTitle);
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else {
            System.out.println("Title verification PASSED!");
        }

        Thread.sleep(3000);
        driver.quit();
    }

}
/*
TC #1: Cydeo practice tool verifications
1. Open Chrome browser
2. Go to https://practice.cydeo.com
3. Verify URL contains
Expected: cydeo
4. Verify title:
Expected: Practice
 */