public class StaffTest {

    public static void main(String[] args) {

        Staff s1 = new Staff();

        s1.setName("John Doe");
        s1.setId(("2240335644-9"));
        s1.setSalary(2600.00);

        System.out.println(s1.getName());
        System.out.println(s1.getBonus());
    }
}
