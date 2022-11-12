package com.finalProject.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.finalProject.testCases.BaseClass;

public class EmailAFriendPage extends BaseClass{

	WebDriver ldriver;
	public EmailAFriendPage (WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}


	@FindBy(how = How.XPATH, using ="//*[@class=\"friend-email\"]")
	@CacheLookup
	WebElement txtFriendEmail;


	@FindBy(how = How.XPATH, using ="//*[@class=\"your-email\"]")
	@CacheLookup
	WebElement txtYourEmail;

	@FindBy(how = How.XPATH, using ="//*[@id=\"PersonalMessage\"]")
	@CacheLookup
	WebElement txtPersonalMessage;


	@FindBy(how = How.XPATH, using ="//*[@class=\"button-1 send-email-a-friend-button\"]")
	@CacheLookup
	WebElement btnSendEmail;


	@FindBy(how = How.XPATH, using ="//*[@class=\"result\"]")
	@CacheLookup
	WebElement lnkResult;


	public void setFriendEmail() {
		txtFriendEmail.sendKeys(randomestring(7)+"@gmail.com");
	}

	public void setYourEmail(String email) {
		//txtYourEmail.sendKeys(email);
	}

	public void setPersonalMessage() {

		for(int i=0;i<5;i++) {
          txtPersonalMessage.sendKeys(randomestring(7));
		}

	}

	public void clickBtnSendEmail() {
		btnSendEmail.click();
	}



	public boolean chekIfAppearResult() {
		try {
			if(lnkResult.isDisplayed()) {
				//if(!divOrderNumber.getText().isEmpty()) {
				return true;
			}
		} catch (Exception e) {
			 System.out.println("@ did not gave result" +e.getMessage());
		}
		return false;
	}




}
