package MainPackage;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.ManageCategory;
import Pages.ManageCategorySearch;
import constants.Constants;
import utilities.ExcelUtilities;

public class ManageCategorySearchTest extends Base {
	HomePage home;
	ManageCategory category;
	ManageCategorySearch search;

	@Test
	public void verifyUserCanClickSearchButton() throws IOException {
		LoginPage loginpageproject = new LoginPage(driver);
		String username = ExcelUtilities.getStringdata(1, 0, "Loginpagetest");
		String password = ExcelUtilities.getStringdata(1, 1, "Loginpagetest");
		loginpageproject.enterUserNamePassword(username, password);
		String categoryfield = ExcelUtilities.getStringdata(1, 0, "Managecategorysearch");
		home = loginpageproject.clickOnSigninButton();
		category = home.clickOnManageCategoryButton();
		search = category.clickSearchButton();
		search.inputCategoryField(categoryfield).finalsearchbutton();
		boolean isList = search.isListDisplayed();
		Assert.assertTrue(isList, Constants.ISLIST);
	}
}