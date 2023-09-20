package com.ny_vrs.backend.service;

import com.ny_vrs.backend.exception.UserNotFoundException;
import com.ny_vrs.backend.model.User;
import com.ny_vrs.backend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public final User findUserByEmail(String email) {
        return userRepository.findByEmail(email).orElseThrow(() -> new UserNotFoundException("User not exists with that email."));
    }
}
