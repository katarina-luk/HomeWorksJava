package com.it.project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends BasePage {
	@FindBy(xpath="//input[@name='login']")
	private WebElement inputLogin;
	
	@FindBy(xpath = "//input[@name='pass']")
	private WebElement inputPassword;
	
	@FindBy(xpath = "//input[@tabindex='5']")
	private WebElement btLogin;



	protected void login(String name, String password) {
		WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driverWait.until(ExpectedConditions.visibilityOf(inputLogin)).clear();
	//	driverWait.until(driver -> driver.findElement(By.id("id"))).click();
	    inputLogin.sendKeys(name);
	    inputPassword.clear();
	    inputPassword.sendKeys(password);
	    btLogin.click();
    }
    
}
