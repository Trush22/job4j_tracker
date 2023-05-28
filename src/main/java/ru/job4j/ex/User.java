package ru.job4j.ex;

public class User {
    private static String username;
    private boolean valid;

    public User(String username, boolean valid) {
        User.username = username;
        this.valid = valid;
    }

    public static String getUsername() {
        return username;
    }

    public boolean isValid() {
        return valid;
    }
}
