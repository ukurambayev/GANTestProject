package PageObject;

import Tests.BaseTest;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

    private static final String BASE_URL = "https://moneygaming.qa.gameaccount.com/";
    private final WebDriver driver;

    /**
     * Constructor of BasePage class, that sets parameter of driver to accept
     */
    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public void getToHomePage(){
        driver.get(BASE_URL);
    }

    /**
     * WebDriver instance getter to use in other
     * PageObject classes (MainPage, SignUpPage)
     *
     * @return WebDriver
     */
    public WebDriver getDriver(){
        return driver;
    }
}
