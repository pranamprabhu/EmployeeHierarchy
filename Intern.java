public class Intern extends Employee {
    private String university;

    public Intern(int id, String name, double baseSalary, String university) {
        super(id, name, baseSalary);
        this.university = university;
    }

    // Specialized behavior
    public void learn() {
        System.out.println(getName() + " is learning and assisting the team (University: " + university + ").");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Intern, University: " + university);
    }
}
