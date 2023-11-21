package com.example.application.backend.users.user.callable.user;

import com.example.application.backend.users.user.Profile;
import com.example.application.backend.users.user.callable.CallAlgorithm;
import com.example.application.backend.users.user.callable.UserCallable;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import static com.example.application.backend.users.user.callable.CallAlgorithm.PHONE;

/**
 * @author snd00 created at 21.11.2023
 * @project usersrepository
 */
@Getter
@RequiredArgsConstructor
enum AlgorithmResolver {
    PHONED(PHONE) {
        public void call(UserCallableImpl user, CallAlgorithm howReach, Consumer<String> callResult) {
            if (howReach == PHONE) user.supplyPhone(callResult);
        }
    },;

    AlgorithmResolver(CallAlgorithm ... algorithms) {
        this.availableAlgorithms = Arrays.stream(algorithms).toList();
    }

    public void howCanReach(Consumer<List<CallAlgorithm>> suppliedCallAlgorithm) {
        suppliedCallAlgorithm.accept(availableAlgorithms);
    }

    public abstract void call(UserCallableImpl user, CallAlgorithm howReach, Consumer<String> callResult);

    private final List<CallAlgorithm> availableAlgorithms;
}