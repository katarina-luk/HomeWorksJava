package it.com.practice.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BasePage {
    public String url = "https://eda.ru/recepty";
    public WebDriver driver;

    @BeforeTest
    public void setBaseUrl() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);
    }

    @AfterTest
    public void endSession() {
        driver.quit();
    }
}
