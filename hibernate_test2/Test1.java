package hibernate_test2;

import hibernate_test2.entity.Detail;
import hibernate_test2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import  org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

//        try {
//            Session session = factory.getCurrentSession();
//            session.beginTransaction();
//            Employee employee = new Employee("John", "Joknovich", "Finance", 1200);
//            Detail detail = new Detail("New-York", "347-828-5790", "johnsofteng@gmail.com");
//            employee.setEmpDetail(detail);
//
//
//            session.save(employee);
//
//            session.getTransaction().commit();
//            System.out.println("Done");
//
//
//        }   finally {
//            factory.close();
//
        Session session = null;
        try {
            session = factory.getCurrentSession();
            session.beginTransaction();
            Employee emp = session.get(Employee.class, 2);
          //  System.out.println(emp.getEmpDetail()); FOR SHOWING DETAILS ABOUT EMPLOYEE
            session.delete(emp);

            session.getTransaction().commit();
            System.out.println("Done");

        }   finally {
            session.close();
            factory.close();
        }
    }
}

