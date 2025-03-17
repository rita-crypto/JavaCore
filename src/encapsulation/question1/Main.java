package encapsulation.question1;

//1. Write a Java program to create a class called Person with private instance variables name, age. and country.
// Provide public getter and setter methods to access and modify these variables.

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Suzie");
        p.setAge(12);
        p.setCountry("Canada");
        System.out.println("Name: "+p.getName());
        System.out.println("Age: "+p.getAge());
        System.out.println("Country: "+p.getCountry());
    }
}
