package com.finalProject.pageObject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateOrder {

int choiceDesktopItem=2;
int choiceLstOfRAM=1;
int choiceLstOfProcessor=1;
	WebDriver ldriver;
	public CreateOrder (WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}

	@FindBy(how = How.XPATH, using ="/html[1]/body[1]/div[6]/div[2]/ul[1]/li[1]/a[1]")
	@CacheLookup
	WebElement lnkComputerbtn;

	@FindBy(how = How.XPATH, using ="/html[1]/body[1]/div[6]/div[2]/ul[1]/li[1]/ul[1]/li")
	@CacheLookup
	List<WebElement> lnkComputer;

	@FindBy(how = How.XPATH, using ="/html[1]/body[1]/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]")
	@CacheLookup
	List<WebElement> lnkItemGrid;

	@FindBy(how = How.CLASS_NAME, using ="item-box")
	@CacheLookup
	List<WebElement> lnkItemGridClass;

	@FindBy(how = How.XPATH, using ="//div[@class='stock']")
	@CacheLookup
	List<WebElement> lnkAvailability;

	@FindBy(how = How.XPATH, using ="//div[@class='attributes']")
	@CacheLookup
	WebElement lnkAttributes;

	@FindBy(how = How.XPATH, using ="//select[@id='product_attribute_1']")
	@CacheLookup
	WebElement lstOfProcessor;

	@FindBy(how = How.XPATH, using ="//select[@id='product_attribute_2']")
	@CacheLookup
	WebElement lstOfRAM;


	@FindBy(how = How.XPATH, using ="(//input[@id='product_attribute_3_6'])[1]")
	@CacheLookup
	WebElement lstOfHDD;


	@FindBy(how = How.XPATH, using ="//div[@class='bar-notification success']")
	@CacheLookup
	WebElement notificationSuccess;


	@FindBy(how = How.XPATH, using ="//button[.='Add to cart']")
	@CacheLookup
	WebElement AddToCart;


	@FindBy(how = How.CLASS_NAME, using ="delivery")
	@CacheLookup
	WebElement lnkdelivery;


	@FindBy(how = How.CLASS_NAME, using ="mfp-close")
	@CacheLookup
	WebElement lnkMfpClose;

	@FindBy(how = How.CLASS_NAME, using ="product-estimate-shipping")
	@CacheLookup
	WebElement lnkProductEstimateShipping;

	@FindBy(how = How.ID, using = "CountryId")
	@CacheLookup
	WebElement selCountryId;

	@FindBy(how = How.ID, using = "StateProvinceId")
	@CacheLookup
	WebElement selStateProvinceId;


	@FindBy(how = How.ID, using = "ZipPostalCode")
	@CacheLookup
	WebElement txtZipPostalCode;

	@FindBy(how = How.XPATH, using = "//*[@id=\"estimate-shipping-popup-3\"]/div[5]/button")
	@CacheLookup
	WebElement btnApply;


	@FindBy(how = How.XPATH, using ="//*[@id=\"estimate-shipping-popup-3\"]/div[5]/div")
	@CacheLookup
	WebElement chkMessageFailure;



	public void lnkMfpClose() {
		lnkMfpClose.click();
	}


	public boolean chkMessageFailure() {

		try {
		if(chkMessageFailure.isDisplayed()) {
			return true;
		}

		} catch (Exception e) {
			System.out.println("@ CreateOrder chkMessageFailure error "+e.getMessage());
		}
		return false;
	}


	public void btnApply() {
		try {
			System.out.println("@ CreateOrder btnApply 1 ");
			btnApply.click();
			System.out.println("@ CreateOrder btnApply 2 ");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("@ CreateOrder chkMessageFailure error "+e.getMessage());
		}

	}

	public void txtZipPostalCode(String id) {
		txtZipPostalCode.sendKeys(id);

	}

	public void selCountryId() {
		//selAccount.sendKeys("Current");
		try {
			Select se= new Select (selCountryId);
			List<String> orginal = new ArrayList<String>();
			List <WebElement> ops=se.getOptions();
			for (WebElement e:ops) {
				orginal.add(e.getText());
			}
			System.out.println("@ CreateOrder selCountryId "+orginal);
			ops.get(3).click();


		} catch (Exception e) {
			System.out.println("@ CreateOrder selCountryId error "+e.getMessage());
		}


	}


	public void selStateProvinceId() {
		//selAccount.sendKeys("Current");
		try {
			Select se= new Select (selStateProvinceId);
			List<String> orginal = new ArrayList<String>();
			List <WebElement> ops=se.getOptions();
			for (WebElement e:ops) {
				orginal.add(e.getText());
			}
			System.out.println("@ CreateOrder selStateProvinceId "+orginal);
			ops.get(0).click();

		} catch (Exception e) {
			System.out.println("@ CreateOrder selStateProvinceId error "+e.getMessage());
		}

	}



	public void lnkProductEstimateShipping() {
		lnkProductEstimateShipping.click();
	}

	public void lstOfHDD() {
		lstOfHDD.click();
	}


	public void lstOfRAM() {
		//selAccount.sendKeys("Current");
		try {
			Select se= new Select (lstOfRAM);
			List<String> orginal = new ArrayList<String>();
			List <WebElement> ops=se.getOptions();
			for (WebElement e:ops) {
				orginal.add(e.getText());
			}
			System.out.println("@ CreateOrder lstOfRAM "+orginal);
			ops.get(choiceLstOfRAM).click();

		} catch (Exception e) {
			System.out.println("@ CreateOrder lstOfRAM error "+e.getMessage());
		}

	}


	public void lstOfProcessor() {
		//selAccount.sendKeys("Current");
		try {
			Select se= new Select (lstOfProcessor);
			List<String> orginal = new ArrayList<String>();
			List <WebElement> ops=se.getOptions();
			for (WebElement e:ops) {
				orginal.add(e.getText());
			}
			System.out.println("@ CreateOrder lstOfProcessor "+orginal);
			ops.get(choiceLstOfProcessor).click();

		} catch (Exception e) {
			System.out.println("@ CreateOrder lstOfProcessor error "+e.getMessage());
		}

	}


	public boolean lnkdelivery() {

		try {
		if(lnkdelivery.isDisplayed()) {
			return true;
		}

		} catch (Exception e) {
			System.out.println("@ CreateOrder lnkdelivery error "+e.getMessage());
		}
		return false;
	}


	public boolean notificationSuccess() {

		try {
		if(notificationSuccess.isDisplayed()) {
			return true;
		}

		} catch (Exception e) {
			System.out.println("@ CreateOrder notificationSuccess error "+e.getMessage());
		}
		return false;
	}



	public void lnkComputer() {
		Actions actions = new Actions(ldriver);
		actions.moveToElement(lnkComputerbtn).perform();
		lnkComputer.get(0).click();
	}


	public void AddToCart() {
		try {
			AddToCart.click();
			//System.out.println("@ CreateOrder AddToCart here ");
		} catch (Exception e) {
			System.out.println("@ CreateOrder AddToCart error "+e.getMessage());
		}

	}

	public void lnkItemGridClass() {
        lnkItemGridClass.get(choiceDesktopItem).click();
	}

	public boolean lnkAvailability() {

		//System.out.println("@ CreateOrder lnkAvailability list "+ lnkAvailability.get(0).getText());

		   if (lnkAvailability.get(0).getText().endsWith("In stock"))
		   {
			   return true;
		   }


		return false;

	}


	public boolean thereIsAttributes() {

		try {
		if(lnkAttributes.isDisplayed()) {
			return true;
		}

		} catch (Exception e) {
			System.out.println("@ CreateOrder thereIsAddressSection error "+e.getMessage());
		}
		return false;
	}




}
