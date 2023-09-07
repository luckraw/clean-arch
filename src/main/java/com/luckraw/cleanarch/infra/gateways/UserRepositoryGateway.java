package com.luckraw.cleanarch.infra.gateways;

import com.luckraw.cleanarch.application.gateways.UserGateway;
import com.luckraw.cleanarch.domain.entity.User;
import com.luckraw.cleanarch.infra.persistence.UserEntity;
import com.luckraw.cleanarch.infra.persistence.UserRepository;

public class UserRepositoryGateway implements UserGateway {

    public UserRepositoryGateway(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    private final UserRepository userRepository;
    @Override
    public User save(User userDomainObj) {
        UserEntity userEntity;
        return userRepository.save(userEntity);
    }
}
