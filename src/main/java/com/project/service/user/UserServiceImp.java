package com.project.service.user;

import com.project.model.user.User;
import com.project.repository.user.UserRepository;
import com.project.service.user.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImp implements UserService {

    private UserRepository userRepository;

    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * CREATE USER
     *
     * @param user - user object
     */
    @Override
    public void createUser(User user) {
        userRepository.save(user);
    }

    /**
     * DELETE BY ID
     *
     * @param userId
     */
    @Override
    public void deleteUserById(int userId) {
        userRepository.deleteById(userId);
    }

    /**
     * RETRIEVE
     *
     * @return
     */
    @Override
    public List<User> retrieveAllUser() {
        return userRepository.findAll();
    }

    /**
     * RETRIEVE BY ID
     *
     * @param userId
     * @return
     */
    @Override
    public Optional<User> retrieveUserById(int userId) {
        return userRepository.findById(userId);
    }
}
