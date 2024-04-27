package com.ensias.healthcareapp;

import org.junit.Test;
import java.util.Date;
import static org.junit.Assert.*;

public class MessageTest {

    @Test
    public void testConstructorAndGetters() {
        // Arrange
        String messageContent = "Hello!";
        String userSender = "sender@example.com";

        // Act
        Message message = new Message(messageContent, userSender);

        // Assert
        assertEquals(messageContent, message.getMessage());
        assertNull(message.getDateCreated()); // Проверяем, что дата создания инициализируется как null
        assertEquals(userSender, message.getUserSender());
    }

    @Test
    public void testSetters() {
        // Arrange
        Message message = new Message();
        String newMessageContent = "New message";
        String newUserSender = "new_sender@example.com";
        Date newDateCreated = new Date();

        // Act
        message.setMessage(newMessageContent);
        message.setUserSender(newUserSender);
        message.setDateCreated(newDateCreated);

        // Assert
        assertEquals(newMessageContent, message.getMessage());
        assertEquals(newUserSender, message.getUserSender());
        assertEquals(newDateCreated, message.getDateCreated());
    }

    // Если вы будете использовать Firebase Firestore, то вам нужно также написать тесты для проверки аннотации @ServerTimestamp
}
