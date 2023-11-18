package com.example.application.backend;

import java.util.Collection;
import java.util.function.Consumer;

/**
 * @author snd00 created at 18.11.2023
 * @project usersrepository
 */
public interface CrudFrontController<T, C extends Collection<T>> {
    void edit(T oldItem, T newItem);
    void add(T item);
    void delete(T item);
    void get(Consumer<C> toSupply);
}