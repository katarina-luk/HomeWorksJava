package it.coin.tests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath = "//input[@type='email']")
	private WebElement inputLogin;

    @FindBy(xpath = "//input[@type='password']")
    private WebElement inputPassword;
    
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btConfirm;
	
	@FindBy(xpath = "//div[@tabindex='0']")
	private WebElement pickLan;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);

	}

	public void login(String login, String password){
	    inputLogin.clear();
	    inputLogin.sendKeys(login);
	    inputPassword.clear();
	    inputPassword.sendKeys(password);
	    btConfirm.click();
    }
    
    

}
