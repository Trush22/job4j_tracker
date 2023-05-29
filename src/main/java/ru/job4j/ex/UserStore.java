package ru.job4j.ex;

import java.util.Objects;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (User user : users) {
            if (Objects.equals(user, login)) {
                return user;
            }
        }
        return null;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.isValid() && User.getUsername().length() >= 3) {
            return true;
        } else {
            throw new UserInvalidException("пользователь не валидный");
        }
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            if (user != null && validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException ie) {
            ie.printStackTrace();
        } catch (UserNotFoundException nfe) {
            nfe.printStackTrace();
        }
    }
}
