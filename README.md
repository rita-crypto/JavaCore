Write a Java program to create an abstract class Animal with an abstract method called sound(). Create subclasses Lion and Tiger that extend the Animal class and implement the sound() method to make a specific sound for each animal.

Keytakeways:
1) Abstract method cannot have body.
    public abstract void sound();
2) Cannot create an object of abstract class.
3) If you need sub class specific functionality, use sublcass reference.
    Lion lion = new Lion();
4) If you need polymorphism and flexibility, use superclass reference.
    Animal animal - new Lion();
