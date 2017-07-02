package com.hasith.sample.service;

import com.hasith.client.model.User;
import com.hasith.client.model.Users;

import java.util.List;

public class UserService {
    private static Users users = new Users();

    public static Users getAllUser() {
        users.getUsers().add(new User(1, "Jhone"));
        users.getUsers().add(new User(2, "Kan"));
        users.getUsers().add(new User(3, "Nuwan"));
        users.getUsers().add(new User(4, "Saman"));
        return users;
    }

    public static User getUserById(int id) {
        return getAllUser()
                .getUsers()
                .stream()
                .filter(user -> user.getId() == id)
                .findAny()
                .orElse(null);
    }

    public static Users insertUser(User user){
        getAllUser().getUsers().add(user);
        return users;
    }
}
