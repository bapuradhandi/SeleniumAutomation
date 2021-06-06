package com.automation;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BlazeDemoHomePageTests {
	
	@Test(testName="TC-001-Test is to verify home screen is displayed")
	public static void TC_001_Home_Screen_Is_Displayed() throws InterruptedException {
	BlazeDemoHomePage BlazeDemoPageObj = new BlazeDemoHomePage();
	Assert.assertNotNull(BlazeDemoPageObj.driverInitialization(), "Test is failed as homescreen is not displayed");
	}
	
	@Test(testName="TC-002-Test is to verify destination of the week link is working")
	public static void TC_002_Destination_Of_The_Week() throws InterruptedException {
	BlazeDemoHomePage BlazeDemoPageObj = new BlazeDemoHomePage();
	BlazeDemoPageObj.driverInitialization();
	Assert.assertNotNull(BlazeDemoPageObj.getDestinationOfTheWeek(), "Test is failed as destination of the week is not displayed");
	}
	
	@Test(testName="TC-003-Test is to verify departure city list is displayed")
	public static void TC_002_Departure_City_List_Is_Displayed() throws InterruptedException {
	BlazeDemoHomePage BlazeDemoPageObj = new BlazeDemoHomePage();
	BlazeDemoPageObj.driverInitialization();
	Assert.assertTrue(BlazeDemoPageObj.isFromPortListDisplayed(), "Test is failed as departure city dropdown is not displayed");
	}
	
	@Test(testName="TC-004-Test is to verify destination city is displayed")
	public static void TC_003_Destination_City_List_Is_Displayed() throws InterruptedException {
	BlazeDemoHomePage BlazeDemoPageObj = new BlazeDemoHomePage();
	BlazeDemoPageObj.driverInitialization();
	Assert.assertTrue(BlazeDemoPageObj.isToPortListDisplayed(), "Test is failed as departure city dropdown is not displayed");
	}
	@Test(testName="TC-005-Test is to verify the booking confirmation id")
	public static void TC_004_Validating_booking_confirmation_id() throws InterruptedException {
	BlazeDemoHomePage BlazeDemoPageObj = new BlazeDemoHomePage();
	
	BlazeDemoPageObj.driverInitialization();
	BlazeDemoPageObj.selectFromPort();
	BlazeDemoPageObj.selectToPort();
	BlazeDemoPageObj.clickOnFindFlightsButton();
	BlazeDemoPageObj.chooseTheFlight() ;
	BlazeDemoPageObj.enterName() ;
	BlazeDemoPageObj.enterAddress();
	BlazeDemoPageObj.enterCity() ;
	BlazeDemoPageObj.enterState() ;
	BlazeDemoPageObj.enterCardType();
	BlazeDemoPageObj.enterCardNumber();
	BlazeDemoPageObj.enterCreditCardMonth() ;
	BlazeDemoPageObj.enterCreditCardYear();
	BlazeDemoPageObj.enterNameonCard() ;
	BlazeDemoPageObj.clickOnPurchaseFlightButton();
	Assert.assertNotNull(BlazeDemoPageObj.getBookingConfirmationId(), "Test is failed as Booking confirmation id is null");

	}
	
}

