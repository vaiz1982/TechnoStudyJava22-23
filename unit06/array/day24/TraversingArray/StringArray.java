package unit06.array.day24.TraversingArray;

public class StringArray {
    public static void main(String[] args) {
        /*traverse each element and print their length to the screen*/
        String[] animals = {"cat","fish","cow","horse","elephant","giraffe","hamsi"};
        for (int i = 0; i < animals.length; i++) {
            System.out.println("the length of " + animals[i]+ " is "+animals[i].length());
        }

//        Change the first letter of every element to uppercase and update the array
//        print the updated array as well...
        for (int i = 0; i < animals.length; i++) {
            animals[i] = animals[i].substring(0,1).toUpperCase() + animals[i].substring(1);
            System.out.println(animals[i]);
        }


    }
}
