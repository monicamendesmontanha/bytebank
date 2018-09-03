public class BonusController {

    private double sum;

    public double getSum() {
        return sum;
    }

    public void register (Staff s) {
        double bonus = s.getBonus();
        this.sum = this.sum + bonus;
    }
}
