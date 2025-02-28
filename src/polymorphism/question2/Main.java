package polymorphism.question2;

//2. Write a Java program to create a class Vehicle with a method called speedUp().
// Create two subclasses Car and Bicycle.
// Override the speedUp() method in each subclass to increase the vehicle's speed differently.

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        Bicycle b = new Bicycle();
        c.speedUp();
        b.speedUp();
    }
}
