package org.example.userauthentication.dao;

import org.example.userauthentication.entities.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDAO {


    private List<User> users(){

        List<User> users=new ArrayList<>();
        users.add(new User("user1","pass1"));
        users.add(new User("user2","pass2"));
        users.add(new User("user3","pass3"));

        return users;
    }

    public boolean checkUser(String userName, String password) {
        List<User> users = users();
        for (User user : users) {
            if (user.getUsername().equals(userName) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }


}
