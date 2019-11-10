package org.leaftap.pages;

import org.leaftap.wrapper.ProjectSpecificMethod;

public class MyLeadsPage extends ProjectSpecificMethod{
	public CreateLeadPage clickCreateLead() {
		driver.findElementByXPath("//a[text()='Create Lead']").click();
		return new CreateLeadPage();
	}

}
