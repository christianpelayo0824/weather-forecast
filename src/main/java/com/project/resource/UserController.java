package com.project.resource;

import com.project.model.user.User;
import com.project.service.user.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    /**
     * CREATE
     * - This will create User
     *
     * @param user - user object
     */
    @PostMapping("/createUser")
    public void createUser(@RequestBody User user) {
        userService.createUser(user);
    }

    /**
     * RETRIEVE ALL USER
     *
     * @return
     */
    @GetMapping("/retrieveUsers")
    public List<User> retrieveUsers() {
        return userService.retrieveAllUser();
    }

    /**
     * RETRIEVE USER BY ID
     *
     * @param userId
     * @return
     */
    @GetMapping("/retrieveUser/{userId}")
    public Optional<User> retrieveUser(@PathVariable("userId") int userId) {
        return userService.retrieveUserById(userId);
    }
}
