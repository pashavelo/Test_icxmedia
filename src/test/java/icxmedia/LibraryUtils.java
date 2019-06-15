package icxmedia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LibraryUtils {

    public static WebElement waitForElementToBeVisible(WebDriver driver, WebElement webElement, int seconds)
    {
        WebDriverWait wait = new WebDriver(driver, seconds);
        WebElement element = wait.until(ExpectedConditions.visibilityOf(webElement));
        return element;
    }

    public static WebElement waitForElementToBeClicable(WebDriver driver, WebElement webElement,int seconds)
    {
        WebDriverWait = new WebDriver(driver, seconds);
        WebElement element = wait.until(ExpectedConditions.elementToBeClicable(webElement));
        return element;
    }
}
