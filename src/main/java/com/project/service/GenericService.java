package com.project.service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface GenericService<T, I> {

    void createUser(T entity);

    void deleteUserById(I id);

    Optional<T> retrieveUserById(I id);

    List<T> retrieveAllUser();
}
