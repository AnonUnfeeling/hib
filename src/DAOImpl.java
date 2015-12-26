import org.hibernate.Session;

import java.util.List;

/**
 * Created by anon on 18.12.2015.
 */
public class DAOImpl implements DBDAO {
    @Override
    public void add(DB db) {
        Session session = HibernateUnit.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(db);
        session.getTransaction().commit();
    }

    @Override
    public List getAll() {
        Session session = HibernateUnit.getSessionFactory().openSession();
        List<DB> list = session.createCriteria(DB.class).list();
        return list;
    }
}
