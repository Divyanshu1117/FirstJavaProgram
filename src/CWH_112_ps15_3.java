/**
 * This class demonstrates a simple Hello World program.
 *
 * @author Divyanshu
 * @version 1.0
 */
class My_Deprecated {
    @Deprecated
    void meth1() {
        System.out.println("I am method 1");
    }
}

public class CWH_112_ps15_3 {
    /**
     * The main method starts the execution of the program.
     *
     * @param args command-line arguments
     */
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        System.out.println("Hello World!..");
        My_Deprecated obj = new My_Deprecated();
        obj.meth1();
    }
}