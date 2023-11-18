package com.example.application.backend.users.user.callable;

import com.example.application.backend.users.User;

import java.util.List;
import java.util.function.Consumer;

/**
 * @author snd00 created at 18.11.2023
 * @project usersrepository
 */
public interface CanBeCalled <U extends User> {
    void howCanReach(Consumer<List<CallAlgorithm>> suppliedCallAlgorithm);
}