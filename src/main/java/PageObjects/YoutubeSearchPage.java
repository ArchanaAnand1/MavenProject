package PageObjects;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class YoutubeSearchPage {
	
	WebDriver driver;
	
	
	public YoutubeSearchPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//input[@id='search']")
	private WebElement txtbx_Searchbox;
	@FindBy(xpath = "//button[@id='search-icon-legacy']")
	private WebElement btn_Search;
	

	
	public void PageElementValidation(WebDriver driver) {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 30);
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='search']")));
	 
	}
		catch(Exception e) {
			e.printStackTrace();
			}
		}
	
	
	public void enterValSearchBox(String name, WebDriver driver) {
		PageElementValidation(driver);
		txtbx_Searchbox.click();
		txtbx_Searchbox.sendKeys(name);
		btn_Search.click();
	}

}
