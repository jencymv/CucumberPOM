package com.automation.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionSalesforce {

WebDriver driver = new FirefoxDriver();

@Given("the value of url as {string}")
public void the_values_of_url_as(String url) {
	driver = new FirefoxDriver();
	driver.get(url);
}
@When("i give userid as {string}")
public void i_give_userid_as(String user) throws InterruptedException {
	Thread.sleep(5000);
	WebElement username = driver.findElement(By.id("username"));
	username.clear();
	//waitForVisibility(username,80);
	if(username.isDisplayed())
	{
		username.sendKeys(user);
	System.out.println("Username is displayed");
}
else
{
	System.out.println("Username not displayed");
}    // Write code here that turns the phrase above into concrete actions
 
	
}@When("i enter the passw as {string}")
public void i_enter_the_password_as(String pass) {

	WebElement password = driver.findElement(By.id("password"));
	password.clear();
	if(password.isDisplayed())
	{
	password.clear(); 
	password.sendKeys(pass);
	
	}
	else
	{
		System.out.println("Wrong Password");
	}
}

@When("i click on the login button")
public void i_click_on_the_button() {

	WebElement login_but= driver.findElement(By.id("Login"));
	if(login_but.isDisplayed())
	{
	login_but.click();
	System.out.println("Login Successful");
	}
	else
	{
		System.out.println("Login failed");
	}
}

@Then("home page has to be displayed")
public void i_should_see_the_home_page() {
   System.out.println("Home Page ");
   driver.close();
}

}
