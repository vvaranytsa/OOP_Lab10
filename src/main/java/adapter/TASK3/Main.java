package adapter.TASK3;

public class Main {
    public static void main(String[] args) {
        DataBASE database = new DataBASE();
        Authorization authorization = new Authorization();

        if (authorization.authorize(database)) {
            ReportBuilder reportBuilder = new ReportBuilder(database);
            Report report = reportBuilder.buildReport();

            System.out.println(report);
        }
    }
}
