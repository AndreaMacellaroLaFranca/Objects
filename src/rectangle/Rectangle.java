package rectangle;

public class Rectangle {

    public static int height;
    public static int base;

    //NEW CONSTRUCTOR
    public Rectangle(int height, int base){
        this.height = height;
        this.base = base;
    }

    //METHODS
    public int calculateArea(int base, int height){
        int area = base*height;
        return area;
    }

    public int calculatePerimeter(int base, int height){
        int perimeter = 2*(base+height);
        return perimeter;
    }

    public String toString(int base, int height){
        return String.format("Il rettangolo con base %d, e con altezza %d, ha un'area di %d, con un perimetro di %d.",height,base,calculateArea(base,height),calculatePerimeter(base,height));
    }

}
