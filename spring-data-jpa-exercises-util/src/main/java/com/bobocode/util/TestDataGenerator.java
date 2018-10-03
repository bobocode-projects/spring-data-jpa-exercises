package com.bobocode.util;


import com.bobocode.model.Address;
import com.bobocode.model.Role;
import com.bobocode.model.RoleType;
import com.bobocode.model.User;
import io.codearte.jfairy.Fairy;
import io.codearte.jfairy.producer.person.Person;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class TestDataGenerator {

    private List<Role> generateRoleList() {
        Random random = new Random();
        Predicate<RoleType> randomPredicate = i -> random.nextBoolean();

        return Stream.of(RoleType.values())
                .filter(randomPredicate)
                .map(Role::valueOf)
                .collect(toList());
    }

    public  User generateUser(RoleType... roles) {
        User user = generateUserWithoutRoles();
        Stream.of(roles)
                .map(Role::valueOf)
                .forEach(user::addRole);

        return user;
    }

    private User generateUserWithoutRoles() {
        Fairy fairy = Fairy.create();
        Person person = fairy.person();

        User user = new User();
        user.setFirstName(person.getFirstName());
        user.setLastName(person.getLastName());
        user.setEmail(person.getEmail());
        user.setBirthday(LocalDate.of(
                person.getDateOfBirth().getYear(),
                person.getDateOfBirth().getMonthOfYear(),
                person.getDateOfBirth().getDayOfMonth()));
        user.setCreationDate(LocalDate.now());

        Address address = generateAddress();
        user.setAddress(address);

        return user;
    }


    public User generateUser() {
        User user = generateUserWithoutRoles();
        user.addRoles(generateRoleList());

        return user;
    }

    private Address generateAddress() {
        Fairy fairy = Fairy.create();
        Person person = fairy.person();

        Address address = new Address();
        address.setCity(person.getAddress().getCity());
        address.setStreet(person.getAddress().getStreet());
        address.setStreetNumber(person.getAddress().getStreetNumber());
        address.setApartmentNumber(person.getAddress().getApartmentNumber());
        address.setCreationDate(LocalDateTime.now());
        address.setZipCode(person.getAddress().getPostalCode());

        return address;
    }

}