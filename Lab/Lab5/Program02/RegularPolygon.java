package Program02;

public class RegularPolygon {
    private int n ;
    private double side ;
    private double x;
    private double y;

    public RegularPolygon(){
        this(3, 1);//reuse the second constructor
    }
    public RegularPolygon(int n , double side){
        this.n = n;
        this.side = side;
    }
    public RegularPolygon(int n , double side ,double x,double y){
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }
    public int getN() {
        return n;
    }
    public double getSide() {
        return side;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void setN(int n) {
        this.n = n;
    }
    public void setSide(double side) {
        this.side = side;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double getPerimeter(){
        double perimeter = n*side;
        return perimeter;
    }
    public double getArea(){
        double area = (n*Math.pow(side, 2)/(4*Math.tan(Math.PI/n)));
        return area;
    }
    public void display(){
        System.out.println("Number of side : " + getN());
        System.out.println("Side lenght : " + getSide());
        System.out.println("X-Coordinate : " + getX());
        System.out.println("Y-Coordinate : " + getY());
        System.out.println("Perimeter : "+ getPerimeter());
        System.out.println("Area : "+ getArea());
    }
}
