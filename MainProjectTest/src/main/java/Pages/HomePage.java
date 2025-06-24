package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath="//a[@data-toggle='dropdown']") WebElement adminuser1;
	@FindBy(xpath="(//a[@href='https://groceryapp.uniqassosiates.com/admin/logout'])[1]") WebElement logout;
	@FindBy(xpath="(//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin'])[2]")WebElement adminuser;
	@FindBy(xpath="(//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin'])[2]")WebElement adminusersearch;
	@FindBy(xpath="(//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news'])[2]")WebElement Managenewsfield;
	@FindBy(xpath="(//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category'])[2]")WebElement manageCategoryMenu;

	public ManageCategory clickManageCategory() {
	    manageCategoryMenu.click();
	    return new ManageCategory(driver);
	}


	public ManageNews clickManagenew()
	{
		Managenewsfield.click();
		return new ManageNews(driver);
		
		
	}
	public HomePage logOut()
	
	{
		adminuser1.click();
		logout.click();
		return this;
	}
	public AdminUsers clickonadminuser() 
    {
     adminuser.click();
	return new AdminUsers(driver);
     
    }
	public Search clickOnadminsuer()
	{
		adminusersearch.click();
		return new Search(driver);
	}

	}
