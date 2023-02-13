import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

public class MySqlTest2 extends BaseMySqlTest{

    @BeforeAll
    static void init2(){
        setDataDumpMySqlFile("emocije_data_dump.sql");
        setEmptyDumpMySqlFile("emocije_drop_dump.sql");
        emptyData();
        fillData();
    }

    @Test
    void test() throws SQLException {
        statement.executeUpdate("DELETE FROM emocije WHERE Id = 4;");
    }

    @AfterAll
    static void showResult(){
        showTable();
        emptyData();
    }

}