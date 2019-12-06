package com.codegym.login.repository;

import com.codegym.login.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserName(String username);

    User findByEmail(String email);
}
