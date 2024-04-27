package com.ensias.healthcareapp;

import org.junit.Test;
import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void testUserConstructorAndGetters() {
        // Arrange
        String name = "John Doe";
        String adresse = "123 Main Street";
        String tel = "123-456-7890";
        String email = "john@example.com";
        String type = "Patient";

        // Act
        User user = new User(name, adresse, tel, email, type);

        // Assert
        assertEquals(name, user.getName());
        assertEquals(adresse, user.getAdresse());
        assertEquals(tel, user.getTel());
        assertEquals(email, user.getEmail());
        assertEquals(type, user.getType());
    }

    @Test
    public void testUserSetters() {
        // Arrange
        User user = new User();
        String name = "Jane Doe";
        String adresse = "456 Elm Street";
        String tel = "987-654-3210";
        String email = "jane@example.com";
        String type = "Doctor";

        // Act
        user.setName(name);
        user.setAdresse(adresse);
        user.setTel(tel);
        user.setEmail(email);
        user.setType(type);

        // Assert
        assertEquals(name, user.getName());
        assertEquals(adresse, user.getAdresse());
        assertEquals(tel, user.getTel());
        assertEquals(email, user.getEmail());
        assertEquals(type, user.getType());
    }
}




