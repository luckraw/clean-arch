package com.luckraw.cleanarch.infra.controllers;

import com.luckraw.cleanarch.application.usecases.CreateUserInteractor;
import com.luckraw.cleanarch.domain.entity.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    private final CreateUserInteractor createUserInteractor;
    private final UserDTOMapper userDTOMapper;

    public UserController(CreateUserInteractor createUserInteractor, UserDTOMapper userDTOMapper) {
        this.createUserInteractor = createUserInteractor;
        this.userDTOMapper = userDTOMapper;
    }

    @PostMapping
    public CreateUserResponse save(CreateUserRequest createUserRequest) {
        User user = userDTOMapper.toUser(createUserRequest);
        User userSaved = createUserInteractor.createUser(user);
        return userDTOMapper.toResponse(userSaved);
    }
}
