package com.bobocode.service;

import com.bobocode.dao.UserRepository;
import com.bobocode.exception.EntityNotFoundException;
import com.bobocode.model.RoleType;
import com.bobocode.model.User;

import java.util.List;

/**
 * This class provides service logic for {@link User}.
 * <p>
 * todo: 0. PLEASE NOTE, THAT SOME REQUIRED STEPS ARE OMITTED IN THE TODO LIST AND YOU HAVE TO DO IT ON YOUR OWN
 * <p>
 * todo: 1. Implement {@link UserService#findByCity(String)} using {@link UserRepository}, make method read only
 * todo: 2. Implement {@link UserService#getByEmail(String)} using {@link UserRepository}, make method read only
 * todo: 3. In case user is not found by email, throw {@link EntityNotFoundException} with message "Cannot find user by email ${email}"
 * todo: 4. Implement {@link UserService#addRoleToAllUser(RoleType)} using {@link UserRepository}
 */
public class UserService {
    public List<User> findByCity(String city) {
        throw new UnsupportedOperationException("Do your best and implement this method!");
    }

    public User getByEmail(String email) {
        throw new UnsupportedOperationException("Do your best and implement this method!");
    }

    public void addRoleToAllUser(RoleType roleType) {
        throw new UnsupportedOperationException("Do your best and implement this method!");
    }
}
