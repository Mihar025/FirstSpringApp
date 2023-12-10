package hibernate_Bi_one_by_one;


import hibernate_Bi_one_by_one.Entity.Detail;
import hibernate_Bi_one_by_one.Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();



        Session session = null;
        try {
            session = factory.getCurrentSession();

//
//            session.beginTransaction();
//            Detail detail = session.get(Detail.class,1);
//            System.out.println(detail.getEmployee());
//
//
//            session.getTransaction().commit();
//            System.out.println("Done");




            session.beginTransaction();
            Detail detail = session.get(Detail.class,1);
            session.delete(detail);

            session.getTransaction().commit();
            System.out.println("Done");



        } finally {
            factory.close();
        }
    }
}


