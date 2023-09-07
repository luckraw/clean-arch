package com.luckraw.cleanarch.application.usecases;

import com.luckraw.cleanarch.application.gateways.UserGateway;
import com.luckraw.cleanarch.domain.entity.User;

public class CreateUserInteractor {

    private UserGateway userGateway;

    public CreateUserInteractor(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    public User createUser(User user) {
        return userGateway.save(user);
    }
}
