package MainPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import constants.Constants;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class HomePageTest extends Base {
	HomePage home;
	
  @Test
  public void signout() {
	  LoginPage loginpage= new LoginPage(driver);
		loginpage.enterUserNamePassword("admin", "admin");
		home=loginpage.clickOnSigninButton();
		home.logOut();
		String expected=" Login | 7rmart supermarket ";
        String actual = driver.getTitle();
        Assert.assertEquals(expected, actual,Constants.ERRORMESSAGEHOME);
        System.out.println(driver.getTitle());
        
				
		//HomePage homepage= new HomePage(driver);
		//homepage.logOut();
	}
	}


