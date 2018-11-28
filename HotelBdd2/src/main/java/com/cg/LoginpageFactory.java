package com.cg;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginpageFactory {
	@FindBy(name="userName")
	@CacheLookup
	WebElement userNameTxt;
	
	@FindBy(name="userPwd")
	@CacheLookup
	WebElement pwdTxt;
	
	@FindBy(name="btn")
	@CacheLookup
	WebElement loginBtn;
	
	@FindBy(name="userErrMsg")
	@CacheLookup
	WebElement userErrorMsg;
	
	@FindBy(name="pwdErrMsg")
	@CacheLookup
	WebElement pwdErrorMsg;

	public void setUserName(String name) {
		userNameTxt.sendKeys(name);
	}

	public void setPassword(String pwd) {
		pwdTxt.sendKeys(pwd);
	}

	public void clickloginButton() {
		loginBtn.click();
	}

	public String getuserNameError() {
		String error = userErrorMsg.getText();
		return error;

	}
	public String getpwdError() {
		String error = pwdErrorMsg.getText();
		return error;

	}
}
