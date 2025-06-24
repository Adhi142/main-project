package MainPackage;

import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.LoginPage;
import constants.Constants;
import utilities.FakerUtilities;
import Pages.AdminUsers;
import Pages.HomePage;

public class AdminUsersTest extends Base {
	HomePage home;
	AdminUsers admin;

    @Test
    public void adminuser() {
        LoginPage loginpage = new LoginPage(driver);
        loginpage.enterUserNamePassword("admin", "admin");
        home=loginpage.clickOnSigninButton();
       admin=home.clickonadminuser();
       FakerUtilities Faker=new FakerUtilities();
       String usernamefaker=Faker.getFakeFirstName();
       String passwordfaker=Faker.getPassword();
       admin.newtabfield().enterUsernamePassword("hii", "hiii").drop().savefield();
       String expectedmessage="user created successfully";
      // boolean message=admin.isalertMessage();
      
      // Assert.assertEquals(message,expectedmessage,Constants.ERRORMESSAGEHOME);
        /*AdminUsers adminpage = new AdminUsers(driver); // FIXED HERE
        adminpage.enterUsernamePassword("Adhi", "Testpass");
        adminpage.drop();
        adminpage.last();*/
    }
}
