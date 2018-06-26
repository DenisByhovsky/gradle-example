package com.byhovsky.project;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {

    private List<User> userList = new ArrayList<>();

    public User add(User user) {
        user.setFirstName(user.getFirstName());
        user.setLastName(user.getLastName());
        user.setId(user.getId());
        userList.add(user);
        return user;
    }
}
