package com.luckraw.cleanarch.infra.controllers;

import com.luckraw.cleanarch.application.usecases.CreateUserInteractor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    private CreateUserInteractor createUserInteractor;

    public UserController(CreateUserInteractor createUserInteractor) {
        this.createUserInteractor = createUserInteractor;
    }

    @PostMapping
    public CreateUserRequest save(CreateUserRequest createUserRequest) {

        return createUserInteractor.createUser(createUserRequest);
    }
}
