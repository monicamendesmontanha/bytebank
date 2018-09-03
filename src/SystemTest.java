import staff.Manager;

public class SystemTest {

    public static void main(String[] args) {

        Manager m = new Manager();
        m.setPassword(2225);

        InternalSystem si = new InternalSystem();
        si.authenticates(m);
    }
}
