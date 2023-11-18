package com.example.application.backend.users.user.callable;

import com.example.application.backend.users.User;

import java.util.function.Consumer;

/**
 * @author snd00 created at 18.11.2023
 * @project usersrepository
 */
public interface UserCallable<U extends UserCallable<U>> extends User, CanBeCalled<U> {
    void call(CallAlgorithm howReach, Consumer<String> callResult);
}