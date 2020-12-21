package com.it.project.helpers;

import com.it.project.pages.LoginPage;
import com.it.project.users.User;

public class LoginHelper extends LoginPage {
    public void login(User user) {
        logger.info(String.format("User login userName - %s , password -%s", user.email,user.password));
        login(user.email, user.password);
    }
}
