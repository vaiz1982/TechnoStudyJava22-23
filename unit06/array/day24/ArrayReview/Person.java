package unit06.array.day24.ArrayReview;

public class Person {
    /*
    * String Array for friends
    * String name
    * constructors
    * getters
    * setters
    * and a main method in a different class
    * */
    private String[] friends;
    private String name;

    public Person(String[] friends, String name) {
        this.friends = friends;
        this.name = name;
    }

    public String[] getFriends() {
        return friends;
    }

    public void setFriends(String[] friends) {
        this.friends = friends;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
