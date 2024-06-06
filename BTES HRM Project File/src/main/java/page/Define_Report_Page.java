package page;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import TestBase.TestBase;

public class Define_Report_Page extends TestBase {
	WebDriver driver;


	public Define_Report_Page(WebDriver driver)
	{ 	
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='txtUserName']")
	WebElement username_txtbox;

	@FindBy(xpath="//input[@name='txtPassword']")
	WebElement password_txtbox;

	@FindBy(xpath="//input[@name='Submit']")
	WebElement login_button;

	@FindBy(linkText ="Reports")
	WebElement Reportdrop;

	@FindBy(linkText="Define Reports")
	WebElement Define_Report_Link;

	@FindBy(xpath ="//iframe[@id='rightMenu']")
	WebElement iframe;

	@FindBy(xpath ="//select[@name='loc_code']")
	WebElement Select_drop;

	@FindBy(xpath ="//input[@name='loc_name']")
	WebElement Search_text_box;

	@FindBy(css="input[value=Search]")
	WebElement Search_button;

	@FindBy(css="input[value=Reset]")
	WebElement Reset_Button;

	@FindBy(css="input[value=Add")
	WebElement Add_New_Text;

	@FindBy(css="input[name=txtRepName")
	WebElement Report_name_Text_box;

	@FindBy(css="#EMPNO")
	WebElement Click_CheckBox_button;

	@FindBy(css="select[name=cmbId]")
	WebElement Select_Drop_Box;

	@FindBy(css="input[name=empPop]")
	WebElement Employee_popup_Button;

	@FindBy(css="#AgeGroup")
	WebElement Employee_Age_Group;

	@FindBy(css="select[name=cmbAgeCode]")
	WebElement Select_Comparison_drop_box;

	@FindBy(css="input[name=txtEmpAge1]")
	WebElement Text_Age1_in_AgeText_Box;

	@FindBy(css="#PayGrade")
	WebElement Pay_Grade_CheckBox_Button;

	@FindBy(css="select[name=cmbSalGrd]")
	WebElement Select_Salary_Grade;


	@FindBy(css="#QualType")
	WebElement Education_Check_Box_Button;

	@FindBy(css="select[name=TypeCode]")
	WebElement Select_Education_Type;

	@FindBy(css="#EmpType")
	WebElement Employee_Status_Check_Box_Button;

	@FindBy(css="select[name=cmbEmpType]")
	WebElement Select_Employee_Type;

	@FindBy(css="#SerPeriod")
	WebElement Serivce_period_Check_Box_Button;


	@FindBy(css="select[name=cmbSerPerCode]")
	WebElement Select_service_period_Comparison;

	@FindBy(css="input[name=Service1]")
	WebElement Type_in_Years;


	@FindBy(css="#JoinedDate")
	WebElement Join_Date_Check_Box_Button;

	@FindBy(css="select[name=cmbJoiDatCode]")
	WebElement Select_Join_Date_code;

	@FindBy(css="input[name=Join1Button]")
	WebElement Celender_join1_Date;

	@FindBy(linkText="10")
	WebElement fetch_Date;

	@FindBy(css="#JobTitle")
	WebElement Job_Title_Check_Box_Button;

	@FindBy(css="select[name=cmbDesig]")
	WebElement Select_JobTitle;

	@FindBy(css="#Language")
	WebElement Language_Check_Box_Button;

	@FindBy(css="select[name=cmbLanguage]")
	WebElement Select_Language;

	@FindBy(css="#Skill")
	WebElement Skill_check_Box_button;


	@FindBy(css="select[name=cmbSkill]")
	WebElement Select_Skill;
	
	@FindBy(css="input[value=Save]")
	WebElement Click_Employee_Save_Button;
	
	@FindBy(css="#rightMenu")
	WebElement iframe_F1;
	
	@FindBy(css="#cmbUserGroup")
	WebElement Select_user_Group;
	
	
	
//	@FindBy(css="input[value=Reset]")
//	WebElement Click_Employee_Reset_Button;
	
	@FindBy(css="input[value=Back]")
	WebElement Clik_Back_Button;




	//	@FindBy(linkText="REP012")
	//	WebElement link_newreport;
	//	
	//	@FindBy(css="input[value=Back]")
	//	WebElement Back_Button;




	public void Enterdata_username_textBox(String uname) {
		username_txtbox.sendKeys(uname);
	}
	public void Enterdata_Password_textBox(String password) {
		password_txtbox.sendKeys(password);
	}
	public void Click_Login_Button() {
		login_button.click();
	}


	public void Mouse_Hover_on_Report() {
		Actions ac = new Actions(driver);
		ac.moveToElement(Reportdrop).build().perform();
	}
	public void Click_Define_Report() {
		Define_Report_Link.click();
	}
	public void Switch_TO_iframe() {
		driver.switchTo().frame(iframe);
	}
	public void Access_Select_Drop_Id() {
		Select s
		= new Select(Select_drop);
		s.selectByVisibleText("ID");
	}
	public void Enter_Id_Search_TextBox(String Id) {
		Search_text_box.sendKeys(Id);
	}
	public void Click_Search_Button() {
		Search_button.click();
	}
	public void Click_Reset_Button() {
		Reset_Button.click();

	}
	public void Click_Add_Button() {
		Add_New_Text.click();
	}
	public void Enter_Report_Name_Textbox(String report) {
		Report_name_Text_box.sendKeys(report);
	}
	public void Click_CheckBox_Button() {
		Click_CheckBox_button.click();
	}
	public void Select_drop_box_using_selectclass() {
		Select sc = new Select(Select_Drop_Box);
		sc.selectByValue("1");
	}
	public void Click_Employee_Popup_button() {

		Employee_popup_Button.click();
	}

	public void Click_Employee_Age_Group_CheckBox() {
		Employee_Age_Group.click();
	}
	public void Select_ComparisonDrop_box() {
		Select sc = new Select(Select_Comparison_drop_box);
		sc.selectByVisibleText("Greater Than");
	}
	public void Enter_Age1_TextBox(String age) {
		Text_Age1_in_AgeText_Box.sendKeys(age);
	}
	public void Click_Pay_Grade_Check_boxButton() {
		Pay_Grade_CheckBox_Button.click();
	}
	public void Acess_SelectDrop_and_Select_salary_Grade() {
		Select sg = new Select(Select_Salary_Grade);
		sg.selectByValue("SAL034");
	}
	public void Click_Education__Check_boxButton() {
		Education_Check_Box_Button .click();
	}
	public void Acess_SelectDrop_and_Select_Education_Type() {
		Select ed = new Select(Select_Education_Type);
		ed.selectByValue("EDU028");
	}
	public void Click_Employee_Status__Check_boxButton() {
		Employee_Status_Check_Box_Button .click();
	}
	public void Acess_Select_Emloyee_status_Type() {
		Select ed = new Select( Select_Employee_Type);
		ed.selectByValue("EST010");
	}
	public void Click_service_period__Check_boxButton() {
		Serivce_period_Check_Box_Button .click();
	}

	public void Acess_Serivce_period() {
		Select ed = new Select(Select_service_period_Comparison);
		ed.selectByVisibleText("Greater Than");
	}
	public void Enetr_Types_in_Yesr_TextBox(String year) {
		Type_in_Years.clear();
		Type_in_Years.sendKeys(year);

	}
	public void Click_Join_Date__Check_boxButton() {
		Join_Date_Check_Box_Button .click();
	}

	public void Acess_Join_Date_drop() {
		Select jd = new Select(Select_Join_Date_code);
		jd.selectByVisibleText("Joined After");
	}
	public void Click_Celendar_Join1_date() {
		Celender_join1_Date.click();
	}
	public void Click_date_in_Clender() {
		fetch_Date.click();
	}
	public void Click_Job_Title_CheckBox_Button() {
		Job_Title_Check_Box_Button.click();
	}
	public void Acess_Job_Title_drop() {
		Select jt = new Select(Select_JobTitle);
		jt.selectByVisibleText("JOB013");
	}
	public void Click_Language_CheckBox_Button() {
		Language_Check_Box_Button.click();
	}
	public void Acess_Language_drop() {
		Select laug = new Select(Select_Language);
		laug.selectByValue("LAN018");
	}
	public void Click_Skill_checkBox_button() {
		Skill_check_Box_button.click();
	}
	public void Acess_Skill_drop() {
		Select skill = new Select(Select_Skill);
		skill.selectByValue("SKI028");
	}
	public void Click_Employee_SaveButton() {
		Click_Employee_Save_Button.click();
	}
	public void iframe_switchto_F1() {
		driver.switchTo().frame(iframe_F1);
	}
	public void Select_UserGroup() {
		Select sc = new Select(Select_user_Group);
		sc.selectByVisibleText("level2");
	}
//	public void Click_Employee_ResetButton() {
//		Click_Employee_Reset_Button.click();
//	}
	
	public void Click_Back_Button_User_Assign_group() {
		Clik_Back_Button.click();
	}







	//	public void Click_REP012_Link_text() {
	//		link_newreport.click();
	//	}
	//	public void Click_Back_Button() {
	//		Back_Button.click();
	//	}
	public void login(String uname,String password) {
		username_txtbox.sendKeys(uname);
		password_txtbox.sendKeys(password);
		login_button.click();
	}


}
