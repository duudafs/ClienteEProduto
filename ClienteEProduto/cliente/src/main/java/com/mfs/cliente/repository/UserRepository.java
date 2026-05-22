package com.mfs.cliente.repository;

import com.mfs.cliente.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByLogin(String role);
}
