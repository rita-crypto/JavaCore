package encapsulation.question2;
//Write a Java program to create a class called Employee with private instance variables employee_id, employee_name, and employee_salary.
// Provide public getter and setter methods to access and modify the id and name variables, but provide a getter method for the salary variable that returns a formatted string.
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setEmployeeName("Nora");
        employee.setEmployeeId("12");
        employee.setEmployeeSalary(2000);

        System.out.println("Employee name: "+employee.getEmployeeName());
        System.out.println("Employee id: "+employee.getEmployeeId());
        System.out.println("Employee salary: "+employee.getSalaryFormatted());
    }
}
