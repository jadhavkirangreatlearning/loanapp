package com.csi.controller;

import com.csi.model.User;
import com.csi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserService userServiceImpl;

    @PostMapping("/signup")
    public ResponseEntity<String> signUp(@RequestBody User user) {
        userServiceImpl.signUp(user);
        return ResponseEntity.ok("User Signup done successfully");
    }

    @GetMapping("/signin/{userEmailId}/{userPassword}")
    public ResponseEntity<String> signIn(@PathVariable String userEmailId, @PathVariable String userPassword) {

        String msg = "";

        if (userServiceImpl.signIn(userEmailId, userPassword)) {
            msg = "SignIn Successfully";
        } else {
            msg = "Oops Invalid Credentials, Please try again!!!!";
        }

        return ResponseEntity.ok(msg);
    }

    @GetMapping
    public String say(){
        return "welcome";
    }
}
