package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage extends BasePage{

    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Element Getters section
     */
    private WebElement getFirstNameTextField(){
        return getDriver().findElement(By.cssSelector("input#forename"));
    }

    private WebElement getSurnameTextField(){
        return getDriver().findElement(By.cssSelector("input[name='map(lastName)']"));
    }

    private WebElement getTermsCheckbox(){
        return getDriver().findElement(By.cssSelector("input[name='map(terms)']"));
    }

    private WebElement getJoinNowButton(){
        return getDriver().findElement(By.cssSelector("fieldset.underlay>input[type='submit']"));
    }

    private WebElement getDOBErrorMessage(){
        return getDriver().findElement(By.cssSelector("select#dobYear+label[for='dob']"));
    }


    /**
     * Element Actions section
     */
    public void typeFirstName(String firstName) {
        getFirstNameTextField().sendKeys(firstName);
    }

    public void typeSurname(String surname) {
        getSurnameTextField().sendKeys(surname);
    }

    public void clickTermsCheckbox(){
        getTermsCheckbox().click();
    }

    public void clickJoinNowButton(){
        getJoinNowButton().click();
    }

    public void selectFromTitleDropdown(String option){
        Select titleDropdown =
                new Select(getDriver().findElement(By.xpath("//select[@id='title']")));
        titleDropdown.selectByValue(option);
    }

    public String getDOBErrortext(){
        return getDOBErrorMessage().getText();
    }


}
