package TASK2;

import adapter.TASK2.Client;
import adapter.TASK2.Login;
import org.junit.jupiter.api.Test;



import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TASK2_TEST {
    @Test
    public void testLoginFacebook() {
        Login login = new Login();
        Client user = login.login("facebook");

        assertEquals(user.getEmail(), "vanya.varanytsa@gmail.com");
        assertEquals(user.getCountry(), "GREAT_BRITAIN");
        assertEquals(user.getLastActiveTime(), LocalDate.of(2004, 9, 3));
    }

    @Test
    public void testLoginTwitter() {
        Login login = new Login();
        Client user = login.login("twitter");

        assertEquals(user.getEmail(), "vanya.varanytsa@gmail.com");
        assertEquals(user.getCountry(), "FRANCE");
        assertEquals(user.getLastActiveTime(), LocalDate.of(2001, 5, 2));
    }

    @Test
    public void testLoginException() {
        Login login = new Login();
        try {
            login.login("telegram");
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "Unsupported login method");
        }
    }
}