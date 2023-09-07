package com.luckraw.cleanarch.infra.controllers;

import com.luckraw.cleanarch.domain.entity.User;

public class UserDTOMapper {

    CreateUserResponse toResponse(User user) {
        return new CreateUserResponse(user.name(), user.email());
    }

    public User toUser(CreateUserRequest request) {
        return new User(request.name(), request.email(), request.password());
    }
}
