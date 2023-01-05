package unit09.inheritance.day35.constructorReview;

public class Novel extends Book{
    private String genre;


    public Novel(String name, String genre) {
        super(name);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
