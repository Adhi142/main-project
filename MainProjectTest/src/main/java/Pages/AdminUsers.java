package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminUsers {
  WebDriver driver;
 public AdminUsers(WebDriver driver)
 {
  this.driver=driver;
  PageFactory.initElements(driver,this);
  
 }
 
 @FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement New;
 @FindBy(xpath="(//input[@class='form-control'])[2]") WebElement username;
 @FindBy(xpath="//input[@id='password']") WebElement password;
 @FindBy(xpath="//select[@id='user_type']") WebElement usertype;
 @FindBy(xpath="(//button[@type='submit'])[2]")WebElement Save;
 public AdminUsers newtabfield()
 { 
	 New.click();
	 return this;
 }
   
    public AdminUsers enterUsernamePassword(String usernamefield,String passwordfield)
     {
      username.sendKeys(usernamefield);
      password.sendKeys(passwordfield);
      return this;
     }
  public AdminUsers drop() 
  { 
   Select select = new Select(usertype);
   select.selectByVisibleText("Admin");
   return this;
   }

public AdminUsers savefield() {
 Save.click();
 return this;
}

}
