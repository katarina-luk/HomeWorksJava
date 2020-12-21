package com.it.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewEmailPage extends BasePage {
    @FindBy(xpath = "//div[@class='from' ]//child::div[2][@class='field_value']")
    private WebElement sender;

    @FindBy(xpath = "//textarea[@id='to']")
	private WebElement inputReceipient;

    @FindBy(xpath = "//input[@tabindex='5']")
	private WebElement inputSubject;

	@FindBy(xpath = "//textarea[@tabindex='10']")
	private WebElement inputEmailText;
	
	@FindBy(xpath = "//input[@type='submit'][1]")
	private WebElement submitButton;
	
    


	public String checkFrom(){
        return sender.getText();
    }


    public void fillEmailForm(String recipient, String subject,String emailText){
        inputReceipient.clear();
        inputReceipient.sendKeys(recipient);
        inputSubject.clear();
        inputSubject.sendKeys(subject);
        inputEmailText.clear();
        inputEmailText.sendKeys(emailText);
        submitButton.click();
    }


}
