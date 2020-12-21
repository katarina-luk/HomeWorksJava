package com.it.project.users;

import java.util.ResourceBundle;

public class UserFactory {
    private static ResourceBundle user = ResourceBundle.getBundle("user");

    public static User getValidUser() {
        return new User(user.getString("userName"), user.getString("userPassword"), user.getString("email"));
    }

    public static void getRandomUser(int count) {
/*        return (ArrayList<User>) Stream.generate(() ->
                new User(Utils.getRandomString(10),
                        Utils.getRandomString(15),
                        Utils.getRandomString(10) + "@gmail.com"))
                .limit(count).collect(Collectors.toList());
    }*/
    }
}
