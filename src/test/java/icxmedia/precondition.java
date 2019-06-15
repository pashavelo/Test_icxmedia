package icxmedia;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class precondition {

    protected static WebDriver driver;

    @Before
    //Initialize the chrome driver
    public void Setup() {
        System.setProperty("webdriver.chrome.driver", "/home/pasha/Документы/Course_QA_automation/chromedriver");
        driver= new ChromeDriver();
        //Open window in full size
        driver.manage().window().maximize();
    }


}
