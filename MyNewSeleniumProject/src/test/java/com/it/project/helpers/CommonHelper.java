package com.it.project.helpers;

import com.it.project.pages.BasePage;

import java.util.concurrent.TimeUnit;

public class CommonHelper extends BasePage {
    public void close() {
        driver.quit();
    }

    public void takeSnapShot() {
        driver.takeSnapShot();
    }
}
