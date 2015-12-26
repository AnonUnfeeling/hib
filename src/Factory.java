/**
 * Created by anon on 18.12.2015.
 */
public class Factory {
    private static DBDAO dbdao = null;
    private static Factory factory = null;

    public static synchronized Factory getFactory(){
        if(factory==null){
            factory= new Factory();
        }
        return factory;
    }

    public DBDAO getDbdao(){
        if(dbdao==null){
            dbdao = new DAOImpl();
        }
        return dbdao;
    }
}
