package com.bobocode.dao;

import com.bobocode.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * This interface represents a data access object (DAO) for {@link User}.
 * <p>
 * todo: 0. PLEASE NOTE, THAT SOME REQUIRED STEPS ARE OMITTED IN THE TODO LIST AND YOU HAVE TO DO IT ON YOUR OWN
 * <p>
 * todo: 1. Configure {@link UserRepository} as {@link JpaRepository} for class User
 * todo: 2. Create method that finds a list of Users by address city using Spring Data method name convention
 * todo: 3. Create method that finds optional user by email fetching its address and roles using {@link org.springframework.data.jpa.repository.Query}
 * todo: 4. Add custom User repository interface
 */
public interface UserRepository extends JpaRepository<User, Long>, CustomUserRepository {

    List<User> findAllByAddressCity(String city);

    @Query("select u from User u left join fetch u.address left join fetch u.roles where u.email = :email")
    Optional<User> findByEmailFetchRoles(@Param("email") String email);

}
