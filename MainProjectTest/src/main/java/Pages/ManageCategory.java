package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.Constants;
import utilities.FileUploads;

public class ManageCategory {
    WebDriver driver;
    FileUploads file=new FileUploads();

    public ManageCategory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    
    
    @FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement newCategoryButton;
    @FindBy(xpath="//input[@id='category']")WebElement categoryNameInput;
    @FindBy(xpath="//li[@id='134-selectable']")WebElement discountCheckbox;
    @FindBy(xpath="//input[@id='main_img']")WebElement chooseFile;
    @FindBy(xpath="//button[@type='submit']")WebElement clickSave;

    public ManageCategory clickNewCategory() {
        newCategoryButton.click();
        return this;
    }

    public ManageCategory enterCategoryName(String name)
    {
        categoryNameInput.sendKeys(name);
        return this;
    }

    public ManageCategory clickDiscount() {
        discountCheckbox.click();
        return this;
    }
    public ManageCategory scrollDown()
    {
    	JavascriptExecutor javascript=(JavascriptExecutor)driver;
    	javascript.executeScript("window.scrollBy(0,1000)");
    	return this;
    }
    public ManageCategory chooseFile()
    {
    	file.sendkeysforfileupload(chooseFile, Constants.TESTIMAGE);
    	//chooseFile.sendKeys("C:\\Users\\adhit\\Downloads\\dan-freeman-wAn4RfmXtxU-unsplash.jpg");
    	return this;
    }

    public ManageCategory clickSave() 
    {
    	JavascriptExecutor javascript=(JavascriptExecutor)driver;
    	javascript.executeScript("arguments[0].click();",clickSave);
        //saveButton.click();
        return this;
    }
}
