package SDET.TestNG1;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
public class DataProvider_Pass_Parameter_TestMethod {
	@DataProvider(name="SearchDataSet")
	public Object[][] SearchData(){
		Object[][] searchkeyword = new Object[3][2];

		searchkeyword[0][0] = "India";
		searchkeyword[0][1] = "Qutub Minar";

		searchkeyword[1][0] = "Agra";
		searchkeyword[1][1] = "Taj Mahal";

		searchkeyword[2][0] = "Hyderabad";
		searchkeyword[2][1] = "charminar";
		return searchkeyword;



	}
	@Test(dataProvider="SearchDataSet")
	public void TestCaseGoogleSearch(String country , String monument) {
		//	Launch Chrome Browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//	open url
		driver.get("http://www.google.com");
		//	Find Web element search box of google 
		WebElement searchbox = driver.findElement(By.name("q"));
		//	enter key combination of country and monument 
		searchbox.sendKeys(country + " " + monument);
		//	click Search button 
		driver.findElement(By.name("btnK")).submit();

	}
}
