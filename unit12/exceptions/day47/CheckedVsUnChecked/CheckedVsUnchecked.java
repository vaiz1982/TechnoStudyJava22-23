package unit12.exceptions.day47.CheckedVsUnChecked;

import java.io.FileNotFoundException;

public class CheckedVsUnchecked {
    public static void main(String[] args) {
        /** unchecked exceptions don't have to be handled*/
        divide();

        /** checked ones have to be handled
         * catch or specify requirement...*/
        try {
            openFile();
        } catch (FileNotFoundException e) {
            System.out.println("The checked exception is caught...");
        }
    }

    public static void divide() throws RuntimeException{
        System.out.println(" I might throw an unchecked exception");
    }

    public static void openFile() throws FileNotFoundException {
        System.out.println("I might throw a checked exception");
    }
}
