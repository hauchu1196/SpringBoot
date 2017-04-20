package com.hau.springboot.service;

import com.hau.springboot.model.User;

import java.util.List;

/**
 * Created by Hau on 20/04/2017.
 */
public interface UserService {

    User findById(Long id);

    User findByIdStudent(String idStudent);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUserById(Long id);

    void deleteAllUsers();

    List<User> findAllUsers();

    boolean isUserExist(User user);
}
