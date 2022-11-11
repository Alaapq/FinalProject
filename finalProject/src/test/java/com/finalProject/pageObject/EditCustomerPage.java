package com.finalProject.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class EditCustomerPage {

	WebDriver ldriver;
	public EditCustomerPage (WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}

	@FindBy(how = How.XPATH, using ="/html[1]/body[1]/div[6]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]")
	@CacheLookup
	WebElement lnkMyAccount;



	@FindBy(how = How.XPATH, using ="/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/a[1]")
	@CacheLookup
	WebElement lnkCustomerInfo;


	@FindBy(how = How.XPATH, using ="/html[1]/body[1]/div[6]/div[3]/div[1]/div[2]/div[1]/div[1]/h1[1]")
	@CacheLookup
	WebElement lnkTitleCustomerInfo;



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


	@FindBy(how = How.ID, using = "Company")
	@CacheLookup
	WebElement txtCompanyName;


	@FindBy(how = How.ID, using = "Newsletter")
	@CacheLookup
	WebElement chkNewsletter;


	@FindBy(how = How.ID, using ="save-info-button")
	@CacheLookup
	WebElement btnSave;



	// After save if that any error these will appare

	@FindBy(how = How.ID, using = "FirstName-error")
	@CacheLookup
	WebElement errorFirstName;

	@FindBy(how = How.ID, using = "LastName-error")
	@CacheLookup
	WebElement errorLastName;

	@FindBy(how = How.ID, using = "Email-error")
	@CacheLookup
	WebElement errorEmail;



	public boolean chekError() {
		try {
			if(errorFirstName.isDisplayed()) {
				return false;
			}
		} catch (Exception e) {
			 System.out.println("@ errorFirstNam  " +e.getMessage());
		}
		try {
			if(errorLastName.isDisplayed()) {
				return false;
			}

		} catch (Exception e) {
			 System.out.println("@ errorLastName  " +e.getMessage());
		}

		try {
			if(errorEmail.isDisplayed()) {
				return false;
			}

		} catch (Exception e) {
			 System.out.println("@ errorEmail  " +e.getMessage());
		}

			return true;


	}




	public void clicklnkMyAccount() {
		lnkMyAccount.click();

	}

	public void clicklnkCustomerInfo() {
		lnkCustomerInfo.click();

	}


	public void boxGender() {
		boxGender.click();
	}


	public void txtFirstName(String cname) {
		txtFirstName.sendKeys(cname);

	}


	public void txtLastName(String cname) {
		//txtLastName.sendKeys(cname);
		txtLastName.clear();
		txtLastName.sendKeys(cname);
	}



	public void custdob(String mm,String dd,String yy) {
		selDateOfBirthDay.sendKeys(dd);
		selDateOfBirthMonth.sendKeys(mm);
		selDateOfBirthYear.sendKeys(yy);
	}


	public void txtCompanyName(String ress) {
		txtCompanyName.sendKeys(ress);
	}

	public boolean chkNewsletter() {
		return chkNewsletter.isEnabled();
	}


	public void setchkNewsletter() {
		chkNewsletter.click();
	}


	public void clickbtnSave() {
		btnSave.click();

	}


	public String lnkTitleCustomerInfo()
	{
		return lnkTitleCustomerInfo.getText();
	}






}
