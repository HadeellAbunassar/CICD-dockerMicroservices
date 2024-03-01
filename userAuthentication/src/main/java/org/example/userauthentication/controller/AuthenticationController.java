package org.example.userauthentication.controller;

import org.example.userauthentication.entities.User;
import org.example.userauthentication.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/authentication")
public class AuthenticationController {

    @Autowired
    UserDAO udao;

    @PostMapping("/login")
    public ResponseEntity<Boolean> authenticate(@RequestBody User user) {
        boolean isValid = udao.checkUser(user.getUsername(), user.getPassword());
        return ResponseEntity.ok(isValid);
    }

}
