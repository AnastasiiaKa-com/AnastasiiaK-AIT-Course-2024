package Classwork_22.user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTest {
    User user;

    final String email = "peter@mail.de"; // ideal email
    final String password = "123456Az!"; // ideal password


    @BeforeEach
    void setUp() {
        user = new User(email, password); // create new 'fresh' object user
    }

    @Test
    void testValidEmail(){

        user.setEmail(email);
        assertEquals("peter@mail.de", user.getEmail());

    }


    @Test
    void setEmailNoAt() {
        String email = "petermail.de"; // wrong email
        user.setEmail(email);
        assertEquals("peter@mail.de", user.getEmail()); // email didn't change

    }
    @Test
    void setEmailWithTwoDots() {
        String email = "peter@mailukco"; // wrong email
        user.setEmail(email);
        assertEquals("peter@mail.de", user.getEmail());
        System.out.println(user.getEmail());
    }

    @Test
    void setValidPassword(){


    }



    @Test
    void setXXXXXXPassword(){



    }


}