package polymorphism.question2;

public class Bicycle extends Vehicle {
    public void speedUp(){
        speed += 10;
        System.out.println("Bicycle speed: "+speed);
    }
}
