package unit05.classes.oop.day21.gettersandsetters;

public class Student {
    private String id;
    private String name;
    private double gpa;
    /*Write three setter methods for the instance variables
    * use them in main class*/

    public Student(String id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public void setGpa(double gpa){
        this.gpa = gpa;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getGpa(){
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
