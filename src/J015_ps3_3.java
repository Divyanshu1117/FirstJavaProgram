public class J015_ps3_3 {
    public static void main(String[] args) {
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>", "Divyanshu");
        System.out.println(letter);
    }
}