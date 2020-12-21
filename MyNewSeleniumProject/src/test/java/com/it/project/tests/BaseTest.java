package com.it.project.tests;

import com.it.project.App;
import com.it.project.users.User;
import com.it.project.users.UserFactory;
import org.testng.annotations.AfterSuite;

public class BaseTest {
    static App app = new App();
    static User validUser = UserFactory.getValidUser();

    @AfterSuite
    public void afterSuite() {
        app.common.close();
    }

}
