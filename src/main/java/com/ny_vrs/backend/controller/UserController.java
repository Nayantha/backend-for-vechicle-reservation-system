package com.ny_vrs.backend.controller;

import com.ny_vrs.backend.model.User;
import com.ny_vrs.backend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/user")
public class UserController {
    private final UserService userService;

    @GetMapping("/get_from_email")
    public User getUserFromEmail(@RequestBody String email) {
        return userService.findUserByEmail(email);
    }
}
