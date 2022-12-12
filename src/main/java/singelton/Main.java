package singelton;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        User user = new User(
                "Ivan",
                "vanya.varanytsa@gmail.com",
                18
        );
        user.save();
    }
}
