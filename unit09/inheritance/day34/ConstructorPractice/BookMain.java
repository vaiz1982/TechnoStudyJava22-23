package unit09.inheritance.day34.ConstructorPractice;

public class BookMain {
    public static void main(String[] args) {
        Novel novel = new Novel("Les Miserables", "Drama");
        TextBook textBook = new TextBook("Java", "Programming languages");
        System.out.println(novel.getName() + " is " + novel.getGenre());
    }
}
