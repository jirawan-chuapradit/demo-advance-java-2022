package register;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoServiceTest {

    @Test
    void case_1_should_get_2() {
        DB db = new DBx();
        DemoService demoService = new DemoService(db);
        String actualResult = demoService.compute(1);
        assertEquals("Result = 2", actualResult);
    }
}

class  DBx implements  DB {
    @Override
    public int increaseOne(int id) {
        return 2;
    }
}