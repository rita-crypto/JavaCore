package polymorphism.question2;

public class Car extends Vehicle {
    public void speedUp(){
        speed += 20;
        System.out.println("Car speed: "+speed);
    }
}
