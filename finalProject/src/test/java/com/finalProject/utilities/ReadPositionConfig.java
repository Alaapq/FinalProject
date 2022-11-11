package com.finalProject.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadPositionConfig {
	Properties pro;

	public ReadPositionConfig() {
		File src = new File (System.getProperty("user.dir")+"//Configuration//configPosition.properties");

		try {
			FileInputStream fis= new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);

		}catch (Exception e){

			System.out.println("Exception is "+e.getMessage());
		}
	}

	public String getLoginPageEmail() {
		return pro.getProperty("loginPageEmail");
	}

	public String getloginPagePassword() {
		return pro.getProperty("loginPagePassword");
	}

	public String getloginPageLoginButton() {
		return pro.getProperty("loginPageLoginButton");
	}

	public String getloginPagePassNotCorrect() {
		return pro.getProperty("loginPagePassNotCorrect");
	}

	public String getloginPageBtnContiune() {
		return pro.getProperty("loginPageBtnContiune");
	}
	public String getloginPageLnkLogout() {
		return pro.getProperty("loginPageLnkLogout");
	}

	public String getaddCustomerPageLnkaddNewCustomer() {
		return pro.getProperty("addCustomerPageLnkaddNewCustomer");
	}

	public String getaddCustomerPageLnkRegistration() {
		return pro.getProperty("addCustomerPageLnkRegistration");
	}

	public String getaddCustomerPageBoxGender() {
		return pro.getProperty("addCustomerPageBoxGender");
	}

	public String getaddCustomerPageTxtFirstName() {
		return pro.getProperty("addCustomerPageTxtFirstName");
	}

	public String getaddCustomerPageTxtLastName() {
		return pro.getProperty("addCustomerPageTxtLastName");
	}

	public String getaddCustomerPageSelDateOfBirthDay() {
		return pro.getProperty("addCustomerPageSelDateOfBirthDay");
	}

	public String getaddCustomerPageSelDateOfBirthMonth() {
		return pro.getProperty("addCustomerPageSelDateOfBirthMonth");
	}

	public String getaddCustomerPageSelDateOfBirthYear() {
		return pro.getProperty("addCustomerPageSelDateOfBirthYear");
	}

	public String getaddCustomerPageTxtEmail() {
		return pro.getProperty("addCustomerPageTxtEmail");
	}

	public String getaddCustomerPageTxtCompanyName() {
		return pro.getProperty("addCustomerPageTxtCompanyName");
	}

	public String getaddCustomerPageChkNewsletter() {
		return pro.getProperty("addCustomerPageChkNewsletter");
	}

	public String getaddCustomerPageTxtPassword() {
		return pro.getProperty("addCustomerPageTxtPassword");
	}


	public String getaddCustomerPageTxtConfirmPassword() {
		return pro.getProperty("addCustomerPageTxtConfirmPassword");
	}

	public String getaddCustomerPageBtnFinalRegisteration() {
		return pro.getProperty("addCustomerPageBtnFinalRegisteration");
	}


	public String getaddCustomerPageLnkSuccess() {
		return pro.getProperty("addCustomerPageLnkSuccess");
	}

	public String getaddCustomerPageBtnContiune() {
		return pro.getProperty("addCustomerPageBtnContiune");
	}

	public String getaddAddressesCustomerPageLnkMyAccount() {
		return pro.getProperty("addAddressesCustomerPageLnkMyAccount");
	}

	public String getaddAddressesCustomerPageLnkAddAddresses() {
		return pro.getProperty("addAddressesCustomerPageLnkAddAddresses");
	}

	public String getaddAddressesCustomerPageLnkTitlePage() {
		return pro.getProperty("addAddressesCustomerPageLnkTitlePage");
	}

	public String getaddAddressesCustomerPageLnkTitleNoAddresses() {
		return pro.getProperty("addAddressesCustomerPageLnkTitleNoAddresses");
	}

	public String getaddAddressesCustomerPageBtnAddAddresses() {
		return pro.getProperty("addAddressesCustomerPageBtnAddAddresses");
	}


	public String getaddAddressesCustomerPageLnkTitleAddNewAddress() {
		return pro.getProperty("addAddressesCustomerPageLnkTitleAddNewAddress");
	}

	public String getaddAddressesCustomerPagetxtFirstName() {
		return pro.getProperty("addAddressesCustomerPagetxtFirstName");
	}

	public String getaddAddressesCustomerPagetxtLastName() {
		return pro.getProperty("addAddressesCustomerPagetxtLastName");
	}

	public String getaddAddressesCustomerPagetxtEmail() {
		return pro.getProperty("addAddressesCustomerPagetxtEmail");
	}

	public String getaddAddressesCustomerPagetxtCompany() {
		return pro.getProperty("addAddressesCustomerPagetxtCompany");
	}

	public String getaddAddressesCustomerPagetxtCity() {
		return pro.getProperty("addAddressesCustomerPagetxtCity");
	}

	public String getaddAddressesCustomerPagetxtAddress1() {
		return pro.getProperty("addAddressesCustomerPagetxtAddress1");
	}

	public String getaddAddressesCustomerPagetxtAddress2() {
		return pro.getProperty("addAddressesCustomerPagetxtAddress2");
	}

	public String getaddAddressesCustomerPagetxtAddressZipPostalCode() {
		return pro.getProperty("addAddressesCustomerPagetxtAddressZipPostalCode");
	}

	public String getaddAddressesCustomerPagetxtPhoneNumber() {
		return pro.getProperty("addAddressesCustomerPagetxtPhoneNumber");
	}

	public String getaddAddressesCustomerPagetxtFaxNumber() {
		return pro.getProperty("addAddressesCustomerPagetxtFaxNumber");
	}

	public String getaddAddressesCustomerPagebtnSave() {
		return pro.getProperty("addAddressesCustomerPagebtnSave");
	}

	public String getaddAddressesCustomerPagebtnEditAddress() {
		return pro.getProperty("addAddressesCustomerPagebtnEditAddress");
	}

	public String getaddAddressesCustomerPagebtnDeleteAddress() {
		return pro.getProperty("addAddressesCustomerPagebtnDeleteAddress");
	}

	public String getaddAddressesCustomerPageselCountryId() {
		return pro.getProperty("addAddressesCustomerPageselCountryId");
	}

	public String getaddAddressesCustomerPageselStateProvinceId() {
		return pro.getProperty("addAddressesCustomerPageselStateProvinceId");
	}

	public String getaddAddressesCustomerPageerrorFirstName() {
		return pro.getProperty("addAddressesCustomerPageerrorFirstName");
	}

	public String getaddAddressesCustomerPageerrorLastName() {
		return pro.getProperty("addAddressesCustomerPageerrorLastName");
	}

	public String getaddAddressesCustomerPageerrorEmail() {
		return pro.getProperty("addAddressesCustomerPageerrorEmail");
	}


	public String getaddAddressesCustomerPageerrorCity() {
		return pro.getProperty("addAddressesCustomerPageerrorCity");
	}

	public String getaddAddressesCustomerPageerrorStreetAddress() {
		return pro.getProperty("addAddressesCustomerPageerrorStreetAddress");
	}

	public String getaddAddressesCustomerPageerrorZipPostalCode() {
		return pro.getProperty("addAddressesCustomerPageerrorZipPostalCode");
	}

	public String getaddAddressesCustomerPageerrorPhone() {
		return pro.getProperty("addAddressesCustomerPageerrorPhone");
	}

	public String getaddAddressesCustomerPagethereIsAddressSection() {
		return pro.getProperty("addAddressesCustomerPagethereIsAddressSection");
	}

	public String getaddAddressesCustomerPageNoAddressesSection() {
		return pro.getProperty("addAddressesCustomerPageNoAddressesSection");
	}

	public String getaddAddressesCustomerPagebtnedit() {
		return pro.getProperty("addAddressesCustomerPagebtnedit");
	}

	public String getaddAddressesCustomerPagebtndelete() {
		return pro.getProperty("addAddressesCustomerPagebtndelete");
	}

	public String getaddNewAccountlnkAddAccount() {
		return pro.getProperty("addNewAccountlnkAddAccount");
	}

	public String getaddNewAccounttxtCustomerId() {
		return pro.getProperty("addNewAccounttxtCustomerId");
	}

	public String getaddNewAccountselopt1() {
		return pro.getProperty("addNewAccountselopt1");
	}

	public String getaddNewAccountselopt2() {
		return pro.getProperty("addNewAccountselopt2");
	}

	public String getaddNewAccounttxtInitialDeposit() {
		return pro.getProperty("addNewAccounttxtInitialDeposit");
	}

	public String getaddNewAccountbtnSub() {
		return pro.getProperty("addNewAccountbtnSub");
	}

	public String getcreateOrderlnkComputerbtn() {
		return pro.getProperty("createOrderlnkComputerbtn");
	}

	public String getcreateOrderlnkComputer() {
		return pro.getProperty("createOrderlnkComputer");
	}

	public String getcreateOrderlnkItemGrid() {
		return pro.getProperty("createOrderlnkItemGrid");
	}

	public String getcreateOrderlnkItemGridClass() {
		return pro.getProperty("createOrderlnkItemGridClass");
	}

	public String getcreateOrderlnkAvailability() {
		return pro.getProperty("createOrderlnkAvailability");
	}

	public String getcreateOrderlnkAttributes() {
		return pro.getProperty("createOrderlnkAttributes");
	}

	public String getcreateOrderlstOfProcessor() {
		return pro.getProperty("createOrderlstOfProcessor");
	}


	public String getcreateOrderlstOfRAM() {
		return pro.getProperty("createOrderlstOfRAM");
	}

	public String getcreateOrderlstOfHDD() {
		return pro.getProperty("createOrderlstOfHDD");
	}

	public String getcreateOrdernotificationSuccess() {
		return pro.getProperty("createOrdernotificationSuccess");
	}

	public String getcreateOrderAddToCart() {
		return pro.getProperty("createOrderAddToCart");
	}

	public String getcreateOrderlnkdelivery() {
		return pro.getProperty("createOrderlnkdelivery");
	}

	public String getcreateOrderlnkMfpClose() {
		return pro.getProperty("createOrderlnkMfpClose");
	}

	public String getcreateOrderCnkProductEstimateShipping() {
		return pro.getProperty("createOrderCnkProductEstimateShipping");
	}

	public String getcreateOrderselCountryId() {
		return pro.getProperty("createOrderselCountryId");
	}

	public String getcreateOrderselStateProvinceId() {
		return pro.getProperty("createOrderselStateProvinceId");
	}

	public String getcreateOrdertxtZipPostalCode() {
		return pro.getProperty("createOrdertxtZipPostalCode");
	}

	public String getcreateOrderbtnApply() {
		return pro.getProperty("createOrderbtnApply");
	}

	public String getcreateOrderchkMessageFailure() {
		return pro.getProperty("createOrderchkMessageFailure");
	}

	public String geteditCustomerPagelnkMyAccount() {
		return pro.getProperty("editCustomerPagelnkMyAccount");
	}

	public String geteditCustomerPagelnkCustomerInfo() {
		return pro.getProperty("editCustomerPagelnkCustomerInfo");
	}

	public String geteditCustomerPagelnkTitleCustomerInfo() {
		return pro.getProperty("editCustomerPagelnkTitleCustomerInfo");
	}


	public String geteditCustomerPageboxGender() {
		return pro.getProperty("editCustomerPageboxGender");
	}

	public String geteditCustomerPagetxtFirstName() {
		return pro.getProperty("editCustomerPagetxtFirstName");
	}

	public String geteditCustomerPagetxtLastName() {
		return pro.getProperty("editCustomerPagetxtLastName");
	}

	public String geteditCustomerPageselDateOfBirthDay() {
		return pro.getProperty("editCustomerPageselDateOfBirthDay");
	}


	public String geteditCustomerPageselDateOfBirthMonth() {
		return pro.getProperty("editCustomerPageselDateOfBirthMonth");
	}

	public String geteditCustomerPageselDateOfBirthYear() {
		return pro.getProperty("editCustomerPageselDateOfBirthYear");
	}

	public String geteditCustomerPagetxtCompanyName() {
		return pro.getProperty("editCustomerPagetxtCompanyName");
	}

	public String geteditCustomerPagechkNewsletter() {
		return pro.getProperty("editCustomerPagechkNewsletter");
	}

	public String geteditCustomerPagebtnSave() {
		return pro.getProperty("editCustomerPagebtnSave");
	}

	public String geteditCustomerPageerrorFirstName() {
		return pro.getProperty("editCustomerPageerrorFirstName");
	}

	public String geteditCustomerPageerrorLastName() {
		return pro.getProperty("editCustomerPageerrorLastName");
	}

	public String geteditCustomerPageerrorEmail() {
		return pro.getProperty("editCustomerPageerrorEmail");
	}








}
