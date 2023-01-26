package unit12.exceptions.day47.checkedExceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionInADifferentMethod {
    public static void main(String[] args) {
        try {
            openAFile();
        } catch (FileNotFoundException e) {
            System.out.println("The exception is caught.");
        }
    }

    public static void openAFile() throws FileNotFoundException {
        FileReader fileReader = new FileReader("aRandomFile.txt");
    }
}
