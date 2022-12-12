package adapter.TASK3;

public class Авторизація {
    public boolean авторизуватися(БазаДаних DB){
        DB.отриматиДаніКористувача();
        return true;
    }
}
