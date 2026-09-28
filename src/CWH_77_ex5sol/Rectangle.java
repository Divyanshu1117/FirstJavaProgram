package CWH_77_ex5sol;

public class Rectangle extends Shape {

    Rectangle(int length, int breadth) {
        super(length, breadth);
    }

    public int area() {
        return this.dim1 * this.dim2;
    }
}