package Program01;

public class Triangle extends GeometricObject{
    private double side1,side2,side3;
    final private double SEMIPERIMETER = (side1+side2+side3)/2;
    Triangle(){
    }
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
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
        return super.toString()+"Triangle [side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + "]";
    }
    
}
