package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageCategorySearch 
{
public WebDriver driver;
public ManageCategorySearch(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

@FindBy(xpath="//input[@class='form-control']")WebElement categoryfield;
@FindBy(xpath="//button[@name='Search']")WebElement finalsearchbutton;
@FindBy(xpath="(//div[@class='card-header'])[2]")WebElement listcategories;
public ManageCategorySearch inputCategoryField(String categoryfield1)
{
	categoryfield.sendKeys(categoryfield1);
	return this;
}
public ManageCategorySearch finalsearchbutton()
{
	finalsearchbutton.click();
	return this;
}
public boolean isListDisplayed()
{
	return listcategories.isDisplayed();
}
}