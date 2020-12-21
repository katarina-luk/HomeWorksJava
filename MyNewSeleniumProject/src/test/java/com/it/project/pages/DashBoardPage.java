package com.it.project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage extends BasePage {
    @FindBy(xpath = "//span[@class='sn_menu_title']")
    private WebElement lbEmail;

    @FindBy(xpath = "//p[@class='make_message']//a[contains(@href,'compose')]")
    private WebElement btCreateNewEmail;

	@FindBy(xpath = "//div[@class='content clear']")
	private WebElement notityOfSuccessfulSending;

	@FindBy(xpath = "//ul[@class='list_underlined']//li[@class='new']")
	private WebElement btNewEmails;
	/*
	@FindBy(xpath = "//div[@class='row new'][1]")
	private WebElement newLetter;*/
	
	@FindBy(xpath = "//div[@class='row new'][1]//span[@class='frm']")
	private WebElement from;

    @FindBy(xpath = "//div[@class='row new'][1]//span[@class='sbj']")
    private WebElement subject;

    public String getLbEmail() {
        return lbEmail.getText();
    }

    public void createEmail() {
        btCreateNewEmail.click();
    }

    public String getSendResult(){
        return notityOfSuccessfulSending.getText();
    }

    public void checkNewEmails(){
        btNewEmails.click();
    }

    public String getNewLetter(){
        return   from.getText() + "; "+ subject.getText();
    }

    
}
