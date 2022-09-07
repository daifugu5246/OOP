package Program02;

public class Main {
    public static void main(String[] args) {
        RegularPolygon polygon1 = new RegularPolygon();
        RegularPolygon polygon2 = new RegularPolygon(6,4);
        RegularPolygon polygon3 = new RegularPolygon(10,4,5.6,7.8); 
        System.out.println("---Polygon1---");
        polygon1.display();
        System.out.println("---Polygon2---");
        polygon2.display();
        System.out.println("---Polygon3---");
        polygon3.display();
    }
}
