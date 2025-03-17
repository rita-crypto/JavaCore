package encapsulation.question2;

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
