package Test;

import SNU.Triangle;
import SNU.Triangle.IllegalTriangleException;

public class TriangleTest {

    public static void main(String[] args) {

        Triangle t1;
        try {
            t1 = new Triangle(1, 1, 2000);
        } catch (IllegalTriangleException e) {
            e.printStackTrace();
        }

    }

}