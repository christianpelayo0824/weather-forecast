package com.project.repository.user;

import com.project.model.user.User;
import com.project.repository.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends BaseRepository<User, Integer> {
    Optional<User> findByEmail(String email);
}
