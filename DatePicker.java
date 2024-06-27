package SDET.MavenProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class DatePicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		String expectedday = "2";
		String expectedmonth = "June";
		String expectedYear = "2024";
				
		
//		Maximise browser
		driver.manage().window().maximize();
		
//		Open url
		driver.get("https://jqueryui.com/datepicker/");
//	 Switch iframe
		driver.switchTo().frame(0);
		
//		Find date picker Webelement to perform click action
		 WebElement datepicker=driver.findElement(By.id("datepicker"));
		 datepicker.click();
		 
		 while(true) {
			 String calenderMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			 String calenderYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			 
			 if(calenderMonth.equals(expectedmonth) && calenderYear.equals(expectedYear)) {
				 List <WebElement> daylist = driver.findElements(By.xpath("//table/tbody/tr/td"));
				 
				 for(WebElement e:daylist) {
					 String calenderday= e.getText();
					 if(calenderday.equals(expectedday)) {
						 e.click();
						 break;
					 }
				 }
				 break;
			 }
			 else {
				 driver.findElement(By.xpath("//span[@class='ui-icon-circle-triangle-e']")).click();
			 }
		 }
		
		
	}

}
