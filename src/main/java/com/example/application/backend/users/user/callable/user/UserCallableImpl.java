package com.example.application.backend.users.user.callable.user;

import com.example.application.backend.users.user.Profile;
import com.example.application.backend.users.user.UserImpl;
import com.example.application.backend.users.user.callable.UserCallable;

import java.util.function.Consumer;

/**
 * @author snd00 created at 18.11.2023
 * @project usersrepository
 */
public abstract class UserCallableImpl extends UserImpl implements UserCallable<UserCallableImpl> {
    private final ContactInfoCard contactCard;
    public UserCallableImpl(Profile profile, ContactInfoCard contactCard) {
        super(profile);
        this.contactCard = contactCard;
    }

    protected void supplyPhone(Consumer<String> phoneSupplier) {
        contactCard.supplyPhone(phoneSupplier);
    }

    protected void supplyEmail(Consumer<String> emailSupplier) {
        contactCard.supplyEmail(emailSupplier);
    }

    protected void supplyAddress(Consumer<String> addressSupplier) {
        contactCard.supplyAddress(addressSupplier);
    }
}