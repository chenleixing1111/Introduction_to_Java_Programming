package chapter13;

import java.util.ArrayList;
public class Test {
    public static void main(String[] args){
        GeometricObject x = new Circle(3);
        GeometricObject y = (GeometricObject) x.clone();
    }
}