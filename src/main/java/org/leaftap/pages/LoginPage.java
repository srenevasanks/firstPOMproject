package org.leaftap.pages;

import org.leaftap.wrapper.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod{
	public LoginPage enterUserName(String username) {
		driver.findElementById("username").sendKeys(username);
		return this;
	}
	
	public LoginPage enterPassword(String password) {
		driver.findElementById("password").sendKeys(password);
		return this;
	}
	
	public HomePage clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
		return new HomePage();
	}

}
