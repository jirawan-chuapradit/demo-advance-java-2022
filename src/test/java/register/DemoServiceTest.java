package register;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoServiceTest {

    @Test
    void case_1_should_get_2() {
        DB db = new DB() {
            @Override
            int increaseOne(int id) {
                return 2;
            }
        };
        DemoService demoService = new DemoService(db);
        String actualResult = demoService.compute(1);
        assertEquals("Result = 2", actualResult);
    }
}