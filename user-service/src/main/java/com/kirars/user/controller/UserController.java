package com.kirars.user.controller;

import com.kirars.user.dto.ResponseTemplate;
import com.kirars.user.model.User;
import com.kirars.user.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
@AllArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user) {
        log.info("Inside saveUser in UserController");
        return userService.saveUser(user);
    }

    @GetMapping("/{userId}")
    public ResponseTemplate getUserWithBook(@PathVariable Long userId) {
        log.info("Inside getUserWithBook in UserController");
        return userService.getUserWithBook(userId);
    }
}
