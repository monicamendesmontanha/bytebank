public class StaffTest {

    public static void main(String[] args) {

        Staff john = new Staff();

        john.setName("John Doe");
        john.setId(("2240335644-9"));
        john.setSalary(2600.00);

        System.out.println(john.getName());
        System.out.println(john.getBonus());
    }
}
