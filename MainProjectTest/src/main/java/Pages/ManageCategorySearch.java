package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageCategorySearch {
	 WebDriver driver;

	    public ManageCategorySearch(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	    @FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']") WebElement newSearch;
	    @FindBy(xpath="//input[@class='form-control']") WebElement inputCategory;
	    @FindBy(xpath = "//button[@class='btn btn-danger btn-fix']")WebElement  searchButton;
	    
public ManageCategorySearch newSearch()
{
	newSearch.click();
	return this;
}
public ManageCategorySearch inputCategory()
{
	inputCategory.click();
	return this;
}
public ManageCategorySearch searchButton()
{
	searchButton.click();
	return.this;
}
public boolean issearchable()
{
	return message 
	}
}
