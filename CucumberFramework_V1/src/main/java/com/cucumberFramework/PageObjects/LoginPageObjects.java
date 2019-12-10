package com.cucumberFramework.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPageObjects{
 WebDriver ldriver;
public LoginPageObjects(WebDriver rdriver) {
	ldriver=rdriver;
	PageFactory.initElements(ldriver, this);
}

@FindBy(xpath="//input[@placeholder='E-mail address']")
WebElement txtUserEmail;

@FindBy(xpath="//input[@placeholder='Password']")
WebElement txtPassword;

@FindBy(className="ui fluid large blue submit button")
WebElement buttLogin;


public void setUserName(String userEmail) {
	txtUserEmail.clear();
	txtUserEmail.sendKeys(userEmail);
}

public void setPassword(String Password) {
	txtPassword.clear();
	txtPassword.sendKeys(Password);
}

public void clickLogin(){
	buttLogin.click();
}
public void clickForgotPassword() {

}

}
