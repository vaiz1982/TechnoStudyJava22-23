package unit09.inheritance.day35.constructorReview;

public class Textbook extends Book{
    private String subject;

    public Textbook(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
