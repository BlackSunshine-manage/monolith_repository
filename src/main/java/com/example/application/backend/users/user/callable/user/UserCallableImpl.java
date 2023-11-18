package com.example.application.backend.users.user.callable.user;

import com.example.application.backend.users.User;
import com.example.application.backend.users.user.Profile;
import com.example.application.backend.users.user.UserImpl;
import com.example.application.backend.users.user.callable.UserCallable;

/**
 * @author snd00 created at 18.11.2023
 * @project usersrepository
 */
public abstract class UserCallableImpl extends UserImpl implements UserCallable<UserCallableImpl> {
    public UserCallableImpl(Profile profile) {
        super(profile);
    }
}