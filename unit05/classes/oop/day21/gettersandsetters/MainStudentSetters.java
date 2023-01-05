package unit05.classes.oop.day21.gettersandsetters;

public class MainStudentSetters {
    public static void main(String[] args) {
        Student student1 = new Student("id1","Jack", 3.6);
        Student student2 = new Student("id2","Jackie", 3.7);
        Student student3 = new Student("id3","Jackson", 3.8);
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        student1.setGpa(4.0);
        student3.setName("John Doe");
        student2.setId("id13");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
    }
}
