package stepDefs;

import java.io.IOException;
import java.util.Map;
import java.util.Properties;

import PropertiesFle.*;
import Utilities.ExcelReader;
import Utilities.TestDataHandler;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ExcelReaderStepDefs {

	FileReader fr = new FileReader();
	TestDataHandler tdh = new TestDataHandler();

	@Given("^Load the data file$")
	public void readDate() {

		try {
			
			Properties prop = fr.getProperty("testDataConfig.properties");
			try {
				Map<String, String> testDataInMap = ExcelReader.getTestDataInMap(prop.getProperty("test.excelFile"), prop.getProperty("sheet.name"), "TestCase_001");
				System.out.println(testDataInMap.get("Name"));
				tdh.setTestDataMap(testDataInMap);
			} catch (Exception e) {
				e.printStackTrace();
			}

		} catch (IOException e) {

			e.printStackTrace();
		}

	}
	
	
	@Then("^Get data$")
	public void getData() {
		
		System.out.println(tdh.getTestDataMap().get("Run"));
		
		
	}

}
