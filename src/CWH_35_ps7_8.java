public class CWH_35_ps7_8 {
    static void pattern1_rec(int n) {
        if (n > 0) {
            pattern1_rec(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();

//     pattern1_rec(3):-
//     pattern_rec(2) + 3 times star and new line:-
//     pattern_rec(1) + 2 times star and new line + 3 times start and new line:-
//     pattern_rec(0) + 1 times star and new line + 2 times start and new line + 3 times start and new line:-
        }
    }

    public static void main(String[] args) {
        pattern1_rec(4);
    }
}