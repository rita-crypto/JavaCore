package polymorphism.question4;

public class Main {
    public static void main(String[] args) {
        Shape t = new Triangle(3,4,5);
        Shape c = new Circle(2);
        Shape r = new Rectangle(20,10);

        System.out.println("The area of the triangle is: "+t.getArea());
        System.out.println("The perimeter of the triangle is: "+t.getPerimeter());

        System.out.println("The area of the circle is: "+c.getArea());
        System.out.println("The perimeter of the circle is: "+c.getPerimeter());

        System.out.println("The area of the rectangle is: "+r.getArea());
        System.out.println("The perimeter of the rectangle is: "+r.getPerimeter());
    }

}