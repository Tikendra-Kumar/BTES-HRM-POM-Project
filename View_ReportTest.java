package Test;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import TestBase.TestBase;

import page.View_Report_Page;

public class View_ReportTest extends TestBase {
	View_Report_Page vr;
	public View_ReportTest() {
		super();
	}
	@BeforeSuite
	public void setup() throws IOException {
		initialize();
		vr=new View_Report_Page (driver);
	}
	@Test(priority=1)
	public void Login_Enterdata_valid_username_Valid_Password_Click_Loginbtn() {
		vr.Enterdata_username_textBox(prop.getProperty("user1"));
		vr.Enterdata_Password_textBox(prop.getProperty("pass1"));
		vr.Click_Login_Button();
	}
	@Test(priority=2)
	public void View_Report_Move_to_Rrport_Dropdown() {
		vr.Mouse_Hover_on_Report();
		vr.Click_View_Report();
	}
	@Test(priority=3)
	public void Switch_to_iframe_Access_Select_drop_Id() {
		vr.Switch_TO_iframe();
		vr.Access_Select_Drop_Id();
	}
	@Test(priority=4)
	public void EnterId_Search_for_textBox() {
		vr.Enter_Id_Search_TextBox(prop.getProperty("Searchfor"));
	}
	@Test(priority=5)
	public void Click_Search_Button_Access_Id() {
		vr.Click_Search_Button();
	}
	@Test(priority=6)
	public void Click_Reset_Button_Clear_Id() {
		vr.Click_Reset_Button();
	}
	@Test(priority=7)
	public void Click_Link_Text_newrpoet() {
		vr.Click_REP012_Link_text();
	}
	@Test(priority=8)
	public void Click_Back_Button_Reverse_View_ReportEmployee() {
		vr.Click_Back_Button();
	}
	@AfterSuite
	public void teardown() {
		closure();
	}
	
	
	

}
