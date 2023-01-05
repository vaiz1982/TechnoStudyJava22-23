package unit03.conditionals.day11;

public class BooleanExpressions {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        boolean result;
        result = a > b;
        System.out.println("the result is " + result);
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a < b);

        boolean isNovember = true;

        System.out.println(isNovember == true);
        System.out.println(isNovember != true);

        System.out.println(!isNovember);
    }
}
