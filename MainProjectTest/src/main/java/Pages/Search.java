package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Search {
WebDriver driver;
public Search(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements( driver,this);
}
@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")WebElement search ;
@FindBy(xpath="(//input[@type='text'])[1]")WebElement name;
@FindBy(xpath="(//select[@class='form-control'])[1]") WebElement usertype;
@FindBy(xpath="(//button[@class='btn btn-block-sm btn-danger'])[1]") WebElement secondsearch;

public Search clicksearch()
{
	search.click();
	return this;
}
public  Search entername(String usernamefield) 
{
	name.sendKeys(usernamefield);
	return this;
}
public  Search dropdown() 
{
	Select select=new Select(usertype);
	select.selectByIndex(2);
	return this;

}
public  Search clickon() {
	secondsearch.click();
	return this;
}
}