package org.example.showdata.entites;

import lombok.*;

@EqualsAndHashCode
@Setter
@Getter
public class User {
    String username;
    String password;

    public User(){}

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "user name: " + username;
    }

}
