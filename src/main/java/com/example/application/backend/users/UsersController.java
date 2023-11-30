package com.example.application.backend.users;

import java.util.function.Consumer;

/**
 * @author snd00 created at 29.11.2023
 * @project usersrepository
 */
public interface UsersController {
    void supplyCallableUsers(Consumer<User> suppliedUsers);

    void editUser(User oldUser, User newUser);

    void putUser(User newUser);

    void deleteUser(User deletedUser);
}