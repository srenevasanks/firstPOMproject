package org.leaftap.pages;

import org.leaftap.wrapper.ProjectSpecificMethod;

public class CreateLeadPage extends ProjectSpecificMethod{
	public CreateLeadPage enterCompanyName(String comName) {
		driver.findElementById("createLeadForm_companyName").sendKeys(comName);
		return this;
	}
	
	public CreateLeadPage enterFirstName(String fName) {
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		return this;

	}
	public CreateLeadPage enterLastName(String lName) {
		driver.findElementByXPath("//input[@id='createLeadForm_firstName']//following::input[1]").sendKeys(lName);
		return this;
		
	}
	public ViewLeadPage clickCreateLeadSubmit() {
		driver.findElementByName("submitButton").click(); 
		return new ViewLeadPage();
	}

}
