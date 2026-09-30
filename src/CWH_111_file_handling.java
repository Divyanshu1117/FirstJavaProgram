import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CWH_111_file_handling {
    public static void main(String[] args) {
//        Code to create a new file:-
//        File myFile = new File("CWH_111_file_handling.txt");
//        try {
//            myFile.createNewFile();
//        } catch (IOException e) {
//            System.out.println("Unable to create file");
//            e.printStackTrace();
//        }

//        Code to write to a file:-
//        try {
//            FileWriter fileWriter = new FileWriter("CWH_111_file_handling.txt");
//            fileWriter.write("Hello my name is Divyanshu. \nOK Bye!...");
//            fileWriter.close();
//        } catch (IOException e) {
//            e.fillInStackTrace();
//        }

//        Reading a file:-
//        File myFile = new File("CWH_111_file_handling.txt");
//        try {
//            Scanner sc = new Scanner(myFile);
//            while (sc.hasNextLine()) {
//                String line = sc.nextLine();
//                System.out.println(line);
//            }
//            sc.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

//        Deleting a file:-
        File myFile = new File("CWH_111_file_handling.txt");
        if (myFile.delete()) {
            System.out.println("I have deleted: " + myFile.getName());
        } else {
            System.out.println("Some problem occurred while deleting a file.");
        }
    }
}