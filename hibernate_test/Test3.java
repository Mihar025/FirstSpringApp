package hibernate_test;
import java.util.List;
import hibernate_test.entity.Employee;
import org.antlr.v4.runtime.atn.SemanticContext;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test3 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
//
//            List<Employee> emps = session.createQuery("from Employee") // 1-t way
//                    .getResultList();

     // Second way
//            List<Employee> emps = session.createQuery("from Employee" +
//                            "where name= 'Alexandr' AND salary >1000") // 1-t way
//                            .getResultList();

            List<Employee> emps = session.createQuery("from Employee where name = 'Misha' and salary > 350")
                    .getResultList();


            for(Employee e: emps){
                System.out.println(e);
            }


            session.getTransaction().commit();

            System.out.println("Done!");

        } finally {
            factory.close();
        }
    }
}
