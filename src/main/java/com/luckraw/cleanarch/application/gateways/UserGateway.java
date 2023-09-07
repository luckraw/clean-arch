package com.luckraw.cleanarch.application.gateways;

import com.luckraw.cleanarch.domain.entity.User;

public interface UserGateway {

    User save(User user);
}
