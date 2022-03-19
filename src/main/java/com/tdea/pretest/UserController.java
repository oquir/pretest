package com.tdea.pretest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {

    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<UserEntity> findById(@PathVariable("id") Integer id) {
        UserEntity user = userService.findById(id);

        return ResponseEntity.ok(user);
    }

    @PostMapping()
    public ResponseEntity<UserEntity> saveUser(@RequestBody UserEntity user) {
        UserEntity savedUser = userService.saveUser(user);

        return ResponseEntity.ok(savedUser);
    }

    @GetMapping(path = "/login")
    public ResponseEntity login(@RequestParam("username") String username, @RequestParam("password") String password) {
        boolean correctCredentials = userService.checkPassword(username, password);
        if (correctCredentials) {
            return new ResponseEntity(HttpStatus.OK);
        }
        return new ResponseEntity(HttpStatus.UNAUTHORIZED);
    }
}
