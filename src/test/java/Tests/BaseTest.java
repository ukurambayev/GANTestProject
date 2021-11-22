package Tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    /**
     * Public variable to pass driver instance to other classes
     */
    public WebDriver driver;

    /**
     * Method, that creates Chrome WebDriver instance before each test execution
     */
    @Before
    public void setup(){
        driver = new ChromeDriver();
    }

    /**
     * Method, that closes Chrome browser and quit WebDriver instance before each test execution
     */
    @After
    public void tearDown(){
        driver.quit();
    }
}
