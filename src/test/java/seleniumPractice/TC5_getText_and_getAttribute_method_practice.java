package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import seleniumPractice.utility.WebDriverFactory;

public class TC5_getText_and_getAttribute_method_practice {

    public static void main(String[] args) throws InterruptedException{

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/registration_form");
        String expectedHeaderText = "Registration form";
        String actualHeaderText = driver.findElement(By.tagName("h2")).getText();
        if(actualHeaderText.equals(expectedHeaderText)){
            System.out.println("Header verification PASSED!!!");
        }else{
            System.out.println("Header verification FAILED!!!");
        }

        WebElement firstNameBox = driver.findElement(By.cssSelector("input[name='firstname']"));
        Thread.sleep(1000);
        String expectedPlaceHValue = "first name";
        String actualPlaceHValue = firstNameBox.getAttribute("placeholder");
        System.out.println("actualPlaceHValue = " + actualPlaceHValue);
        System.out.println("actualPlaceHValue = " + actualPlaceHValue);
        if(actualPlaceHValue.equals(expectedPlaceHValue)){
            System.out.println("Placeholder value verification is PASSED!!!");
        }else{
            System.out.println("Placeholder value verification is PASSED!!!");
        }

    }



}
/*
TC #5: getText() and getAttribute() method practice
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/registration_form
3- Verify header text is as expected:
Expected: Registration form
4- Locate “First name” input box
5- Verify placeholder attribute’s value is as expected:
Expected: first name
 */