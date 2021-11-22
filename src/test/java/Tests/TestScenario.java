package Tests;

import PageObject.MainPage;
import PageObject.SignUpPage;
import org.junit.Assert;
import org.junit.Test;


public class TestScenario extends BaseTest{

    private static final String TITLE = "Mr";
    private static final String FIRST_NAME = "TestFN";
    private static final String LAST_NAME = "TestLN";

    private static final String EXPECTED_ERROR_TEXT = "This field is required";

    @Test
    public void testAuthorization() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.getToHomePage();
        SignUpPage signUpPage = mainPage.clickJoinMeButton();

        signUpPage.selectFromTitleDropdown(TITLE);
        signUpPage.typeFirstName(FIRST_NAME);
        signUpPage.typeSurname(LAST_NAME);
        signUpPage.clickTermsCheckbox();
        signUpPage.clickJoinNowButton();

        Assert.assertEquals("Expected and actual values should be the same: "+EXPECTED_ERROR_TEXT,
                EXPECTED_ERROR_TEXT, signUpPage.getDOBErrortext());
        // For demo purposes to hold on execution for 4
        Thread.sleep(4000);

    }

}
