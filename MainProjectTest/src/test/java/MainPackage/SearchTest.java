package MainPackage;

import org.testng.annotations.Test;

import Pages.AdminUsers;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.Search;


public class SearchTest extends Base {
	
	HomePage home;
	AdminUsers homepg;
	Search search;
	@Test()
	public void search()
	{
	LoginPage login=new LoginPage(driver);
	login.enterUserNamePassword("admin", "admin");
	home=login.clickOnSigninButton();
	search=home.clickOnadminsuer();
	search.clicksearch().entername("Adhi").dropdown().clickon();


}
}