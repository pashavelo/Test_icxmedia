package icxmedia;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Registration_negative extends precondition {

    @Test
    public void registration_test() throws InterruptedException{

        //Go to web site
        driver.get("https://www.icxmedia.com/");
        System.out.println(driver.getTitle());

        //Search for log in
        WebElement Login = driver.findElement(By.xpath("//a[contains(text(),'LOGIN')]"));
        Login.click();
        System.out.println(driver.getTitle());
        //Search for Sing up
        Thread.sleep((int) (2000));
        WebElement SignUp = driver.findElement(By.xpath("//a[contains(text(),'Sign Up.')]"));
        SignUp.click();
        System.out.println(driver.getTitle());
        //Find all needed fields to enter data
        WebElement EmailFieldReg = driver.findElement(By.xpath("//input[@placeholder='Email*']"));
        WebElement FirstNameReg = driver.findElement(By.xpath("//input[@placeholder='First Name*']"));
        WebElement LastNameReg = driver.findElement(By.xpath("//input[@placeholder='Last Name*']"));
        WebElement PasswordReg = driver.findElement(By.xpath("//input[@placeholder='Password*']"));

        //Validating fields
        EmailFieldReg.sendKeys("test");
        FirstNameReg.sendKeys("123");
        LastNameReg.sendKeys("1234");
        PasswordReg.sendKeys("123456");
        Thread.sleep((int) (2000));
        WebElement ValidEmail = driver.findElement(By.xpath("//div[contains(text(),'A valid email address is required.')]"));
        WebElement ValidPassword = driver.findElement(By.xpath("//div[contains(text(),'Password must contain:')]"));
        //Check


        if (ValidEmail.isDisplayed())
            System.out.println("PASS: Email validation");
        else
            System.out.println("FAILED: Email validation");
        if (ValidPassword.isDisplayed())
            System.out.println("PASS: Password validation");
        else
            System.out.println("FAILED: Password validation");

        driver.quit();

    }

}
