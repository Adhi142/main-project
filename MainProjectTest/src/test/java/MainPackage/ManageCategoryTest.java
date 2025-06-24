package MainPackage;

import org.testng.annotations.Test;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.ManageCategory;

public class ManageCategoryTest extends Base {
    HomePage home;
    ManageCategory manageCategory;

    @Test
    public void testAddCategoryWithDiscount() {
        
        LoginPage login = new LoginPage(driver);
        login.enterUserNamePassword("admin", "admin");
        home = login.clickOnSigninButton();
        manageCategory = home.clickManageCategory();
        manageCategory.clickNewCategory().enterCategoryName("Butterfly").clickDiscount().scrollDown().chooseFile().clickSave();

        
    }
}
