package adapter.TASK3;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ReportBuilder{
    private DataBASE database;
    public Report buildReport(){
        String userData = database.getUserData();
        String statistics = database.getStatistics();

        return new Report(statistics, userData);
    }

}
