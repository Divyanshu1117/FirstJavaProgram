class Tommy {
    public void hit() {
        System.out.println("Hitting the enemy...");
    }

    public void run() {
        System.out.println("Running from the enemy...");
    }

    public void fire() {
        System.out.println("Firing the enemy...");
    }
}

public class CWH_39_ps8_5 {
    public static void main(String[] args) {
        Tommy player1 = new Tommy();
        player1.fire();
        player1.run();
        player1.hit();
    }
}