package org.leaftap.testcases;

import java.io.IOException;

import org.leaftap.pages.LoginPage;
import org.leaftap.wrapper.ProjectSpecificMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC001_CreateLead extends ProjectSpecificMethod {
	@BeforeTest
	public void setData() {
		excelFileName = "CreateLead";
	}
	
	@Test(dataProvider = "fetchdata")
	public void CreateLead(String uName, String password, String comName, String fName, String lName) throws InterruptedException {
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(password)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLead()
		.enterCompanyName(comName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.clickCreateLeadSubmit()
		.verifyLead(fName);
	}
	
}
