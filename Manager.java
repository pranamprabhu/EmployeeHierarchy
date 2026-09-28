public class Manager extends Employee {
    private double bonus;

    public Manager(int id, String name, double baseSalary, double bonus) {
        super(id, name, baseSalary);
        this.bonus = bonus;
    }

    // Specialized behavior (override calculateSalary to include bonus)
    @Override
    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }

    // Specialized behavior
    public void conductMeeting() {
        System.out.println(getName() + " is conducting a team meeting.");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Manager, Bonus: $" + bonus + ", Total Salary: $" + calculateSalary());
    }
}
