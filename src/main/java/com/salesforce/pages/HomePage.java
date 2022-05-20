package com.salesforce.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{
	
	public HomePage verifyHomePage() throws InterruptedException {
		//verifyDisplayed(locateElement(Locators.XPATH, "//span[text()='Home']"));
			
		Thread.sleep(20000);
		//String title = getElementText(locateElement(Locators.XPATH, "//title"));
		//System.out.println(title);	
		
		
		if(verifyTitle("Home Page ~ Salesforce - Developer Edition")) {
			
			System.out.println("Inside IF");
			//System.out.println("Title is "+title);	
		click(locateElement(Locators.XPATH, "//a[@title='Home Tab']"));
				
		Thread.sleep(3000);
		click(locateElement(Locators.XPATH, "//input[@value='No Thanks']"));
		
		Thread.sleep(3000);
		click(locateElement(Locators.XPATH, "//input[@value='Send to Salesforce']"));
		
		
			
		}
		else if(verifyTitle("Home | Salesforce")){
			
			System.out.println("Inside else");
			
			click(locateElement(Locators.XPATH, "(//span[@class='uiImage'])[1]"));						
			Thread.sleep(10000);
			click(locateElement(Locators.XPATH, "//a[@class='profile-link-label switch-to-aloha uiOutputURL']"));						
			Thread.sleep(20000);
		}
		
		reportStep("Homepage is loaded", "pass");
		return this;
	}
	
	public NewOpportunityPage clickGlobalAction() throws InterruptedException {
		Thread.sleep(20000);		
		click(locateElement(Locators.XPATH, "//div//lightning-primitive-icon/*[@class='slds-icon slds-icon_x-small']"));
		return new NewOpportunityPage();
	}
	
	public CreateNewPage clickCreateNew() throws InterruptedException {
		Thread.sleep(20000);		
		click(locateElement(Locators.ID, "createNewButton"));
		reportStep("Create new button clicked", "pass");
		return new CreateNewPage();
	}
	
	
}
