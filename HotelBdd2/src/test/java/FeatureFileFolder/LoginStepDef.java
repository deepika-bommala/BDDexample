package FeatureFileFolder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class LoginStepDef {
	
	WebDriver driver;
	
	@Given("^User on login page$")
	public void user_on_login_page() throws Throwable {
    driver = new FirefoxDriver();
    driver.get("D:\\HotelBookingDemo\\login.html");
    System.out.println("page loaded in driver");
    
	}

	@When("^username password is blank$")
	public void username_password_is_blank() throws Throwable {
	    
		WebElement userNameTxt = driver.findElement(By.name("userName"));
		userNameTxt.sendKeys("");
		WebElement loginBtn=driver.findElement(By.className("btn"));
		loginBtn.click();
	}

	@Then("^Display error message 'please enter username'$")
	public void display_error_message_please_enter_username() throws Throwable {
WebElement divEle=driver.findElement(By.id("userErrMsg"));
String actualErrormsg=divEle.getText();
String  expErrMsg="* Please enter userName.";
Assert.assertEquals( expErrMsg,actualErrormsg);
driver.close();
	}
	
	@When("^username is given but   password is blank$")
	public void username_is_given_but_password_is_blank() throws Throwable {
		WebElement userNameTxt = driver.findElement(By.name("userName"));
		userNameTxt.sendKeys("Capgemini");
		WebElement passwordTxt = driver.findElement(By.name("userPwd"));
		passwordTxt.sendKeys("");
		WebElement loginBtn=driver.findElement(By.className("btn"));
		loginBtn.click();

	}

	@Then("^Display error message 'please enter password'$")
	public void display_error_message_please_enter_password() throws Throwable {
		WebElement divEle=driver.findElement(By.id("pwdErrMsg"));
		String actualErrormsg=divEle.getText();
		String  expErrMsg="* Please enter password.";
		Assert.assertEquals( expErrMsg,actualErrormsg);
		driver.close();
	 
	}
	
	@When("^username  or  password is   invalid$")
	public void username_or_password_is_invalid() throws Throwable {
		WebElement userNameTxt = driver.findElement(By.name("userName"));
		userNameTxt.sendKeys("Capgemini");
		WebElement passwordTxt = driver.findElement(By.name("userPwd"));
		passwordTxt.sendKeys("capgemini");
		WebElement loginBtn=driver.findElement(By.className("btn"));
		loginBtn.click();

	}

	@Then("^Display alertBox$")
	public void display_alertBox() throws Throwable {
		String expErrMsg="Invalid login! Please try again!";
		String actErrMsg=driver.switchTo().alert().getText();
		Assert.assertEquals( expErrMsg,actErrMsg);
		driver.switchTo().alert().accept();
		driver.close();
	 
	}
	
	@When("^username  and  password is  valid$")
	public void username_and_password_is_valid() throws Throwable {
		WebElement userNameTxt = driver.findElement(By.name("userName"));
		userNameTxt.sendKeys("capgemini");
		WebElement passwordTxt = driver.findElement(By.name("userPwd"));
		passwordTxt.sendKeys("capgemini123");
		WebElement loginBtn=driver.findElement(By.className("btn"));
		loginBtn.click();

	 
	}

	@Then("^navigate to nextpage$")
	public void navigate_to_nextpage() throws Throwable {
		driver.navigate().to("D:\\HotelBookingDemo\\hotelbooking.html");
		
	   
	}
	
	@Given("^User on hotelbooking details page$")
	public void user_on_hotelbooking_details_page() throws Throwable {
		  driver = new FirefoxDriver();
		    driver.get("D:\\HotelBookingDemo\\hotelbooking.html");
		    System.out.println("page loaded in driver");
		    
	  
	}

	@When("^firstname lastname are blank$")
	public void firstname_lastname_are_blank() throws Throwable {
		WebElement userNameTxt = driver.findElement(By.id("txtFirstName"));
		userNameTxt.sendKeys("");
		WebElement loginBtn=driver.findElement(By.id("btnPayment"));
		loginBtn.click();
	
	}

	@Then("^Display error message 'please enter firstname'$")
	public void display_error_message_please_enter_firstname() throws Throwable {
		String expErrMsg="Please fill the First Name";
		String actErrMsg=driver.switchTo().alert().getText();
		Assert.assertEquals( expErrMsg,actErrMsg);
		driver.switchTo().alert().accept();
		driver.close();
	 
	}
	
	@When("^lastname are blank$")
	public void lastname_are_blank() throws Throwable {
		WebElement firstNameTxt = driver.findElement(By.id("txtFirstName"));
		firstNameTxt.sendKeys("Deepika");
		WebElement lastNameTxt = driver.findElement(By.id("txtLastName"));
	lastNameTxt.sendKeys("");
		WebElement loginBtn=driver.findElement(By.id("btnPayment"));
		loginBtn.click();
		
	   
	}

	@Then("^Display error message 'please enter lastname'$")
	public void display_error_message_please_enter_lastname() throws Throwable {
		String expErrMsg="Please fill the Last Name";
		String actErrMsg=driver.switchTo().alert().getText();
		Assert.assertEquals( expErrMsg,actErrMsg);
		driver.switchTo().alert().accept();
	
	 
	}


}
