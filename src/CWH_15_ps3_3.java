public class CWH_15_ps3_3 {
    public static void main(String[] args) {
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>", "Harry");
        System.out.println(letter);
    }
}