package com.devsuperior.dscommerce.tests;

import com.devsuperior.dscommerce.entities.Role;
import com.devsuperior.dscommerce.entities.User;

import java.time.LocalDate;

public class UserFactory {

    public static User createClientUser() {
        User user = new User(1L, "Maria", "maria@gmail.com", "98888889", LocalDate.parse("2001-07-25"), "$2a$10$lqd02dKURKX/h.XIQrdcYem5EUWfmYAseJGlnkP1qWYYLVUxLX2nG");
        user.addRole(new Role(1L, "ROLE_CLIENT"));
        return user;
    }

    public static User createAdminUser() {
        User user = new User(2L, "Alex", "alex@gmail.com", "977777777", LocalDate.parse("2001-07-25"), "$2a$10$lqd02dKURKX/h.XIQrdcYem5EUWfmYAseJGlnkP1qWYYLVUxLX2nG");
        user.addRole(new Role(2L, "ROLE_ADMIN"));
        return user;
    }

    public static User createCustomClientUser(Long id, String username) {
        User user = new User(id, "Maria", username, "98888889", LocalDate.parse("2001-07-25"), "$2a$10$lqd02dKURKX/h.XIQrdcYem5EUWfmYAseJGlnkP1qWYYLVUxLX2nG");
        user.addRole(new Role(1L, "ROLE_CLIENT"));
        return user;
    }

    public static User createCustomAdminUser(Long id, String username) {
        User user = new User(id, "Alex", username, "977777777", LocalDate.parse("2001-07-25"), "$2a$10$lqd02dKURKX/h.XIQrdcYem5EUWfmYAseJGlnkP1qWYYLVUxLX2nG");
        user.addRole(new Role(2L, "ROLE_ADMIN"));
        return user;
    }


}
