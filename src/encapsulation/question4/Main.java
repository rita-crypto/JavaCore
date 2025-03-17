package encapsulation.question4;
//Write a Java program to create a class called Desktop with private instance variables brand, processor, and ramSize.
// Provide public getter and setter methods to access and modify these variables.
// Add a method called upgradeRam() that takes an integer value and increases the ramSize by that value.
public class Main {
    public static void main(String[] args) {
        Desktop d = new Desktop();
        d.setBrand("Dell");
        d.setProcessor("i5");
        d.setRamSize(8);
        d.upgradeRam(5);
        System.out.println("Desktop brand is: "+d.getBrand());
        System.out.println("Desktop Processor is: "+d.getProcessor());
        System.out.println("Desktop ram size is: "+d.getRamSize());
    }
}
