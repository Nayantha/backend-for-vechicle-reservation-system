package com.ny_vrs.backend.repository;

import com.ny_vrs.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
