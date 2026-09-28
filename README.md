# Employee Hierarchy

This project demonstrates the core Object-Oriented Programming (OOP) concept of **Inheritance** in Java. 

It defines a base `Employee` class containing common properties and methods, and extends it into three specialized child classes:
- **`Developer`**: Adds a programming language attribute and specialized behavior for writing code.
- **`Manager`**: Adds a bonus attribute, overrides the salary calculation to include the bonus, and provides specialized behavior for conducting meetings.
- **`Intern`**: Adds a university attribute and specialized learning behavior.

## How to Run

1. Make sure you have Java (JDK) installed on your system.
2. Compile the Java files:
   ```bash
   javac Employee.java Developer.java Manager.java Intern.java Main.java
   ```
3. Run the main class to see the output:
   ```bash
   java Main
   ```
