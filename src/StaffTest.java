public class StaffTest {

    public static void main(String[] args) {

        Staff nico = new Staff();

        nico.setName("John");
        nico.setId(("2240335644-9"));
        nico.setSalary(2600.00);

        System.out.println(nico.getName());
        System.out.println(nico.getBonus());
    }
}
