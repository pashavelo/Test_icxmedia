package icxmedia;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;

public class Authorization_negative extends precondition{
    @Test

    public void Authorization_test() throws InterruptedException {

        //Go to web site
        driver.get("https://www.icxmedia.com/");
        System.out.println(driver.getTitle());

        //Search for log in
        WebElement Login = driver.findElement(By.xpath("//a[contains(text(),'LOGIN')]"));
        Login.click();
        System.out.println(driver.getTitle());
        //Find needed fields
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement Email = driver.findElement(By.xpath("//input[@placeholder='Email*']"));
        WebElement Password = driver.findElement(By.xpath("//input[@placeholder='Password*']"));

        //Entering data
        Email.sendKeys("test3@gmail.com");
        Password.sendKeys("A123456@");
        //Log in
        Thread.sleep((int)(2000));
        WebElement LetGetStarted = driver.findElement(By.xpath("//button[@class='auth-submit icx-btn stretch']"));
        LetGetStarted.click();
        Thread.sleep((int)(2000));
        WebElement AuthorizationError = driver.findElement(By.xpath("//div[@class='form-error']"));

        if (AuthorizationError.isDisplayed())
            System.out.println("PASS: Authorization validation is working");
        else
            System.out.println("ERROR: Authorization validation failed");

        driver.quit();

    }
}
