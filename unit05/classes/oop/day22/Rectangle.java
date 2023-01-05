package unit05.classes.oop.day22;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /*Return the area*/
    public double getArea(){
        double area = width * height;
        return area;
    }

    /*Check if the rectangle is a square*/
    public boolean isSquare(){
        if(width == height){
            return true;
        }else{
            return false;
        }
    }
    /*alternative return
    * return width == height; */

    /*
    calculateArea(double w, double h)
    * */
    public double calculateArea(double w, double h){
        return w * h;
    }

    /*printInfo()
    * sample output
    * height = ?
    * width = ?
    * square: true/false
    * area: ???*/
    public void printInfo(){
        System.out.println("height = " + height);
        System.out.println("width = " + width);
        System.out.println("square: " + isSquare());
        System.out.println("area: " + getArea());
    }
}
