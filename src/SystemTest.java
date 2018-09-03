import staff.Authenticated;
import staff.Manager;

public class SystemTest {

    public static void main(String[] args) {

        Authenticated m = new Manager();
        m.setPassword(2222);

        InternalSystem si = new InternalSystem();
        si.authenticates(m);
    }
}
