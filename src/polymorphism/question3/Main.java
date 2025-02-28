package polymorphism.question3;

public class Main {
    public static void main(String[] args) {
        Employee m = new Manager();
        Employee p = new Programmer();

        System.out.println("Manager Salary: "+m.calculateSalary());
        System.out.println("Programmer Salary: "+p.calculateSalary());
    }
}
