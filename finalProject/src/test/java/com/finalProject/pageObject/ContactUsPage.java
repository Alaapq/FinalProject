package com.finalProject.pageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.finalProject.testCases.BaseClass;

public class ContactUsPage extends BaseClass{

	WebDriver ldriver;
	public ContactUsPage (WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}


	@FindBy(how = How.XPATH, using ="/html[1]/body[1]/div[6]/div[4]/div[1]/div[1]/ul/li[6]/a")
	@CacheLookup
	WebElement lnkContUs;


	@FindBy(how = How.XPATH, using ="//*[@class=\"enquiry\"]")
	@CacheLookup
	WebElement txtEnquiry;


	@FindBy(how = How.XPATH, using ="//*[@class=\"button-1 contact-us-button\"]")
	@CacheLookup
	WebElement btnSend;



	@FindBy(how = How.XPATH, using ="//*[@class=\"topic-block-body\"]")
	@CacheLookup
	WebElement resivedEnquiry;



	public void clicklnkContUs() {
		lnkContUs.click();
	}


	public void setEnquiry() {

		for(int i=0;i<5;i++) {
			txtEnquiry.sendKeys(randomestring(7));
		}

	}


	public void submitBtnSend() {
		btnSend.click();
	}





	public boolean chekIfAppearResult() {
		try {
			if(resivedEnquiry.isDisplayed()) {
				//if(!divOrderNumber.getText().isEmpty()) {
				return true;
			}
		} catch (Exception e) {
			 System.out.println("@ did not gave result" +e.getMessage());
		}
		return false;
	}



}
