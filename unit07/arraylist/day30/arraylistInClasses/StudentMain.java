package unit07.arraylist.day30.arraylistInClasses;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("John Doe", 8);
        student1.addMathGrade(95);
        student1.addMathGrade(100);
        student1.addMathGrade(87);
        student1.addMathGrade(100);
        student1.addMathGrade(64);
        student1.addMathGrade(55);
        System.out.println(student1.getMathGrades());
        System.out.println("The average grade is : " + student1.calculateAverageMathGrade());

        student1.removeLessThanSeventy();
        System.out.println("After less than 70 removed: " + student1.getMathGrades());
        System.out.println("The updated average grade is : " + student1.calculateAverageMathGrade());
    }
}
