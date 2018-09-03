public class ReferencesTest {
    public static void main(String[] args) {

        Manager m1 = new Manager();
        m1.setName("Kelly");
        m1.setSalary(5000.0);

        Lawyer l1 = new Lawyer();
        l1.setName("Renata");
        l1.setSalary(2500.0);

        Secretary sec1 = new Secretary();
        sec1.setName("Mary");
        sec1.setSalary(2000.0);

        BonusController control = new BonusController();
        control.register(m1);
        control.register(l1);
        control.register(sec1);

        System.out.println("Total bonus: " + control.getSum());
    }

}
