package MainPackage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import constants.Constants;
import utilities.ExcelUtilities;

public class LoginTest extends Base {
	HomePage home;

    @Test(retryAnalyzer = retry.Retry.class,groups = {"REGRESSION"})
    public void loginWithinCorrectCredentials() throws IOException {
        LoginPage loginPage = new LoginPage(driver);
        String username=ExcelUtilities.getStringdata(1, 0, "Loginpagetest");
        String password=ExcelUtilities.getStringdata(1, 1, "Loginpagetest");
        
        loginPage.enterUserNamePassword("admin","admins");
        loginPage.enterUserNamePassword(username,password);
        loginPage.clickOnSigninButton();
        
        boolean isdashboardisloaded=loginPage.isdashboardisloaded();
        Assert.assertTrue(isdashboardisloaded,Constants.ERRORMESSAGEHOME);
        
    }
     

   
    @Test(groups = {"smoketesting"})
    public void loginWithInvalidUsernameAndValidPassword() {
        LoginPage loginPage = new LoginPage(driver);
        
        loginPage.enterUserNamePassword("wronguser", "admin");
        loginPage.clickOnSigninButton();
    }

    @Test (groups = {"regression testing"})
    @Parameters({"username", "password"})
    public void loginWithParameters(String username, String password) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUserNamePassword(username, password);
        loginPage.clickOnSigninButton();
    }

    @Test(dataProvider = "loginData")
    public void loginWithMultipleCredentials(String username, String password) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUserNamePassword(username, password);
        loginPage.clickOnSigninButton();
    }

    @DataProvider(name = "loginData")
    public Object[][] getLoginData() {
        return new Object[][]{
            {"admin", "admin"},
            {"wronguser", "admin"},
            {"username", "password"},
            {"username", "password"}
        };
    }
}
