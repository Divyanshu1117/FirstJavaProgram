class Rectangle {
    int length;
    int breadth;

    public int area() {
        return length * breadth;
    }

    public int perimeter() {
        return 2 * (length + breadth);
    }
}

public class CWH_39_ps8_4 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.length = 5;
        rect.breadth = 3;
        System.out.println(rect.area());
        System.out.println(rect.perimeter());
    }
}