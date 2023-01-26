package unit12.exceptions.day47.checkedExceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionWithThrows {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fileReader2 = new FileReader("anotherFile.txt");
    }
}
