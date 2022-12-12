package adapter.TASK2;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class FACEBOOKUser {
    private String email;
    private Country country;
    private LocalDate lastActiveTime;
}
