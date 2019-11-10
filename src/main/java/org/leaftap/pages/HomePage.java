package org.leaftap.pages;

import org.leaftap.wrapper.ProjectSpecificMethod;

public class HomePage extends ProjectSpecificMethod{
	public MyHomePage clickCRMSFA() {
		driver.findElementByLinkText("CRM/SFA").click();
		return new MyHomePage();
	}

}
