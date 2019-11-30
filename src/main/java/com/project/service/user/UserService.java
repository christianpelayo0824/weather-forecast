package com.project.service.user;

import com.project.model.user.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    void createUser(User user);

    void deleteUserById(int userId);

    Optional<User> retrieveUserById(int userId);

    List<User> retrieveAllUser();
}
