package com.it.project.driver;

import com.it.project.common.Constants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

import static com.it.project.common.Constants.*;

public class DriverFactory {
    static public WebDriver getDriver() {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(CapabilityType. ACCEPT_SSL_CERTS, true);
        caps.setCapability("acceptInsecureCerts", true);
        caps.setCapability("INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS", true);
        caps.setCapability("IntroduceInstabilityByIgnoringProtectedModeSettings", true);        WebDriver driver = null;
        String name = System.getProperty("driver");
        if (name != null) {
            if ("fireFox".equals(name)) {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver(caps);
            } else if ("chrome".equals(name)) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver(caps);
            } else {
                throw new UnsupportedOperationException();
            }
        } else {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
     /*   driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    */
        driver.get(BASE_URL);
        return driver;
    }
}
