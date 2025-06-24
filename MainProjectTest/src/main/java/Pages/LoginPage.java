package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	public LoginPage (WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
	}
	@FindBy(xpath="//input[@placeholder='Username']")WebElement username;
	@FindBy(xpath="//input[@type='password']")WebElement password;
	@FindBy(xpath="//button[@type='submit']")WebElement signin;
	@FindBy(xpath="//p[text()='Dashboard']") WebElement dashboard;
	public LoginPage enterUserNamePassword(String UsernameField,String PasswordField)
	{
		username.sendKeys(UsernameField);
		password.sendKeys(PasswordField);
		return this;
	}
	public HomePage clickOnSigninButton() {
		signin.click();
		return new HomePage(driver);
	}
	public boolean isdashboardisloaded()
	
	{
		return dashboard.isDisplayed();
	}

}




