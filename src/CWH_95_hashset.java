import java.util.HashSet;

public class CWH_95_hashset {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<Integer>(6, 0.5f);
        hs.add(6);
        hs.add(8);
        hs.add(3);
        hs.add(11);
        hs.add(11);
        System.out.println(hs);
    }
}