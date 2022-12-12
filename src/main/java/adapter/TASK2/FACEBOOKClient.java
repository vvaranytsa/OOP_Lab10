package adapter.TASK2;

import lombok.AllArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
public class FACEBOOKClient implements Client{
    private final FACEBOOKUser user;
    @Override
    public String getEmail(){
        return user.getEmail();
    }
    @Override
    public String getCountry(){
        return String.valueOf(user.getCountry());
    }
    @Override
    public LocalDate getLastActiveTime(){
        return user.getLastActiveTime();
    }

}
