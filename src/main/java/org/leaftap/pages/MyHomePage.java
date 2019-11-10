package org.leaftap.pages;

import org.leaftap.wrapper.ProjectSpecificMethod;

public class MyHomePage extends ProjectSpecificMethod{
	public MyLeadsPage clickLeads() {
		driver.findElementByXPath("//a[text()='Leads']").click();
		return new MyLeadsPage();
	}

}
