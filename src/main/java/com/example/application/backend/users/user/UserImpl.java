package com.example.application.backend.users.user;

import com.example.application.backend.users.User;
import lombok.RequiredArgsConstructor;

/**
 * @author snd00 created at 18.11.2023
 * @project usersrepository
 */
@RequiredArgsConstructor
public class UserImpl implements User {
    private final Profile profile;
}