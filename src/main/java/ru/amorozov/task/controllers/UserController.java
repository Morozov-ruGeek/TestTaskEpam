package ru.amorozov.task.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.amorozov.task.dto.NewUserRegistrationDto;
import ru.amorozov.task.services.UserService;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/register")
    public void registrationNewUser(@RequestBody NewUserRegistrationDto newUserDto) {
        userService.registrationNewUser(newUserDto);
    }
}
