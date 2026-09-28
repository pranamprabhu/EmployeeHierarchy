public class Main {
    public static void main(String[] args) {
        Developer dev = new Developer(101, "Alice Smith", 80000, "Java");
        Manager mgr = new Manager(102, "Bob Johnson", 100000, 20000);
        Intern intern = new Intern(103, "Charlie Brown", 35000, "State University");

        System.out.println("--- Developer Details ---");
        dev.displayDetails();
        dev.writeCode(); // Calling specialized behavior

        System.out.println("\n--- Manager Details ---");
        mgr.displayDetails();
        mgr.conductMeeting(); // Calling specialized behavior

        System.out.println("\n--- Intern Details ---");
        intern.displayDetails();
        intern.learn(); // Calling specialized behavior
    }
}
