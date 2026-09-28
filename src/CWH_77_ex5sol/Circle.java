package CWH_77_ex5sol;

public class Circle extends Shape {

    Circle(int radius) {
        super(radius, -1);
    }

    public double area() {
        return Math.PI * this.dim1 * this.dim1;
    }
}