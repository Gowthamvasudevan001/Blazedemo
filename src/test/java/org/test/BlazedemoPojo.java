package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlazedemoPojo extends Base{

	public BlazedemoPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//select[@class='form-inline'])[1]")
	private WebElement departure;
	
	@FindBy(xpath="(//select[@class='form-inline'])[2]")
	private WebElement destination;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement find;
	
	@FindBy(xpath="//table[@class='table']")
	private WebElement seltable;
	
	@FindBy(xpath="(//input[@type='submit'])[3]")
	private WebElement selflight;
	
	@FindBy(xpath="//input[@id='inputName']")
	private WebElement name;
	
	@FindBy(xpath="//input[@id='address']")
	private WebElement address;
	
	@FindBy(xpath="//input[@id='city']")
	private WebElement city;
	
	@FindBy(xpath="//input[@id='state']")
	private WebElement state;
	
	@FindBy(xpath="//input[@id='zipCode']")
	private WebElement zipcode;
	
	@FindBy(xpath="//Select[@id='cardType']")
	private WebElement cardtype;
	
	@FindBy(xpath="//input[@id='creditCardNumber']")
	private WebElement cardnumber;
	
	@FindBy(xpath="//input[@id='creditCardMonth']")
	private WebElement cardmonth;
	
	@FindBy(xpath="//input[@id='creditCardYear']")
	private WebElement cardyear;
	
	@FindBy(xpath="//input[@id='nameOnCard']")
	private WebElement cardName;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement pagesubmit;
	
	@FindBy(xpath="//table[@class='table']")
	private WebElement printfinal;

	public WebElement getDeparture() {
		return departure;
	}

	public WebElement getDestination() {
		return destination;
	}

	public WebElement getFind() {
		return find;
	}

	public WebElement getSeltable() {
		return seltable;
	}

	public WebElement getSelflight() {
		return selflight;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getZipcode() {
		return zipcode;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getCardnumber() {
		return cardnumber;
	}

	public WebElement getCardmonth() {
		return cardmonth;
	}

	public WebElement getCardyear() {
		return cardyear;
	}

	public WebElement getCardName() {
		return cardName;
	}

	public WebElement getPagesubmit() {
		return pagesubmit;
	}

	public WebElement getPrintfinal() {
		return printfinal;
	}
	

}
