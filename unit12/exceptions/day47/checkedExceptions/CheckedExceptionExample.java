package unit12.exceptions.day47.checkedExceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionExample {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("noFile.jpg");
        } catch (FileNotFoundException e) {
            System.out.println("The checked exception is handled...");
        }


    }
}
