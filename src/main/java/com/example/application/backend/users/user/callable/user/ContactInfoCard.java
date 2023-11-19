package com.example.application.backend.users.user.callable.user;

import lombok.RequiredArgsConstructor;

import java.util.Optional;
import java.util.function.Consumer;

/**
 * @author snd00 created at 19.11.2023
 * @project usersrepository
 */
@RequiredArgsConstructor
abstract class ContactInfoCard {
    protected final Optional<String> phone;
    protected final Optional<String> email;
    protected final Optional<String> address;

    ContactInfoCard(String phone, String email, String address) {
        this.phone = Optional.ofNullable(phone);
        this.email = Optional.ofNullable(email);
        this.address = Optional.ofNullable(address);
    }

    public void supplyPhone(Consumer<String> phoneSupplier) {
        phoneSupplier.accept(phone.get());
    }

    public void supplyEmail(Consumer<String> emailSupplier) {
        emailSupplier.accept(email.get());
    }

    public void supplyAddress(Consumer<String> addressSupplier) {
        addressSupplier.accept(address.get());
    }
}