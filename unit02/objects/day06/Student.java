package unit02.objects.day06;

public class Student {
    private String name;
    private double gpa;

    public Student(String theName, double theGpa){
        name = theName;
        gpa = theGpa;
        System.out.println("Message from the Constructor");
        System.out.print("A student is created with the name ");
        System.out.println(name);
        System.out.print("The gpa is: ");
        System.out.println(gpa);
    }

    public static void main(String[] args) {
        System.out.println("Main is started");
        Student student1 = new Student("John", 3.5);
        System.out.println("Main will be finalized.");
    }
}
