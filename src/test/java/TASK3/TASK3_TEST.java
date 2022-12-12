package TASK3;

import adapter.TASK3.Authorization;
import adapter.TASK3.DataBASE;
import adapter.TASK3.Report;
import adapter.TASK3.ReportBuilder;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TASK3_TEST {
    private static DataBASE database;

    @BeforeAll
    public static void setUp() {
        database = new DataBASE();
    }

    @Test
    public void testReport() {
        ReportBuilder reportBuilder = new ReportBuilder(database);
            Report report = reportBuilder.buildReport();

        assertEquals(report.getStatistics(), "hello2");
        assertEquals(report.getUserData(), "hello");
    }

    @Test
    public void testAuthorization() {
        Authorization authorization = new Authorization();
        assertTrue(authorization.authorize(database));
    }
}