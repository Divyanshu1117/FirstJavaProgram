class Circle {
    int radius;

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

public class CWH_39_ps8_6 {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.radius = 3;
        System.out.println(c.area());
        System.out.println(c.perimeter());
    }
}