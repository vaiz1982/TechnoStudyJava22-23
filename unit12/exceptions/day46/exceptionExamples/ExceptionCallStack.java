package unit12.exceptions.day46.exceptionExamples;

public class ExceptionCallStack {
    public static void main(String[] args) {

        dividerCaller();

        System.out.println("---After the Exception---");
    }

    public static void divider(){
        System.out.println(10/0);
    }

    public static void dividerCaller(){
        divider();
    }
}
