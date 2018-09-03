package staff;

public class ManagerTest {

    public static void main(String[] args) {

        Manager m1 = new Manager();
        m1.setName("Dan Doe");
        m1.setId("23252710-0");
        m1.setSalary(5000.0);

        System.out.println("name: " + m1.getName());
        System.out.println("id: " + m1.getId());
        System.out.println("salary: " + m1.getSalary());

        m1.setPassword(2222);
        boolean authenticated = m1.authenticates (2222);

        System.out.println(authenticated);

        System.out.println("bonus: " + m1.getBonus());

    }
}
