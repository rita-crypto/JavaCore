package abstraction.question1;

public class Main {
    public static void main(String[] args) {
        Lion lion = new Lion();
        Tiger tiger = new Tiger();
        Animal animal = new Lion(); //cannot create an object of Animal class directly because it is an abstract
//        lion.sound();
        animal.sound();
        tiger.sound();
    }
}

//    If you need subclass-specific functionality
//    → Use subclass reference (Lion lion = new Lion();).

//    If you need polymorphism and flexibility
//    → Use superclass reference (Animal animal = new Lion();).
