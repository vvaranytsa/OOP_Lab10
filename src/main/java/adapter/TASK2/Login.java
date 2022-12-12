package adapter.TASK2;

import java.time.LocalDate;

public class Login {
    public Client login(String loginMethod){
        if (loginMethod.equals("facebook")){
            return new FACEBOOKClient(new FACEBOOKUser(
                    "vanya.varanytsa@gmail.com",
                    Country.GREAT_BRITAIN,
                    LocalDate.of(2004, 9, 3)
            ));
        }
        if (loginMethod.equals("twitter")) {
            return new TWITTERClient(new TWITTERUser(
                    "vanya.varanytsa@gmail.com",
                    Country.FRANCE,
                    LocalDate.of(2001, 5, 2)
            ));
        }
        throw new IllegalArgumentException("Unsupported login method");
    }



}
