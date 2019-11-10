package org.leaftap.pages;

import org.leaftap.wrapper.ProjectSpecificMethod;

public class ViewLeadPage extends ProjectSpecificMethod{
	public ViewLeadPage verifyLead(String fName) throws InterruptedException {
		String firstName = driver.findElementByXPath("//span[text()='First name']/following::span[1]").getText();
		if(firstName.contains(fName)) {
			System.out.println("Lead has been created. Lead First name is: "+firstName); 
		}
		Thread.sleep(2000); 		
		return this;
	}

}
