package testsuite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class ForgotPasswordTest extends Utility {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        clickOnElement(By.xpath("//div[@id='forgotPasswordLink']/a"));
        verifyText("Forgot Your Password?",By.xpath("//div[@id='wrapper']/div/div/div[2]/h1"),"Forgot your password text validation");
    }
    @After
    public void tearDown() {
        closeBrowser();
    }
}
