package com.byhovsky.project;

public class UserService {

    private UserDAO userDAO;

    public User addUser(User user) {
        userDAO = new UserDAO();
        return userDAO.add(user);
    }
}
