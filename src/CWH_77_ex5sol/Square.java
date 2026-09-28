package CWH_77_ex5sol;

public class Square extends Shape {

    Square(int side) {
        super(side, -1);
    }

    public int area() {
        return this.dim1 * this.dim1;
    }
}