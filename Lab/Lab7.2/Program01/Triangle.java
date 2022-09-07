package Program01;

public class Triangle extends GeometricObject{
    private double side1,side2,side3;
    private double SEMIPERIMETER;
    Triangle(){
    }
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        SEMIPERIMETER = (side1+side2+side3)/2;
    }
    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        SEMIPERIMETER = (side1+side2+side3)/2;
    }
    
    public double getSide1() {
        return side1;
    }
    public double getSide2() {
        return side2;
    }
    public double getSide3() {
        return side3;
    }
    @Override
    public double getArea(){
        return Math.sqrt(SEMIPERIMETER*(SEMIPERIMETER-side1)*(SEMIPERIMETER-side2)*(SEMIPERIMETER-side3));
    }
    @Override
    public double getPerimeter(){
        return side1+side2+side3;
    }
    @Override
    public String toString() {
        return "Triangle\n"  + "Side1 : " + side1 + "\n" + "Side2 : " + side2 + "\n" + "Side3 : " + side3 + "\n"+ "Area : " + getArea() + "\n" + "Perimeter : " + getPerimeter() + "\n";
    }
    
}
