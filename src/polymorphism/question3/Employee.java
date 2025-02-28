package polymorphism.question3;
//Write a Java program to create a class Employee with a method called calculateSalary(). Create two subclasses Manager and Programmer.
// In each subclass, override the calculateSalary() method to calculate and return the salary based on their specific roles.
abstract class Employee {
    protected int salary;

    public abstract int calculateSalary();
}
