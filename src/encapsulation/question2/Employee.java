package encapsulation.question2;

public class Employee {
    private String employeeId;
    private String employeeName;
    private double employeeSalary;

    public void setEmployeeName(String employeeName){
        this.employeeName = employeeName;
    }
    public String getEmployeeName(){
        return employeeName;
    }
    public void setEmployeeId(String employeeId){
        this.employeeId = employeeId;
    }
    public String getEmployeeId(){
        return employeeId;
    }
    public void setEmployeeSalary(int employeeSalary){
        this.employeeSalary = employeeSalary;
    }
    public double getEmployeeSalary(){
        return employeeSalary;
    }
    public String getSalaryFormatted(){
        return String.format("$%.2f", employeeSalary);
    }
}
