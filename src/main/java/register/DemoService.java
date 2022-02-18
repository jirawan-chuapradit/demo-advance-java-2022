package register;

public class DemoService {
    private DB db;

    public DemoService(DB db) {
        this.db = db;
    }

    public String compute(int id) {
        return "Result = " + db.increaseOne(id);
    }

}

interface DB {
    int increaseOne(int id) ;
}