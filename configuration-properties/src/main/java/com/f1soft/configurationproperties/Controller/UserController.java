package com.f1soft.configurationproperties.Controller;

import com.f1soft.configurationproperties.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    User user;

    @GetMapping("/name")
    public User getUserName() {
       return user;

    }
}
