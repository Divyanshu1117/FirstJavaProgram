class CellPhone {
    public void ring() {
        System.out.println("Ringning...");
    }

    public void vibrate() {
        System.out.println("Vibrating...");
    }

    public void callFriend() {
        System.out.println("Calling Lovish...");
    }
}

public class CWH_39_ps8_2 {
    public static void main(String[] args) {
        CellPhone motog31 = new CellPhone();
        motog31.callFriend();
        motog31.vibrate();
        motog31.ring();
    }
}