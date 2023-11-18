package com.example.application.backend.users.user.profile;

import com.example.application.backend.users.user.Profile;
import lombok.RequiredArgsConstructor;

/**
 * @author snd00 created at 18.11.2023
 * @project usersrepository
 */
@RequiredArgsConstructor
public class ProfileImpl implements Profile {
    private final String firstName;
    private final String lastName;
    private final String fatherName;
    @Override
    public String firstName() {
        return firstName;
    }

    @Override
    public String lastName() {
        return lastName;
    }

    @Override
    public String fatherName() {
        return fatherName;
    }
}