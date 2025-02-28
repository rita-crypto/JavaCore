package polymorphism.question3;

public class Programmer extends Employee{
    public Programmer(){
        this.salary = 50000;
    }
    @Override
        public int calculateSalary(){
            return salary;
        }
}
