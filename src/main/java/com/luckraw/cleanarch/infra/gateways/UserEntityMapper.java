package com.luckraw.cleanarch.infra.gateways;

import com.luckraw.cleanarch.domain.entity.User;
import com.luckraw.cleanarch.infra.persistence.UserEntity;

public class UserEntityMapper {

    UserEntity toEntity(User userDomainObj) {
        return new UserEntity(userDomainObj.name(), userDomainObj.email(), userDomainObj.password());
    }

    User toDomain(UserEntity userEntity) {
        return new User(userEntity.getName(), userEntity.getEmail(), userEntity.getPassword());
    }
}
