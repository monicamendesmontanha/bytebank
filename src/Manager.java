public class Manager extends Staff {

    private int password;

    public void setPassword(int password) {
        this.password = password;
    }

    public boolean authenticates (int password) {
        if (this.password == password) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double getBonus() {
        return getSalary() + (0.1 * getSalary());
    }
}
