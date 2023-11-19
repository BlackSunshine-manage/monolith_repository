package com.example.application.backend.users.user.callable.user;

import com.example.application.backend.users.user.Profile;
import com.example.application.backend.users.user.callable.CallAlgorithm;

import java.util.List;
import java.util.function.Consumer;

import static com.example.application.backend.users.user.callable.CallAlgorithm.PHONE;

/**
 * @author snd00 created at 19.11.2023
 * @project usersrepository
 */
public final class UserWithPhone extends UserCallableImpl {
    public UserWithPhone(Profile profile, ContactInfoCard contactCard) {
        super(profile, contactCard);
    }

    @Override
    public void howCanReach(Consumer<List<CallAlgorithm>> suppliedCallAlgorithm) {
        suppliedCallAlgorithm.accept(List.of(PHONE));
    }

    @Override
    public void call(CallAlgorithm howReach, Consumer<String> callResult) {
        if(howReach == PHONE) super.supplyPhone(callResult);
    }
}