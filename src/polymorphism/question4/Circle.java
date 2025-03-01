package polymorphism.question4;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea(){
        double area = Math.PI*radius*radius;
        return area;
    }
    @Override
    public double getPerimeter(){
        double perimeter = 2*Math.PI*radius;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
