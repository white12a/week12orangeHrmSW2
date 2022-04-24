package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class LoginTest extends Utility {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials(){
        sendTextToElement(By.id("txtUsername"),"Admin");
        sendTextToElement(By.id("txtPassword"),"admin123");
        clickOnElement(By.id("btnLogin"));
        String welcomeText=getTextFromElement(By.id("welcome"));
        String actualText=welcomeText.substring(0,7);// split the text
        String expectedTeXt="Welcome";// expected text
        Assert.assertEquals("Welcome text not visible", expectedTeXt,actualText);// validation
    }

    @After
    public void tearDown(){
        closeBrowser();
    }

}
