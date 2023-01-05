package unit09.inheritance.day35.constructorReview;

import unit09.inheritance.day34.ConstructorPractice.TextBook;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("Cracking the SDET Interview");
        TextBook textBook = new TextBook("OOP with JAVA", "Computer Science");
        Novel novel = new Novel("Harry Potter", "Fantastic");

        System.out.println(novel.getName() + " is written in " + novel.getGenre() + " genre.");
    }
}
