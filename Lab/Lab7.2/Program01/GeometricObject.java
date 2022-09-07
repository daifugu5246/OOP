package Program01;

import java.util.Date;

public class GeometricObject {
    private String color;
    private boolean filled;
    Date dateCreated;

    GeometricObject(){
        dateCreated = new Date();
    }
    GeometricObject(String color , boolean filled ){
        this.color = color;
        this.filled = filled;
        this.dateCreated = new Date();
    }
    public String getColor() {
        return color;
    }
    public boolean isFilled() {
        return filled;
    }
    public Date getDateCreated() {
        return dateCreated;
    }
    public double getArea(){
        return 0;
    }
    public double getPerimeter(){
        return 0;
    }
    public static void displayObject(Object o){
        if(o instanceof Triangle){
            Triangle triangle = (Triangle)o;
            System.out.println("Triangle");
            System.out.println("Each side : " + triangle.getSide1() + " "+ triangle.getSide2() + " "+ triangle.getSide3() + " " );
            System.out.println("Area : " + triangle.getArea());
            System.out.println("Perimeter : " + triangle.getPerimeter());
        }
        else if(o instanceof Rectangle){
            Rectangle rectangle = (Rectangle)o;
            System.out.println("Rectangle");
            System.out.println("Width : " + rectangle.getWidth());
            System.out.println("Height : " + rectangle.getHeight());
            System.out.println("Area : " + rectangle.getArea());
            System.out.println("Perimeter : " + rectangle.getPerimeter());
        }
        else if(o instanceof Circle){
           Circle circle = (Circle)o;
           System.out.println("Circle");
           System.out.println("Area : " + circle.getArea());
           System.out.println("Perimeter : " + circle.getPerimeter());
        }
    }
    @Override
    public String toString() {
        return "GeometricObject\n" + "Color : " + getColor() + "\n" + "Perimeter : " + isFilled() + "\n";
    }
}
    
    

