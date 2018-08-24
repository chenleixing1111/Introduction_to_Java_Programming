package chapter13;

public class TestGeometricObject {
    public static void main(String[] args){
        GeometricObject geo1 = new Circle(5);
        GeometricObject geo2 = new Rectangle(5, 3);

        System.out.println("The two objects have the same area? " + equalArea(geo1, geo2));

        displayGeometricObject(geo1);
        displayGeometricObject(geo2);

    }

    public static boolean equalArea(GeometricObject g1, GeometricObject g2){
        if(g1.getArea() == g2.getArea()){
            return true;
        }
        return false;
    }

    public static void displayGeometricObject(GeometricObject g){
        System.out.println();
        System.out.println("The area is " + g.getArea());
        System.out.println("The perimeter is " + g.getPerimeter());
    }
}
