package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class CreateNewPage extends ProjectSpecificMethods{
	
	public CreateNewPage clickEvent() throws InterruptedException {
		Thread.sleep(3000);		
		click(locateElement(Locators.XPATH, "//a[@class='menuButtonMenuLink firstMenuItem eventMru']"));
		reportStep("Event clicked successfully", "pass");
		return this;
	}
	
	public CreateNewPage sendEventName() throws InterruptedException {
		Thread.sleep(3000);		
		clearAndType(locateElement(Locators.XPATH, "(//div[@class='requiredInput']//input[@type='text'])[2]"), "event1");
		reportStep("Event Name Sent successfully", "pass");
		return this;
	}
	
	public CreateNewPage clickAttachFile() throws InterruptedException {
		Thread.sleep(3000);		
		click(locateElement(Locators.NAME, "attachFile"));
		Thread.sleep(3000);
		switchToWindow(1);
		clearAndType(locateElement(Locators.ID, "file"), "C:/Users/QS289KQ/OneDrive - EY/Documents/demo.txt");	
		Thread.sleep(3000);
		click(locateElement(Locators.ID, "Attach"));
		Thread.sleep(3000);
		if(verifyDisplayed(locateElement(Locators.ID, "head_1_ep"))) {
			click(locateElement(Locators.XPATH, "//input[@name='cancel']"));	
		}
		Thread.sleep(3000);
		switchToWindow(0);
		reportStep("File Successfully uploaded", "pass");
	
		return this;
	}
	
//	public CreateNewPage chooseFile() throws InterruptedException {
//		Thread.sleep(20000);		
//		switchToWindow(1);
//		clearAndType(locateElement(Locators.NAME, "file"), "C:/Users/QS289KQ/OneDrive - EY/Documents/demo.txt");	
//		reportStep("File Chosen successfully", "pass");
//		return this;
//	}
//	
//	public CreateNewPage clickAttach() throws InterruptedException {
//		Thread.sleep(3000);		
//		click(locateElement(Locators.ID, "Attach"));		
//		reportStep("Attach clicked successfully", "pass");
//		return this;
//	}
//	
//	public CreateNewPage clickDone() throws InterruptedException {
//		Thread.sleep(3000);		
//		if(verifyDisplayed(locateElement(Locators.ID, "head_1_ep"))) {
//			click(locateElement(Locators.XPATH, "//input[@name='cancel']"));	
//		}
//		reportStep("File Successfully uploaded", "pass");
//		return this;
//	}

	public CreateNewPage saveEvent() throws InterruptedException {
		Thread.sleep(3000);		
		
		click(locateElement(Locators.NAME, "save"));
		reportStep("Event Saved Successfully", "pass");
		return this;
	}
	
	public CreateNewPage clickRecentItem() throws InterruptedException {
		Thread.sleep(3000);		
		click(locateElement(Locators.XPATH, "(//div[@class='mruItem']//a)[1]"));	
		reportStep("Recent Item clicked successfully", "pass");
		return this;
	}
	
	public CreateNewPage clickEdit() throws InterruptedException {
		Thread.sleep(3000);		
		click(locateElement(Locators.NAME, "edit"));	
		reportStep("Edit clicked successfully", "pass");
		return this;
	}
	
	public CreateNewPage editEndDate() throws InterruptedException {
		Thread.sleep(3000);		
		clearAndType(locateElement(Locators.ID, "EndDateTime"),"5/21/2022");
		click(locateElement(Locators.NAME, "save"));
		reportStep("End date changed successfully", "pass");
		return this;
	}
	
	public CreateNewPage clickDelete() throws InterruptedException {
		Thread.sleep(3000);		
		click(locateElement(Locators.NAME, "del"));	
		reportStep("Deleted successfully", "pass");
		return this;
	}
	
	

}
