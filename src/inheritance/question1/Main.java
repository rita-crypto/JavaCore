package inheritance.question1;
//Write a Java program to create a class called Animal with a method called makeSound().
// Create a subclass called Cat that overrides the makeSound() method to bark.
public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        Cat c = new Cat();
        a.makeSound();
        c.makeSound();
    }
}
