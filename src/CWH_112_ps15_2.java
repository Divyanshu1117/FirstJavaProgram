/**
 * This class demonstrates a simple Hello World program.
 *
 * @author Divyanshu
 * @version 1.0
 */
class MyDeprecated {
    @Deprecated
    void meth1() {
        System.out.println("I am method 1");
    }
}

public class CWH_112_ps15_2 {
    /**
     * The main method starts the execution of the program.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello World!..");
        MyDeprecated obj = new MyDeprecated();
        obj.meth1();
    }
}