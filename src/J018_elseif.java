import java.util.Scanner;

public class J018_elseif {
    public static void main(String[] args) {

//        int age;
//        System.out.print("Enter Your Age:- ");
//        Scanner sc = new Scanner(System.in);
//        age = sc.nextInt();
//        if (age > 56) {
//            System.out.println("You Are Experienced!");
//        } else if (age > 46) {
//            System.out.println("You Are Semi-Experienced!");
//        } else if (age > 36) {
//            System.out.println("You Are Semi-Semi-Experienced!");
//        } else {
//            System.out.println("You Are Not Experienced!");
//        }

        String var = "Lovish";
        switch (var) {
            case "Shubham":
                System.out.println("You are going to become an Adult!");
                break;
            case "Lovish":
                System.out.println("You are going to join a job!");
                break;
            case "Divyanshu":
                System.out.println("You are going to get retired!");
                break;
            default:
                System.out.println("Enjoy your life!");
        }
        System.out.println("Thanks for using my Java Code!");
    }
}