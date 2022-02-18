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

    @Test
    void case_2_test_spy() {
        SpyDBx spyDBx = new SpyDBx();
        DemoService demoService = new DemoService(spyDBx);
       demoService.compute(1);
        spyDBx.verify(1);
    }
}

class  DBx implements  DB {
    @Override
    public int increaseOne(int id) {
        return 2;
    }
}

class  SpyDBx implements  DB {
   private  int count;

   public  void  verify(int count) {
    assertTrue(count == this.count, "must call count = "+ count + "but"+ "call = "+ this.count);
   }

    @Override
    public int increaseOne(int id) {
        count++;
        return 2;
    }
}