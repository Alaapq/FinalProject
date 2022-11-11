package com.finalProject.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.finalProject.testCases.BaseClass;

public class LoginPage extends BaseClass{

	 WebDriver ldriver;

	 public LoginPage (WebDriver rdriver){

	 		ldriver=rdriver;
	 		PageFactory.initElements(rdriver, this);
	 	}

	 	@FindBy(id ="Email")
	 	@CacheLookup
	 	WebElement txtUserEmail;


	 	@FindBy(id = "Password")
	 	@CacheLookup
	 	WebElement txtPassword;


	 	@FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/button[1]")
	 	@CacheLookup
	 	WebElement btnLogin;


	 	@FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]/h1[1]")
	 	@CacheLookup
	 	WebElement passNotCorrect;

		@FindBy(className = "button-1 register-continue-button")
	 	@CacheLookup
	 	WebElement btnContiune;



	 /*
	  	@FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a")
		@CacheLookup
		WebElement lnkLogout;

	  */



		public void setUserName(String uname)
		{
			txtUserEmail.sendKeys(uname);
		}

		public void setPassword(String pwd)
		{
			txtPassword.sendKeys(pwd);
		}


		public void clickSubmit()
		{
			btnLogin.click();

		}


		public void clickContiune()
		{
			btnContiune.click();
		}


		public String passNotCorrect()
		{
			return passNotCorrect.getText();
		}




		/*
		public void clickLogout()
		{
			lnkLogout.click();
		}
		 */



}
