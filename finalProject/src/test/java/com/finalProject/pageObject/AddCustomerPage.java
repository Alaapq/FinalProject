package com.finalProject.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage{

	WebDriver ldriver;
	public AddCustomerPage (WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}

	@FindBy(how = How.XPATH, using ="/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/button[1]")
	@CacheLookup
	WebElement lnkAddNewCustomer;


	@FindBy(how = How.XPATH, using ="/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]/h1[1]")
	@CacheLookup
	WebElement lnkRegistration;


	@FindBy(how = How.ID, using = "gender-male")
	@CacheLookup
	WebElement boxGender;


	@FindBy(how = How.ID, using = "FirstName")
	@CacheLookup
	WebElement txtFirstName;


	@FindBy(how = How.ID, using = "LastName")
	@CacheLookup
	WebElement txtLastName;

	@FindBy(how = How.NAME, using = "DateOfBirthDay")
	@CacheLookup
	WebElement selDateOfBirthDay;


	@FindBy(how = How.NAME, using = "DateOfBirthMonth")
	@CacheLookup
	WebElement selDateOfBirthMonth;

	@FindBy(how = How.NAME, using = "DateOfBirthYear")
	@CacheLookup
	WebElement selDateOfBirthYear;

	@FindBy(how = How.ID_OR_NAME, using = "Email")
	@CacheLookup
	WebElement txtEmail;


	@FindBy(how = How.ID, using = "Company")
	@CacheLookup
	WebElement txtCompanyName;


	@FindBy(how = How.ID, using = "Newsletter")
	@CacheLookup
	WebElement chkNewsletter;


	@FindBy(how = How.ID, using = "Password")
	@CacheLookup
	WebElement txtPassword;


	@FindBy(how = How.ID, using = "ConfirmPassword")
	@CacheLookup
	WebElement txtConfirmPassword;


	@FindBy(how = How.ID_OR_NAME, using ="register-button")
	@CacheLookup
	WebElement btnFinalRegisteration;



	@FindBy(how = How.XPATH, using ="/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]")
	@CacheLookup
	WebElement lnkSuccess;



	@FindBy(how = How.XPATH, using ="/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/a[1]")
	@CacheLookup
	WebElement btnContiune;

	public void clickAddNewCustomer() {
		lnkAddNewCustomer.click();

	}

	public String lnkRegistration()
	{
		return lnkRegistration.getText();
	}

	public String lnkSuccess()
	{
		return lnkSuccess.getText();
	}



	public void boxGender() {
		boxGender.click();
	}


	public void txtFirstName(String cname) {
		txtFirstName.sendKeys(cname);

	}


	public void txtLastName(String cname) {
		txtLastName.sendKeys(cname);

	}

	public void txtEmail(String cname) {
		txtEmail.sendKeys(cname);

	}



	public void custdob(String mm,String dd,String yy) {
		selDateOfBirthDay.sendKeys(dd);
		selDateOfBirthMonth.sendKeys(mm);
		selDateOfBirthYear.sendKeys(yy);
	}


	public void txtCompanyName(String ress) {
		txtCompanyName.sendKeys(ress);
	}


	public void txtPassword(String ress) {
		txtPassword.sendKeys(ress);
	}

	public void txtConfirmPassword(String ress) {
		txtConfirmPassword.sendKeys(ress);
	}


	public boolean chkNewsletter() {
		return chkNewsletter.isEnabled();
	}

	public void setchkNewsletter() {
		chkNewsletter.click();
	}


	public void btnContiune() {
		btnContiune.click();
	}


	public void btnSubmit() {
		btnFinalRegisteration.click();
	}



}
