package Ex1;

public class Calc {

    public double c(double a, double b, int t) {
        // t: 1 -> area of rectangle, 2 -> area of circle 3 -> area of a triangle
        if (t == 1) {
            return a * b;
        }
        if (t == 2) {
            return 3.14159 * a * a; // a is radius
        }
        if (t == 3) {
            double x = (a * b)/2; // a is the base e b the height
            return x;
        }
        return -1;
    }

    public double c2(double a, double b) {
             return a * b;
    }
}

