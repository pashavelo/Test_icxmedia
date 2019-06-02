package icxmedia;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;




public class Registration extends precondition {

    @Test

    public void registration_test() throws InterruptedException {
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
        //Enter data
        EmailFieldReg.sendKeys("test3@gmail.com");
        FirstNameReg.sendKeys("Petrov");
        LastNameReg.sendKeys("Ivanovich");
        PasswordReg.sendKeys("A123456@");
        //Singuping
        Thread.sleep((int) (2000));
        WebElement LetsGetStarted_Button = driver.findElement(By.xpath("//button[@class='auth-submit stretch']"));
        LetsGetStarted_Button.click();
        System.out.println(driver.getTitle());

        driver.quit();
    }

}
