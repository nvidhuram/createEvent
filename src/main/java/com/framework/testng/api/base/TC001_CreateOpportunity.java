package com.framework.testng.api.base;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.salesforce.pages.LoginPage;

public class TC001_CreateOpportunity extends ProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "Create Opportunity";
		testDescription ="Create opportunity with positive data";
		authors="Vidhu";
		category ="Smoke";
		excelFileName="Login";
	}
	
	@Test(dataProvider = "fetchData")
	public void runLogin(String username, String password) throws InterruptedException {
		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin()
		.verifyHomePage()
		.clickGlobalAction()
		.clickNewOpportunity()
		.sendOpportunityName()
		.sendDate()
		.selectStage()
		.clickSave();

	}

}
