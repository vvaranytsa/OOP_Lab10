package adapter.TASK3;

public class DataBASE extends БазаДаних{
    public String getStatistics() {
        return super.отриматиСтатистичніДані();
    }
    public String getUserData() {
        return super.отриматиДаніКористувача();
    }
}
