package polymorphism.question4;

public class Triangle extends Shape{
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getArea(){
        double s = (sideA+sideB+sideC)/2;
        double area = Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));
        return area;
    }
@Override
    public double getPerimeter(){
        double perimeter = sideA+sideB+sideC;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                '}';
    }
}
