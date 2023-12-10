package hibernate_test;



import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.management.Query;
import javax.security.auth.login.AppConfigurationEntry;

public class Test5 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
//  first way              Employee emp = session.get(Employee.class, 1);
//                session.delete(emp);
            //Second way:

            session.createQuery("delete from Employee where name='Elena'").executeUpdate();


            session.getTransaction().commit();
            System.out.println("Done");
        } finally {
            factory.close();
        }

    }
}
