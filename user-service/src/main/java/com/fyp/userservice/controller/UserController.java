package com.fyp.userservice.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fyp.userservice.dto.UserServiceResponse;
import com.fyp.userservice.dto.RegisterUserRequest;
import com.fyp.userservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/register-user")
    public UserServiceResponse registerUser(@RequestBody RegisterUserRequest registerUserRequest) throws JsonProcessingException {
        return userService.triggerAlethiaVerification(registerUserRequest);
    }
}
