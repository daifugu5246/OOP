package Program01;
import java.util.Date;

public abstract class GeometricObject implements Comparable<GeometricObject> {
    private String color;
    private boolean filled;
    Date dateCreated;

    protected GeometricObject() {
        dateCreated = new Date();
    }

    protected GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.dateCreated = new Date();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public int compareTo(GeometricObject o) {
        if (o.getArea() < getArea()) {
            return 1;
        } else if (o.getArea() > getArea()) {
            return -1;
        } else {
            return 0;
        }
    }
    public static GeometricObject max(GeometricObject o1,GeometricObject o2){
            if(o1.compareTo(o2) == 1){
                return o1;
            }
            else if(o1.compareTo(o2) == -1){
                return o2;
            }
            else{
                return o1;
            }
    }
    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "GeometricObject [color=" + color + ", dateCreated=" + dateCreated + ", filled=" + filled + "]";
    }
}