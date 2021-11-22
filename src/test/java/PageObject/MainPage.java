package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends BasePage{

    /**
     * Constructor of MainPage class, to share variables/params
     * from superclass BasePage (to pass driver to this particular Page Object class)
     */
    public MainPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Element Getter, that returns "Join Me" button element
     * @return WebElement
     */
    public WebElement getJoinMeButton(){
        return getDriver().findElement(By.xpath("//a[@class='newUser green']"));
    }

    /**
     * Clicks "Join Me" button and returns new
     * object of a next Sign Up page
     * @return SignUpPage
     */
    public SignUpPage clickJoinMeButton(){
        getJoinMeButton().click();
        return new SignUpPage(getDriver());
    }
}
