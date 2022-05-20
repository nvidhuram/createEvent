package com.salesforce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class NewOpportunityPage extends ProjectSpecificMethods{
	
	public NewOpportunityPage clickNewOpportunity() throws InterruptedException {
		Thread.sleep(7000);
		click(locateElement(Locators.XPATH, "//span[contains(text(),'New Opportunity')]"));
		reportStep("New Opportunity clicked successfully", "pass");
		return new NewOpportunityPage();
	}
	
	public NewOpportunityPage sendOpportunityName() throws InterruptedException {
		Thread.sleep(7000);
		clearAndType(locateElement(Locators.XPATH, "(//input[@class=' input'])[1]"), "opportunity");
		
		reportStep("opportunity Name send successfully", "pass");
		return new NewOpportunityPage();
	}
	
	public NewOpportunityPage sendDate() {
		
		clearAndType(locateElement(Locators.XPATH, "(//input[@class=' input'])[2]"), "6/16/2022");
		
		reportStep("Date send successfully", "pass");
		return new NewOpportunityPage();
	}

	public NewOpportunityPage selectStage() throws InterruptedException {
		
		
		click(locateElement(Locators.XPATH, "//a[text()='--None--']"));
		Thread.sleep(7000);
		click(locateElement(Locators.XPATH, "//a[text()='Qualification']"));
				
		reportStep("Stage selected successfully", "pass");
		return new NewOpportunityPage();
	}
	
	
	public NewOpportunityPage clickSave() {
		
	
		click(locateElement(Locators.XPATH, "(//span[text()='Save'])[2]"));
						
		reportStep("Save clicked successfully", "pass");
		return new NewOpportunityPage();
	}
	
	
}
