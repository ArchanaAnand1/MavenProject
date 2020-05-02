package stepDefs;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;
import Listeners.ExtentReportsListener;
import PageObjects.YoutubeSearchPage;
import PropertiesFle.*;
import Utilities.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class YoutubeSearch extends ExtentReportsListener{
	
	static public WebDriver driver;
	FileReader obj= new FileReader();  
	static YoutubeSearchPage ysp;
    
	@Given("^open chrome and enter URL and search \"(.*?)\"$")
	public void open_chrome_browser_and_enter_url(String search) throws Throwable 
	{
		ExtentTest logInfo = null;
		try {
		test = extent.createTest(Feature.class, "Youtube search");
		test = test.createNode(Scenario.class, "Yooutube search");
		logInfo = test.createNode(new GherkinKeyword("Given"), "open chrome and enter URL and search");
		driver = BaseClass.OpenBrowser(driver);
		ysp= new YoutubeSearchPage(driver);
		ysp.enterValSearchBox(search, driver);
		logInfo.pass("Passed");
		}catch(AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
		
	}
	
	@When("^enter search criteria$")
	public void enterSearchCriteria() {
		driver.quit();

	}

	

}
