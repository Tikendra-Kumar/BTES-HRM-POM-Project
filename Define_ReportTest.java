package Test;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import TestBase.TestBase;
import page.Define_Report_Page;


public class Define_ReportTest extends TestBase {
	Define_Report_Page dr;
	public Define_ReportTest() {
		super();
	} 
	@BeforeSuite
	public void setup() throws IOException {
		initialize();
		dr=new Define_Report_Page(driver);
	}
	@Test(priority=1)
	public void Login_Enterdata_valid_username_Valid_Password_Click_Loginbtn() {
		dr.Enterdata_username_textBox(prop.getProperty("user1"));
		dr.Enterdata_Password_textBox(prop.getProperty("pass1"));
		dr.Click_Login_Button();
	}
	@Test(priority=2)
	public void Define_Report_Move_to_Rrport_Dropdown() {
		dr.Mouse_Hover_on_Report();
		dr.Click_Define_Report();
	}
	@Test(priority=3)
	public void Switch_to_iframe_Access_Select_drop_Id() {
		dr.Switch_TO_iframe();
		dr.Access_Select_Drop_Id();
	}
	@Test(priority=4)
	public void EnterId_Search_for_textBox() {
		dr.Enter_Id_Search_TextBox(prop.getProperty("Searchfor"));
	}
	@Test(priority=5)
	public void Click_Search_Button_Access_Id() {
		dr.Click_Search_Button();
	}
	@Test(priority=6)
	public void Click_Reset_Button_Clear_Id() {
		dr.Click_Reset_Button();
	}
	@Test(priority=7)
	public void Click_Add_Button_add_new_Text() {
		dr.Click_Add_Button();
	}
	@Test(priority=8)
	public void Enterdata_Report_Name_TextBox() {
		dr.Enter_Report_Name_Textbox(prop.getProperty("ReportName"));
	}
	@Test(priority=9)
	public void Click_Check_Box_Button_Acess_SelelctDrop_Select_Click_Employee_PopupButton_Acess_EmployeeName_Enter_EmployeeName_textBox() {
		dr.Click_CheckBox_Button();
		dr.Select_drop_box_using_selectclass();

		dr.Click_Employee_Popup_button();
	  
	}
	@Test(priority=10)
	public void Click_Employee_AgeGroup_CheckBox_button_And_Select_DropBox_SelectComparison_Enter_age1_TextBox() {
		dr.Click_Employee_Age_Group_CheckBox();
		dr.Select_ComparisonDrop_box();
		dr.Enter_Age1_TextBox(prop.getProperty("txtEmpAge1"));
	}
	@Test(priority=11)
	public void Click_PayGrade_CheckBox_Button_Access_Select_Salary_Grade_drop() {
		dr.Click_Pay_Grade_Check_boxButton();
		dr.Acess_SelectDrop_and_Select_salary_Grade();
	}
	@Test(priority=12)
	public void Click_Education_CheckBox_Button_Access_Select_Education_Type_drop() {
		dr.Click_Education__Check_boxButton();
		dr.Acess_SelectDrop_and_Select_Education_Type();
	}

	@Test(priority=13)
	public void Click_Emloyee_Status_CheckBox_Button_Access_Select_Emloyee_Type_drop() {
		dr. Click_Employee_Status__Check_boxButton();
		dr. Acess_Select_Emloyee_status_Type();
	}
	@Test(priority=14)
	public void Click_Service_period_CheckBox_Button_Access_serivce_Comparison_drop() {
		dr.Click_service_period__Check_boxButton();
		dr.Acess_Serivce_period();
		dr.Enetr_Types_in_Yesr_TextBox("Type in Years");
		dr.Enetr_Types_in_Yesr_TextBox(prop.getProperty("TypesInYear"));
	}
	@Test(priority=15)
	public void Click_Join_Date_CheckBox_Button_Acess_Join_date_Select_drop() {
		dr. Click_Join_Date__Check_boxButton();
		dr.Acess_Join_Date_drop();
		dr.Click_Celendar_Join1_date();
		dr.Click_date_in_Clender();
	}
	@Test(priority=16)
	public void Click_Job_Title_CheckBox_button_Access_Job_Title_Drop() {
		dr.Click_Job_Title_CheckBox_Button();
		dr.Acess_Job_Title_drop();

	}

	@Test(priority=17)
	public void Click_Language_CheckBox_button_Access_Language_Drop() {
		dr.Click_Language_CheckBox_Button();
		dr.Acess_Language_drop();

	}
	@Test(priority=18)
	public void Click_Skill_CheckBox_button_Access_Skill_Drop() {
		dr.Click_Skill_checkBox_button();
		dr.Acess_Skill_drop();
	}
	@Test(priority=19)
	public void click_Employee_Savebutton_and_Reset_Button() {
		dr.Click_Employee_SaveButton();
//		dr.Click_Employee_ResetButton();
	}
	@Test(priority=20)
	public void Select_UserGroup_and_Click_Assign_Button() {
		dr.iframe_switchto_F1();
		dr.Select_UserGroup();
		dr.Click_Back_Button_User_Assign_group();
	}
	

	//	@Test(priority=9)
	//	public void Click_Back_Button_Reverse_View_ReportEmployee() {
	//		dr.Click_Back_Button();
	//	}
	//	
	//	@Test(priority=10)
	//	public void Click_Link_Text_newrpoet() {
	//		dr.Click_REP012_Link_text();
	//	}
	//	@AfterSuite
	//	public void teardown() {
	//		closure();
	//	}
	//	

}
