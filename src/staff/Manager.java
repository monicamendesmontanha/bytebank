package staff;

public class Manager extends Staff implements Authenticated {

    private Authentication authentication;

    public Manager(){

        this.authentication = new Authentication();
    }

    @Override
    public void setPassword(int password) {
        this.authentication.setPassword(password);
    }

    @Override
    public boolean authenticates(int password) {
        return this.authentication.authenticates(password);
    }

    @Override
    public double getBonus() {
        return getSalary() + (0.1 * getSalary());
    }
}
