package polymorphism.question3;

public class Manager extends Employee{
    public Manager(){
        this.salary = 10000;
    }
    @Override
    public int calculateSalary(){
        return salary;
    }
}
