package com.finalProject.testCases;

import com.finalProject.utilities.ReadPositionConfig;

public class BasePosition {


	  ReadPositionConfig positionconfig =new ReadPositionConfig();
// #loginPage

	public String loginPageEmail=positionconfig.getLoginPageEmail();
	public String loginPagePassword=positionconfig.getloginPagePassword();
	public String loginPageLoginButton=positionconfig.getloginPageLoginButton();
	public String loginPagePassNotCorrect=positionconfig.getloginPagePassNotCorrect();
	public String loginPageBtnContiune=positionconfig.getloginPageBtnContiune();
	public String loginPageLnkLogout=positionconfig.getloginPageLnkLogout();

	// #addCustomerPage
	public String addCustomerPageLnkaddNewCustomer=positionconfig.getaddCustomerPageLnkaddNewCustomer();
	public String addCustomerPageLnkRegistration=positionconfig.getaddCustomerPageLnkRegistration();
	public String addCustomerPageBoxGender=positionconfig.getaddCustomerPageBoxGender();
	public String addCustomerPageTxtFirstName=positionconfig.getaddCustomerPageTxtFirstName();
	public String addCustomerPageTxtLastName=positionconfig.getaddCustomerPageTxtLastName();
	public String addCustomerPageSelDateOfBirthDay=positionconfig.getaddCustomerPageSelDateOfBirthDay();
	public String addCustomerPageSelDateOfBirthMonth=positionconfig.getaddCustomerPageSelDateOfBirthMonth();
	public String addCustomerPageSelDateOfBirthYear=positionconfig.getaddCustomerPageSelDateOfBirthYear();
	public String addCustomerPageTxtEmail=positionconfig.getaddCustomerPageTxtEmail();
	public String addCustomerPageTxtCompanyName=positionconfig.getaddCustomerPageTxtCompanyName();
	public String addCustomerPageChkNewsletter=positionconfig.getaddCustomerPageChkNewsletter();
	public String addCustomerPageTxtPassword=positionconfig.getaddCustomerPageTxtPassword();
	public String addCustomerPageTxtConfirmPassword=positionconfig.getaddCustomerPageTxtConfirmPassword();
	public String addCustomerPageBtnFinalRegisteration=positionconfig.getaddCustomerPageBtnFinalRegisteration();
	public String addCustomerPageLnkSuccess=positionconfig.getaddCustomerPageLnkSuccess();
	public String addCustomerPageBtnContiune=positionconfig.getaddCustomerPageBtnContiune();

	// #addAddressesCustomerPage
	public String addAddressesCustomerPageLnkMyAccount=positionconfig.getaddAddressesCustomerPageLnkMyAccount();
	public String addAddressesCustomerPageLnkAddAddresses=positionconfig.getaddAddressesCustomerPageLnkAddAddresses();
	public String addAddressesCustomerPageLnkTitlePage=positionconfig.getaddAddressesCustomerPageLnkTitlePage();
	public String addAddressesCustomerPageLnkTitleNoAddresses=positionconfig.getaddAddressesCustomerPageLnkTitleNoAddresses();
	public String addAddressesCustomerPageBtnAddAddresses=positionconfig.getaddAddressesCustomerPageBtnAddAddresses();
	public String addAddressesCustomerPageLnkTitleAddNewAddress=positionconfig.getaddAddressesCustomerPageLnkTitleAddNewAddress();
	public String addAddressesCustomerPagetxtFirstName=positionconfig.getaddAddressesCustomerPagetxtFirstName();
	public String addAddressesCustomerPagetxtLastName=positionconfig.getaddAddressesCustomerPagetxtLastName();
	public String addAddressesCustomerPagetxtEmail=positionconfig.getaddAddressesCustomerPagetxtEmail();
	public String addAddressesCustomerPagetxtCompany=positionconfig.getaddAddressesCustomerPagetxtCompany();
	public String addAddressesCustomerPagetxtCity=positionconfig.getaddAddressesCustomerPagetxtCity();
	public String addAddressesCustomerPagetxtAddress1=positionconfig.getaddAddressesCustomerPagetxtAddress1();
	public String addAddressesCustomerPagetxtAddress2=positionconfig.getaddAddressesCustomerPagetxtAddress2();
	public String addAddressesCustomerPagetxtAddressZipPostalCode=positionconfig.getaddAddressesCustomerPagetxtAddressZipPostalCode();
	public String addAddressesCustomerPagetxtPhoneNumber=positionconfig.getaddAddressesCustomerPagetxtPhoneNumber();
	public String addAddressesCustomerPagetxtFaxNumber=positionconfig.getaddAddressesCustomerPagetxtFaxNumber();
	public String addAddressesCustomerPagebtnSave=positionconfig.getaddAddressesCustomerPagebtnSave();
	public String addAddressesCustomerPagebtnEditAddress=positionconfig.getaddAddressesCustomerPagebtnEditAddress();
	public String addAddressesCustomerPagebtnDeleteAddress=positionconfig.getaddAddressesCustomerPagebtnDeleteAddress();
	public String addAddressesCustomerPageselCountryId=positionconfig.getaddAddressesCustomerPageselCountryId();
	public String addAddressesCustomerPageselStateProvinceId=positionconfig.getaddAddressesCustomerPageselStateProvinceId();
	public String addAddressesCustomerPageerrorFirstName=positionconfig.getaddAddressesCustomerPageerrorFirstName();
	public String addAddressesCustomerPageerrorLastName=positionconfig.getaddAddressesCustomerPageerrorLastName();
	public String addAddressesCustomerPageerrorEmail=positionconfig.getaddAddressesCustomerPageerrorEmail();
	public String addAddressesCustomerPageerrorCity=positionconfig.getaddAddressesCustomerPageerrorCity();
	public String addAddressesCustomerPageerrorStreetAddress=positionconfig.getaddAddressesCustomerPageerrorStreetAddress();
	public String addAddressesCustomerPageerrorZipPostalCode=positionconfig.getaddAddressesCustomerPageerrorZipPostalCode();
	public String addAddressesCustomerPageerrorPhone=positionconfig.getaddAddressesCustomerPageerrorPhone();
	public String addAddressesCustomerPagethereIsAddressSection=positionconfig.getaddAddressesCustomerPagethereIsAddressSection();
	public String addAddressesCustomerPageNoAddressesSection=positionconfig.getaddAddressesCustomerPageNoAddressesSection();
	public String addAddressesCustomerPagebtnedit=positionconfig.getaddAddressesCustomerPagebtnedit();
	public String addAddressesCustomerPagebtndelete=positionconfig.getaddAddressesCustomerPagebtndelete();

	// #addNewAccountPage
	public String addNewAccountPagelnkAddAccount=positionconfig.getaddNewAccountlnkAddAccount();
	public String addNewAccountPagetxtCustomerId=positionconfig.getaddNewAccounttxtCustomerId();
	public String addNewAccountPageselopt1=positionconfig.getaddNewAccountselopt1();
	public String addNewAccountPageselopt2=positionconfig.getaddNewAccountselopt2();
	public String addNewAccountPagetxtInitialDeposit=positionconfig.getaddNewAccounttxtInitialDeposit();
	public String addNewAccountPagebtnSub=positionconfig.getaddNewAccountbtnSub();

	// #createOrderPage
	public String createOrderPagelnkComputerbtn=positionconfig.getcreateOrderlnkComputerbtn();
	public String createOrderPagelnkComputer=positionconfig.getcreateOrderlnkComputer();
	public String createOrderPagelnkItemGrid=positionconfig.getcreateOrderlnkItemGrid();
	public String createOrderPagelnkItemGridClass=positionconfig.getcreateOrderlnkItemGridClass();
	public String createOrderPagelnkAvailability=positionconfig.getcreateOrderlnkAvailability();
	public String createOrderPagelnkAttributes=positionconfig.getcreateOrderlnkAttributes();
	public String createOrderPagelstOfProcessor=positionconfig.getcreateOrderlstOfProcessor();
	public String createOrderPagelstOfRAM=positionconfig.getcreateOrderlstOfRAM();
	public String createOrderPagelstOfHDD=positionconfig.getcreateOrderlstOfHDD();
	public String createOrderPagenotificationSuccess=positionconfig.getcreateOrdernotificationSuccess();
	public String createOrderPageAddToCart=positionconfig.getcreateOrderAddToCart();
	public String createOrderPagelnkdelivery=positionconfig.getcreateOrderlnkdelivery();
	public String createOrderPagelnkMfpClose=positionconfig.getcreateOrderlnkMfpClose();
	public String createOrderPageCnkProductEstimateShipping=positionconfig.getcreateOrderCnkProductEstimateShipping();
	public String createOrderPageselCountryId=positionconfig.getcreateOrderselCountryId();
	public String createOrderPageselStateProvinceId=positionconfig.getcreateOrderselStateProvinceId();
	public String createOrderPagetxtZipPostalCode=positionconfig.getcreateOrdertxtZipPostalCode();
	public String createOrderPagebtnApply=positionconfig.getcreateOrderbtnApply();
	public String createOrderPagechkMessageFailure=positionconfig.getcreateOrderchkMessageFailure();

	// #editCustomerPage
	public String editCustomerPagelnkMyAccount=positionconfig.geteditCustomerPagelnkMyAccount();
	public String editCustomerPagelnkCustomerInfo=positionconfig.geteditCustomerPagelnkCustomerInfo();
	public String editCustomerPagelnkTitleCustomerInfo=positionconfig.geteditCustomerPagelnkTitleCustomerInfo();
	public String editCustomerPageboxGender=positionconfig.geteditCustomerPageboxGender();
	public String editCustomerPagetxtFirstName=positionconfig.geteditCustomerPagetxtFirstName();
	public String editCustomerPagetxtLastName=positionconfig.geteditCustomerPagetxtLastName();
	public String editCustomerPageselDateOfBirthDay=positionconfig.geteditCustomerPageselDateOfBirthDay();
	public String editCustomerPageselDateOfBirthMonth=positionconfig.geteditCustomerPageselDateOfBirthMonth();
	public String editCustomerPageselDateOfBirthYear=positionconfig.geteditCustomerPageselDateOfBirthYear();
	public String editCustomerPagetxtCompanyName=positionconfig.geteditCustomerPagetxtCompanyName();
	public String editCustomerPagechkNewsletter=positionconfig.geteditCustomerPagechkNewsletter();
	public String editCustomerPagebtnSave=positionconfig.geteditCustomerPagebtnSave();
	public String editCustomerPageerrorFirstName=positionconfig.geteditCustomerPageerrorFirstName();
	public String editCustomerPageerrorLastName=positionconfig.geteditCustomerPageerrorLastName();
	public String editCustomerPageerrorEmail=positionconfig.geteditCustomerPageerrorEmail();



}
