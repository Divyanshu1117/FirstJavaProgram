import java.util.Scanner;

public class J019_ps4_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Website Name:- ");
        String website = sc.next();
        if (website.endsWith(".org")) {
            System.out.println("This Is An Commercial Website.");
        } else if (website.endsWith(".com")) {
            System.out.println("This Is An Organization Website.");
        } else if (website.endsWith(".in")) {
            System.out.println("This Is An Indian Website.");
        }
    }
}