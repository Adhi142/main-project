package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNews {
	WebDriver driver;
	public ManageNews(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements( driver,this);

	}
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/news/add']") WebElement newfield;
	@FindBy(xpath="//textarea[@id='news']") WebElement EnterNew;
	@FindBy(xpath = "//button[@class='btn btn-danger']") WebElement Save;
	
	
	public ManageNews newclick()
	{
		newfield.click();
		return this;
	}
	public ManageNews newsClick(String newsarea)
	{
		EnterNew.sendKeys(newsarea);
		return this;
	}
	public ManageNews saveClick()
	{
		Save.click();
		return this;
	}
	
}