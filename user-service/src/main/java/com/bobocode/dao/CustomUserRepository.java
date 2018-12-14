package com.bobocode.dao;

import com.bobocode.model.RoleType;

/**
 * This class declares custom {@link UserRepository} methods
 * <p>
 * todo: 0. PLEASE NOTE, THAT SOME REQUIRED STEPS ARE OMITTED IN THE TODO LIST AND YOU HAVE TO DO IT ON YOUR OWN
 * <p>
 * todo: 1. Create class called "CustomUserRepositoryImpl"
 * todo: 2. Mark that class {@link org.springframework.stereotype.Repository}
 * todo: 3. Mark that class {@link org.springframework.transaction.annotation.Transactional}
 * todo: 4. Implement method {@link CustomUserRepository#addRoleToAllUsers(RoleType)}
 */

public interface CustomUserRepository {
    void addRoleToAllUsers(RoleType roleType);
}
