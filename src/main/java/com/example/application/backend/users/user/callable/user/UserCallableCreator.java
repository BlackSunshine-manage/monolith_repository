package com.example.application.backend.users.user.callable.user;

import com.example.application.backend.users.user.callable.CallAlgorithm;
import com.example.application.backend.users.user.callable.UserCallable;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import static com.example.application.backend.users.user.callable.CallAlgorithm.*;

/**
 * @author snd00 created at 21.11.2023
 * @project usersrepository
 */
public class UserCallableCreator implements UserCallableFactory {
    private static final Predicate<List<CallAlgorithm>> SIZE_IS_ONE = algorithms -> (algorithms.size() == 1);
    private static final Predicate<List<CallAlgorithm>> SIZE_IS_TWO = algorithms -> (algorithms.size() == 2);
    private static final Predicate<List<CallAlgorithm>> SIZE_IS_THREE = algorithms -> (algorithms.size() == 3);

    private static final Predicate<List<CallAlgorithm>> CONTAIN_PHONE_ALGORITHM = algorithms -> algorithms.stream()
            .anyMatch(algorithm -> (algorithm == PHONE));
    private static final Predicate<List<CallAlgorithm>> CONTAIN_EMAIL_ALGORITHM = algorithms -> algorithms.stream()
            .anyMatch(algorithm -> (algorithm == EMAIL));
    private static final Predicate<List<CallAlgorithm>> CONTAIN_ADDRESS_ALGORITHM = algorithms -> algorithms.stream()
            .anyMatch(algorithm -> (algorithm == PHONE));

    private static final Predicate<List<CallAlgorithm>> FAKE = algorithms -> true;

    @Override
    public UserCallableImpl create(List<CallAlgorithm> algorithms) {
        algorithms = algorithms.stream()
                .distinct()
                .toList();

        return null;
    }

    enum ConditionToCreate {
        PHONED(SIZE_IS_ONE, CONTAIN_PHONE_ALGORITHM),
        EMAILED(SIZE_IS_ONE, CONTAIN_EMAIL_ALGORITHM),
        ADDRESSED(SIZE_IS_ONE, CONTAIN_ADDRESS_ALGORITHM),
        PHONED_EMAILED(SIZE_IS_TWO, CONTAIN_PHONE_ALGORITHM, CONTAIN_EMAIL_ALGORITHM),
        ;


        private final Predicate<List<CallAlgorithm>> algorithmCondition;

        public static void supplyUserCallableImpl(Consumer<UserCallableImpl> toSupply, List<CallAlgorithm> algorithms) {

        }

        ConditionToCreate(Predicate<List<CallAlgorithm>> ... conditionsToCreateCallableUser) {
            algorithmCondition = Arrays.stream(conditionsToCreateCallableUser)
                    .reduce(Predicate::and)
                    .orElse((FAKE));
        }
    }

}