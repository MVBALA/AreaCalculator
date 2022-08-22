import static java.lang.Math.PI;

public class AreaCalculator {
    public static double area(double radius) {
        if (radius<0)
            return -1;
        else {
            double area;
            return area = radius * radius *PI;
        }
    }
    public static double area(double x,double y) {
        if (x<0||y<0)
            return -1;
        else {
            double area;
            return area = x*y;
        }
    }

}
