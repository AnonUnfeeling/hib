import java.util.List;

/**
 * Created by anon on 18.12.2015.
 */
public class Main {
    public static void main(String[] args) {
        DB db = new DB();
        db.setName("dsadsadsadsa");

        Factory.getFactory().getDbdao().add(db);

        db.setName("d232132100");
        Factory.getFactory().getDbdao().add(db);
        db.setName("222");
        Factory.getFactory().getDbdao().add(db);
        List<DB> list = Factory.getFactory().getDbdao().getAll();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName());
        }
    }
}
