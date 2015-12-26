import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 * Created by anon on 18.12.2015.
 */
public class HibernateUnit {
    private static SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        return new AnnotationConfiguration().configure().buildSessionFactory();
    }
    //

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}
