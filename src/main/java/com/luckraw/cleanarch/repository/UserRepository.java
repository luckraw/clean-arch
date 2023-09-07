package com.luckraw.cleanarch.repository;

import com.luckraw.cleanarch.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
