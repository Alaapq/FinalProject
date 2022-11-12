package com.finalProject.pageObject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddAddressesCustomerPage {


	WebDriver ldriver;
	public AddAddressesCustomerPage (WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}

	@FindBy(how = How.XPATH, using ="/html[1]/body[1]/div[6]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]")
	@CacheLookup
	WebElement lnkMyAccount;

	@FindBy(how = How.XPATH, using ="/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]")
	@CacheLookup
	WebElement lnkAddAddresses;

	@FindBy(how = How.XPATH, using ="/html[1]/body[1]/div[6]/div[3]/div[1]/div[2]/div[1]/div[1]/h1[1]")
	@CacheLookup
	WebElement lnkTitlePage;

	@FindBy(how = How.XPATH, using ="/html[1]/body[1]/div[6]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]")
	@CacheLookup
	WebElement lnkTitleNoAddresses;

	@FindBy(how = How.XPATH, using ="/html[1]/body[1]/div[6]/div[3]/div[1]/div[2]/div[1]/div[2]/div[2]/button[1]")
	@CacheLookup
	WebElement btnAddAddresses;

	@FindBy(how = How.XPATH, using ="/html[1]/body[1]/div[6]/div[3]/div[1]/div[2]/form[1]/div[1]/div[1]/h1[1]")
	@CacheLookup
	WebElement lnkTitleAddNewAddress;

	@FindBy(how = How.ID, using = "Address_FirstName")
	@CacheLookup
	WebElement txtFirstName;

	@FindBy(how = How.ID, using = "Address_LastName")
	@CacheLookup
	WebElement txtLastName;

	@FindBy(how = How.ID, using = "Address_Email")
	@CacheLookup
	WebElement txtEmail;

	@FindBy(how = How.ID, using = "Address_Company")
	@CacheLookup
	WebElement txtCompany;

	@FindBy(how = How.ID, using = "Address_City")
	@CacheLookup
	WebElement txtCity;

	@FindBy(how = How.ID, using = "Address_Address1")
	@CacheLookup
	WebElement txtAddress1;

	@FindBy(how = How.ID, using = "Address_Address2")
	@CacheLookup
	WebElement txtAddress2;

	@FindBy(how = How.ID, using = "Address_ZipPostalCode")
	@CacheLookup
	WebElement txtAddressZipPostalCode;

	@FindBy(how = How.ID, using = "Address_PhoneNumber")
	@CacheLookup
	WebElement txtPhoneNumber;

	@FindBy(how = How.ID, using = "Address_FaxNumber")
	@CacheLookup
	WebElement txtFaxNumber;

	@FindBy(how = How.XPATH, using ="/html[1]/body[1]/div[6]/div[3]/div[1]/div[2]/form[1]/div[1]/div[2]/div[2]/button[1]")
	@CacheLookup
	WebElement btnSave;

	@FindBy(how = How.XPATH, using ="/html[1]/body[1]/div[6]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/button[1]")
	@CacheLookup
	WebElement btnEditAddress;

	@FindBy(how = How.XPATH, using ="/html[1]/body[1]/div[6]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/button[2]")
	@CacheLookup
	WebElement btnDeleteAddress;

	@FindBy(how = How.ID, using = "Address_CountryId")
	@CacheLookup
	WebElement selCountryId;
	//List<WebElement> selCountryId;

	@FindBy(how = How.ID, using = "Address_StateProvinceId")
	@CacheLookup
	WebElement selStateProvinceId;




	// shows error

	@FindBy(how = How.XPATH, using ="/html[1]/body[1]/div[6]/div[3]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[1]/span[2]/span[1]")
	@CacheLookup
	WebElement errorFirstName;

	@FindBy(how = How.XPATH, using ="/html[1]/body[1]/div[6]/div[3]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[2]/span[2]/span[1]")
	@CacheLookup
	WebElement errorLastName;

	@FindBy(how = How.XPATH, using ="/html[1]/body[1]/div[6]/div[3]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[3]/span[2]/span[1]")
	@CacheLookup
	WebElement errorEmail;

	@FindBy(how = How.XPATH, using ="/html[1]/body[1]/div[6]/div[3]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[7]/span[2]/span[1]")
	@CacheLookup
	WebElement errorCity;

	@FindBy(how = How.XPATH, using ="/html[1]/body[1]/div[6]/div[3]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[8]/span[2]/span[1]")
	@CacheLookup
	WebElement errorStreetAddress;

	@FindBy(how = How.XPATH, using ="/html[1]/body[1]/div[6]/div[3]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[10]/span[2]/span[1]")
	@CacheLookup
	WebElement errorZipPostalCode;

	@FindBy(how = How.XPATH, using ="/html[1]/body[1]/div[6]/div[3]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[11]/span[2]/span[1]")
	@CacheLookup
	WebElement errorPhone;


	@FindBy(how = How.CLASS_NAME, using="address-list")
	@CacheLookup
	WebElement thereIsAddressSection;


	@FindBy(how = How.CLASS_NAME, using="no-data")
	@CacheLookup
	WebElement NoAddressesSection;


	@FindBy(how = How.XPATH, using ="/html[1]/body[1]/div[6]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/button[1]")
	@CacheLookup
	WebElement btnedit;


	@FindBy(how = How.XPATH, using ="/html[1]/body[1]/div[6]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/button[2]")
	@CacheLookup
	WebElement btndelete;


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

		try {
			if(errorCity.isDisplayed()) {
				return false;
			}

		} catch (Exception e) {
			 System.out.println("@ errorCity  " +e.getMessage());
		}


		try {
			if(errorStreetAddress.isDisplayed()) {
				return false;
			}

		} catch (Exception e) {
			 System.out.println("@ errorStreetAddress  " +e.getMessage());
		}


		try {
			if(errorZipPostalCode.isDisplayed()) {
				return false;
			}

		} catch (Exception e) {
			 System.out.println("@ errorZipPostalCode  " +e.getMessage());
		}

		try {
			if(errorPhone.isDisplayed()) {
				return false;
			}

		} catch (Exception e) {
			 System.out.println("@ errorPhone  " +e.getMessage());
		}

		return true;


	}




	public void btnDeleteAddress() {
		btnDeleteAddress.click();
	}
	public void btnEditAddress() {
		btnEditAddress.click();
	}


	public void lnkMyAccount() {
		lnkMyAccount.click();

	}

	public void btnSave() {
		btnSave.click();

	}


	public void btnedit() {
		btnedit.click();

	}

	public void clearFlds() {

		txtFirstName.clear();
		txtLastName.clear();
		txtEmail.clear();
		txtCompany.clear();
		txtCity.clear();
		txtAddress1.clear();
		txtAddress2.clear();
		txtAddressZipPostalCode.clear();
		txtPhoneNumber.clear();
		txtFaxNumber.clear();
		//selCountryId.clear();
		//selStateProvinceId.clear();
	}


	public void btndelete() {
		btndelete.click();

	}

	public void txtFaxNumber(String id) {
		txtFaxNumber.sendKeys(id);

	}


	public void txtPhoneNumber(String id) {
		txtPhoneNumber.sendKeys(id);

	}


	public void txtAddressZipPostalCode(String id) {
		txtAddressZipPostalCode.sendKeys(id);

	}


	public void txtAddress2(String id) {
		txtAddress2.sendKeys(id);

	}


	public void txtAddress1(String id) {
		txtAddress1.sendKeys(id);

	}


	public void txtCity(String id) {
		txtCity.sendKeys(id);

	}


	public void txtCompany(String id) {
		txtCompany.sendKeys(id);

	}


	public void txtEmail(String id) {
		txtEmail.sendKeys(id);

	}

	public void txtLastName(String id) {
		txtLastName.sendKeys(id);

	}

	public void txtFirstName(String id) {
		txtFirstName.sendKeys(id);

	}


	public String lnkTitleAddNewAddress()
	{
		return lnkTitleAddNewAddress.getText();
	}

	public void btnAddAddresses() {
		btnAddAddresses.click();
	}

	public void clickLnkAddAddresses() {
		lnkAddAddresses.click();
	}

	public String lnkTitlePage()
	{
		return lnkTitlePage.getText();
	}

	public String lnkTitleNoAddresses()
	{
		return lnkTitleNoAddresses.getText();
	}

	public void selCountryId() {
		//selAccount.sendKeys("Current");
		try {
			Select se= new Select (selCountryId);
			List<String> orginal = new ArrayList<>();
			List <WebElement> ops=se.getOptions();
			for (WebElement e:ops) {
				orginal.add(e.getText());
			}
			System.out.println("@ addNewAccount selCountryId "+orginal);
			ops.get(3).click();


		} catch (Exception e) {
			System.out.println("@ addNewAccount selCountryId error "+e.getMessage());
		}


	}

	public void selStateProvinceId() {
		//selAccount.sendKeys("Current");
		try {
			Select se= new Select (selStateProvinceId);
			List<String> orginal = new ArrayList<>();
			List <WebElement> ops=se.getOptions();
			for (WebElement e:ops) {
				orginal.add(e.getText());
			}
			System.out.println("@ addNewAccount selStateProvinceId "+orginal);
			ops.get(0).click();

		} catch (Exception e) {
			System.out.println("@ addNewAccount selStateProvinceId error "+e.getMessage());
		}

	}



	public boolean thereIsAddressSection() {

		try {
		if(thereIsAddressSection.isDisplayed()) {
			return true;
		}

		} catch (Exception e) {
			System.out.println("@ addNewAccount thereIsAddressSection error "+e.getMessage());
		}
		return false;
	}

	public boolean NoAddressesSection() {

		try {
		if(NoAddressesSection.isDisplayed()) {
			return false;
		}

		} catch (Exception e) {
			System.out.println("@ addNewAccount NoAddressesSection error "+e.getMessage());
		}
		return true;
	}













}
