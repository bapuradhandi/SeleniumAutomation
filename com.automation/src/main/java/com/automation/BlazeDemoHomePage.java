package com.automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BlazeDemoHomePage {
	
	
	@FindBy(xpath = "//a[@href='vacation.html']") private WebElement destinationOfTheWeekLink;
	@FindBy(xpath = "//html/body/div[2]") private WebElement destinationOfTheWeek;
	@FindBy(name = "fromPort") private WebElement fromPortList;
	@FindBy(name = "toPort") private WebElement toPortList;
	@FindBy(xpath = "//input[@value='Find Flights']") private WebElement findFlightsBtn;	
	@FindBy(xpath = "//input[@value='Choose This Flight']") private WebElement chooseThisFlightBtn;	
	@FindBy(name = "inputName") private WebElement inputNameTextBox;	
	@FindBy(name = "address") private WebElement addressTextBox;	
	@FindBy(name = "city") private WebElement cityTextBox;	
	@FindBy(name = "state") private WebElement stateTextBox;	
	@FindBy(name = "zipCode") private WebElement zipCodeTextBox;
	@FindBy(name = "cardType") private WebElement cardTypeTextBox;
	@FindBy(name = "creditCardNumber") private WebElement creditCardNumberTextBox;
	@FindBy(name = "creditCardMonth") private WebElement creditCardMonthTextBox;
	@FindBy(name = "creditCardYear") private WebElement creditCardYearTextBox;
	@FindBy(name = "nameOnCard") private WebElement nameOnCardTextBox;
	@FindBy(xpath = "//input[@value='Purchase Flight']") private WebElement purchaseFlightBtn;
	@FindBy(xpath = "/html/body/div[2]/div/table/tbody/tr[1]/td[2]") private WebElement bookingConfirmationId;
	

	public String driverInitialization() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Selenium-Essentials\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://blazedemo.com/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	PageFactory.initElements(driver, this);
	return driver.getTitle();
	}
	
	public String getDestinationOfTheWeek() {
		destinationOfTheWeekLink.click();
		System.out.println("destination of the week is " + destinationOfTheWeek.getText());
		return destinationOfTheWeek.getText();
	}
	public boolean isFromPortListDisplayed() {
		return fromPortList.isDisplayed();}
	
	public void selectFromPort() {
		fromPortList.sendKeys("San Diego");}
	
	public boolean isToPortListDisplayed() {
		return toPortList.isDisplayed();}
	
	public void selectToPort() {
		toPortList.sendKeys("London");}
	
	public void clickOnFindFlightsButton() {
		findFlightsBtn.click();}
	
	public void chooseTheFlight() {
		chooseThisFlightBtn.click();}
	
	public void enterName() {
		inputNameTextBox.sendKeys("Bapu");}
	
	public void enterAddress() {
		addressTextBox.sendKeys("Flat No 302");}
	
	public void enterCity() {
		cityTextBox.sendKeys("Hyderabad");}
	
	public void enterState() {
		stateTextBox.sendKeys("Telangana");}
	
	public void enterZipCode() {
		zipCodeTextBox.sendKeys("500072");}
	
	public void enterCardType() {
		cardTypeTextBox.sendKeys("American Express");}
	
	public void enterCardNumber() {
		creditCardNumberTextBox.sendKeys("432112345678");}
	
	public void enterCreditCardMonth() {
		creditCardMonthTextBox.sendKeys("10");}
	
	public void enterCreditCardYear() {
		creditCardYearTextBox.sendKeys("2021");}
	
	public void enterNameonCard() {
		nameOnCardTextBox.sendKeys("Bapu Radhandi");}
	
	public void clickOnPurchaseFlightButton() {
		purchaseFlightBtn.click();}
	
	public String getBookingConfirmationId() {
		String bookingConfirmationIdText = bookingConfirmationId.getText();	
	System.out.println("Booking confirmation Id is" +bookingConfirmationIdText);
	return bookingConfirmationIdText;}

}
