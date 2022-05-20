package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.LoginPage;

public class TC002_CreateEvent extends ProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "Create Event";
		testDescription ="Create Event, edit End Date and delete";
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
		.clickCreateNew()
		.clickEvent()
		.sendEventName()
		.clickAttachFile()
		.saveEvent()
		.clickRecentItem()
		.clickEdit()
		.editEndDate()
		.clickRecentItem()
		.clickDelete();

	}

}
