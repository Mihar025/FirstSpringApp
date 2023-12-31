package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import  org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

try {
    Session session = factory.getCurrentSession();
    Employee emp = new Employee("Misha", "Maidanskyi", "IT", 450);

    session.beginTransaction();
    session.save(emp);
    session.getTransaction().commit();

}   finally {
    factory.close();
}
    }
}
