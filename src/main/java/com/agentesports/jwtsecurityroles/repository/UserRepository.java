package com.agentesports.jwtsecurityroles.repository;

import com.agentesports.jwtsecurityroles.entities.Role;
import com.agentesports.jwtsecurityroles.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByEmail(String email);

    User findByRole(Role role);
}
