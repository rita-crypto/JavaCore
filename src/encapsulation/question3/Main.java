package encapsulation.question3;
//. Write a Java program to create a class called “Book” with private instance variables title, author, and price.
// Provide public getter and setter methods to access and modify these variables.
// Add a method called applyDiscount() that takes a percentage as a parameter and reduces the price by that percentage.
public class Main {
    public static void main(String[] args) {
        Book b = new Book();
        b.setTitle("Alchemist");
        b.setAuthor("Paulo Coelho");
        b.setPrice(10);
        b.applyDiscount(15);

        System.out.println("Book title: "+b.getTitle());
        System.out.println("Book author: "+b.getAuthor());
        System.out.println("Book price: "+b.getPrice());
    }
}
