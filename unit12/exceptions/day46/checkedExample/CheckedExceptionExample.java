package unit12.exceptions.day46.checkedExample;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionExample {
    public static void main(String[] args)  {


        try {
            FileReader fileReader = new FileReader("filename.txt");
        } catch (FileNotFoundException e) {
            System.out.println("No such file...");
//            ask the user again to send the correct file...
        }


        System.out.println("After try...catch");
    }
}
