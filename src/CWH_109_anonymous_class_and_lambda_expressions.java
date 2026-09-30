@FunctionalInterface
interface DemoAno {
    //    void meth1();
    void meth1(int a);

//    void meth2();
}

//class DivyanshuFunc implements DemoAno {
//    @Override
//    public void meth1() {
//        System.out.println("Divyanshu Func");
//    }
//}

//class AnnonyDemo implements DemoAno {
//    public void display() {
//        System.out.println("Hello");
//    }
//
//    @Override
//    public void meth1() {
//        System.out.println("I am meth1");
//    }
//
//    @Override
//    public void meth2() {
//        System.out.println("I am meth2");
//    }
//}

public class CWH_109_anonymous_class_and_lambda_expressions {
    public static void main(String[] args) {

//        DemoAno obj = new AnnonyDemo();
//        obj.meth1();

//        Anonymous Class:-
//        DemoAno obj = new DemoAno() {
//            @Override
//            public void meth1() {
//                System.out.println("I am meth1");
//            }
//
//            @Override
//            public void meth2() {
//                System.out.println("I am meth2");
//            }
//        };
//        obj.meth1();

//        Lambda Expression:-
//        DemoAno obj = new DivyanshuFunc();
//        obj.meth1();

        DemoAno obj = (a) -> {
            System.out.println("I am method 1 from this lambda expression " + a);
        };
        obj.meth1(6);
    }
}