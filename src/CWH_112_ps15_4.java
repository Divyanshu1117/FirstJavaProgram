interface MyInt {
    void display();
}

public class CWH_112_ps15_4 {
    public static void main(String[] args) {
//        myInt i = new myInt() {
//            @Override
//            public void display() {
//                System.out.println("I am display");
//            }
//        };
//        i.display();

        MyInt i = () -> System.out.println("I am display.");
        i.display();
    }
}