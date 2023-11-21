package com.example.application.backend.users.user.callable.user;

import com.example.application.backend.users.user.callable.CallAlgorithm;

import java.util.List;

/**
 * @author snd00 created at 21.11.2023
 * @project usersrepository
 */
public interface UserCallableFactory {
    UserCallableImpl create(List<CallAlgorithm> algorithms);
}