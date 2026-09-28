public class Employee {
    private int id;
    private String name;
    private double baseSalary;

    public Employee(int id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    // Common method
    public double calculateSalary() {
        return baseSalary;
    }

    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Base Salary: $" + baseSalary);
    }
}
