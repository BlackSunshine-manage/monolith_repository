package com.example.application.backend.users.user.callable.user.with_phone;

import com.example.application.backend.users.user.Profile;
import com.example.application.backend.users.user.callable.CallAlgorithm;
import com.example.application.backend.users.user.callable.user.UserCallableImpl;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.function.Consumer;

import static com.example.application.backend.users.user.callable.CallAlgorithm.PHONE;

/**
 * @author snd00 created at 18.11.2023
 * @project usersrepository
 */
public class UserPhoned extends UserCallableImpl {
    private final String phone;

    public UserPhoned(Profile profile, String phone) {
        super(profile);
        this.phone = phone;
    }

    @Override
    public void howCanReach(Consumer<List<CallAlgorithm>> suppliedCallAlgorithm) {
        suppliedCallAlgorithm.accept(List.of(PHONE));
    }

    @Override
    public void call(CallAlgorithm howReach, Consumer<String> callResult) {
        if(howReach == PHONE) callResult.accept(phone);
    }
}