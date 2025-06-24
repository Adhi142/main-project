package MainPackage;

import org.testng.annotations.Test;

import Pages.AdminUsers;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.ManageNews;
import Pages.Search;

public class ManageNewsTest extends Base {
	HomePage home;
	ManageNews manage;
	Search search;
	@Test
	public void search()
	{
	LoginPage login=new LoginPage(driver);
	login.enterUserNamePassword("admin", "admin");
	home=login.clickOnSigninButton();
     manage=home.clickManagenew();
     manage.newclick().newsClick("gyguhuhjhjh").saveClick();

}
}


