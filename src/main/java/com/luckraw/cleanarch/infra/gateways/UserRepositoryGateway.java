package com.luckraw.cleanarch.infra.gateways;

import com.luckraw.cleanarch.application.gateways.UserGateway;
import com.luckraw.cleanarch.domain.entity.User;
import com.luckraw.cleanarch.infra.persistence.UserEntity;
import com.luckraw.cleanarch.infra.persistence.UserRepository;

public class UserRepositoryGateway implements UserGateway {

    private final UserRepository userRepository;
    private final UserEntityMapper userEntityMapper;
    public UserRepositoryGateway(UserRepository userRepository, UserEntityMapper userEntityMapper) {
        this.userRepository = userRepository;
        this.userEntityMapper = userEntityMapper;
    }

    @Override
    public User save(User userDomainObj) {
        UserEntity userEntity = userEntityMapper.toEntity(userDomainObj);
        UserEntity save = userRepository.save(userEntity);
        return userEntityMapper.toDomain(save);
    }
}
