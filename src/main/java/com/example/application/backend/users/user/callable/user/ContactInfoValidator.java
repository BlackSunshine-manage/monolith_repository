package com.example.application.backend.users.user.callable.user;

import java.util.function.Consumer;

import static java.util.Objects.nonNull;

/**
 * @author snd00 created at 19.11.2023
 * @project usersrepository
 */
public class ContactInfoValidator extends ContactInfoCard {
    public ContactInfoValidator(String phone, String email, String address) {
        super(phone, email, address);
    }

    @Override
    public void supplyPhone(Consumer<String> phoneSupplier) {
        if (phone.isPresent()) super.supplyPhone(phoneSupplier);
    }

    @Override
    public void supplyEmail(Consumer<String> emailSupplier) {
        if (email.isPresent()) super.supplyPhone(emailSupplier);
    }

    @Override
    public void supplyAddress(Consumer<String> addressSupplier) {
        if (address.isPresent()) super.supplyAddress(addressSupplier);
    }
}