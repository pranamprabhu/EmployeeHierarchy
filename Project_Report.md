# Project Report: Employee Hierarchy System

## 1. Introduction
The Employee Hierarchy System is a Java-based application designed to model different roles within a company using Object-Oriented Programming (OOP). Instead of maintaining separate, disconnected classes for different types of employees, this project utilizes a hierarchical structure to promote code reuse and logical organization.

## 2. Objectives
- To understand and practically apply the OOP concept of **Inheritance**.
- To demonstrate **Method Overriding** for specialized behaviors.
- To reduce code duplication by centralizing common properties and methods in a parent class.

## 3. Technology Stack
- **Language:** Java (JDK)
- **Concepts Used:** Inheritance, Polymorphism (Method Overriding), Encapsulation
- **Version Control:** Git & GitHub

## 4. System Architecture
The application architecture is built upon a parent-child class structure:

1. **Base Class (`Employee.java`)**: 
   - Acts as the parent class for all employee types.
   - Contains common attributes: `id`, `name`, and `baseSalary`.
   - Contains common methods: `calculateSalary()` and `displayDetails()`.

2. **Derived Classes**:
   - **`Developer.java`**: Extends `Employee`. Introduces a `programmingLanguage` attribute and a `writeCode()` method.
   - **`Manager.java`**: Extends `Employee`. Introduces a `bonus` attribute. It overrides `calculateSalary()` to include the bonus and adds a `conductMeeting()` method.
   - **`Intern.java`**: Extends `Employee`. Introduces a `university` attribute and a `learn()` method.

3. **Driver Class (`Main.java`)**:
   - Contains the `main` method to instantiate objects of the derived classes and test their inherited and specialized behaviors.

## 5. Object-Oriented Concepts Implemented
### 5.1 Inheritance (The `extends` Keyword)
Inheritance allows the `Developer`, `Manager`, and `Intern` classes to inherit the fields and methods of the `Employee` class. This means we do not have to rewrite the `id`, `name`, and `baseSalary` logic in every single class, strictly adhering to the DRY (Don't Repeat Yourself) principle.

### 5.2 Method Overriding
The `Manager` class provides a specific implementation for the `calculateSalary()` method that differs from its parent `Employee` class. By overriding this method, the system dynamically calculates the Manager's total salary by adding their specific bonus to the inherited base salary. All child classes also override `displayDetails()` to print their specific properties alongside the base properties.

### 5.3 Constructor Chaining (`super` keyword)
When instantiating a child object (e.g., `new Developer(...)`), the child constructor uses the `super()` keyword to call the parent class's constructor. This ensures that the base properties (`id`, `name`, `baseSalary`) are properly initialized before the child-specific properties are set.

## 6. Output & Verification
When the `Main` class is executed, the application successfully generates the following outputs:
- **Developer details:** Displays base details plus the programming language, followed by a message indicating the developer is writing code.
- **Manager details:** Displays base details plus the calculated total salary (base + bonus), followed by a message indicating the manager is conducting a meeting.
- **Intern details:** Displays base details plus the university name, followed by a message indicating the intern is learning.

## 7. Conclusion
The Employee Hierarchy System successfully demonstrates how Inheritance simplifies the modeling of real-world relationships in software. By categorizing employees into a hierarchy, the codebase becomes significantly cleaner, more modular, and easier to extend. Adding new employee types (like `Designer` or `HR`) in the future would require minimal effort, proving the scalability of this OOP design pattern.
