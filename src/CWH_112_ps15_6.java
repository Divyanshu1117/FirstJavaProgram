import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CWH_112_ps15_6 {
    public static void main(String[] args) {
        File folder = new File("MultiplicationTables");
        if (!folder.exists()) {
            folder.mkdir();
        }
        for (int i = 2; i <= 9; i++) {
            try {
                FileWriter fileWriter = new FileWriter("MultiplicationTables/Table_" + i + ".txt");
                for (int j = 1; j <= 10; j++) {
                    fileWriter.write(i + " X " + j + " = " + (i * j));
                    if (j < 10) {
                        fileWriter.write("\n");
                    }
                }
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Tables from 2 to 9 saved successfully.");
    }
}