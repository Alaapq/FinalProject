package com.finalProject.pageObject;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.finalProject.testCases.BaseClass;

public class DigitalDownloadsPage extends BaseClass{

	WebDriver ldriver;
	public DigitalDownloadsPage (WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}

	@FindBy(how = How.XPATH, using ="/html[1]/body[1]/div[6]/div[2]/ul[1]/li[4]/a")
	@CacheLookup
	WebElement lnkDigDown;

	@FindAll({
		@FindBy(how = How.CLASS_NAME, using ="item-box"),
	})
	@CacheLookup
	//WebElement selAccount;
	List<WebElement> items;
	

	
	@FindBy(how = How.XPATH, using ="//*[@class=\"button-2 download-sample-button\"]")
	@CacheLookup
	WebElement lnkDownload;
	
	
	@FindBy(how = How.XPATH, using ="//*[@class=\"price-range\"]")
	@CacheLookup
	WebElement rangePrice;
	
	
	
	
	@FindBy(how = How.XPATH, using ="//*[@class=\"price-range\"]")
	@CacheLookup
	WebElement labPriceRange;
	 
	                                    
	@FindBy(how = How.XPATH, using ="//*[@class=\"enter-price-input\"]")
	@CacheLookup
	WebElement txtValidPrice;
	
	
	@FindBy(how = How.XPATH, using ="//*[@class=\"button-1 add-to-cart-button\"]")
	@CacheLookup
	WebElement lnkAddCart;
	
	
	@FindBy(how = How.XPATH, using ="//*[@class=\"button-2 email-a-friend-button\"]")
	@CacheLookup
	WebElement lnkEmailFriend;
	
	
	
	
	
	
	
	
	public void clickLnkDigDown() {
		lnkDigDown.click();
	}

	public int getItemsLength() {
     return items.size();
	}
	
	public void clickPositionOfItem(int position) {
		items.get(position).click();
	}
	
	public void clickValidPrice() {
		txtValidPrice.click();
	}
	
	
	
	public void setValidPrice() {
	
		//String st= txtValidPrice.getText();//The price must be from $0.50 to $100.00
		
		String st=labPriceRange.getText();
		String target =filterValidPrice(st);
		txtValidPrice.clear();
		txtValidPrice.sendKeys(target+".00");
	}
	
	public String filterValidPrice(String st) {
		System.out.println("st"+st);
		String[] parts = st.split("from");
		String part2 = parts[1].replace("$", "").trim();
	
		String[] part4=part2.toString().split("to");
		//String part5 = part4[0].trim();
		String part6 = part4[1].trim();
		//int smallBord=parseToInteger(part5);
		int bigBord=parseToInteger(part6.replace(".00", "").trim());
		int length = String.valueOf(bigBord).length()-1;
		return randomeNumrical(length);
	}
	
	
	public boolean chkrangePrice() {

		try {
		if(rangePrice.isDisplayed()) {
			return true;
		}

		} catch (Exception e) {
			System.out.println("@ DigitalDownloadsPage did not show rang price "+e.getMessage());
		}
		return false;
	}
	
	
	public void clickLnkDownload() {
		lnkDownload.click(); // save @ file in baseclass
	}
	
	public void clickLnkAddCart() {
		lnkAddCart.click();
	}
	
	public void clicklnkEmailFriend() {
		lnkEmailFriend.click();
	}
	
	

}
