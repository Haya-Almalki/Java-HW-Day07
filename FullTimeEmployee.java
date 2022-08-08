public class FullTimeEmployee extends Employee{

    private int weeklySalary;

    public FullTimeEmployee(int id, String name, int weeklySalary) {
        super(name, id);
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double computeAmount() {
        return 4*weeklySalary;
    }
}
