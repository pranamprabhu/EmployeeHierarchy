public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(int id, String name, double baseSalary, String programmingLanguage) {
        super(id, name, baseSalary);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    // Specialized behavior
    public void writeCode() {
        System.out.println(getName() + " is writing code in " + programmingLanguage + ".");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Developer, Language: " + programmingLanguage);
    }
}
