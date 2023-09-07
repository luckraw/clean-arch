package com.luckraw.cleanarch.main;

import com.luckraw.cleanarch.application.gateways.UserGateway;
import com.luckraw.cleanarch.application.usecases.CreateUserInteractor;
import com.luckraw.cleanarch.infra.controllers.UserDTOMapper;
import com.luckraw.cleanarch.infra.gateways.UserEntityMapper;
import com.luckraw.cleanarch.infra.gateways.UserRepositoryGateway;
import com.luckraw.cleanarch.infra.persistence.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    CreateUserInteractor createUserInteractor(UserGateway userGateway) {
        return new CreateUserInteractor(userGateway);
    }

    @Bean
    UserGateway userGateway(UserRepository userRepository, UserEntityMapper userEntityMapper) {
        return new UserRepositoryGateway(userRepository, userEntityMapper);
    }

    @Bean
    UserEntityMapper userEntityMapper() {
        return new UserEntityMapper();
    }

    @Bean
    UserDTOMapper userDTOMapper() {
        return new UserDTOMapper();
    }


}
