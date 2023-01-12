package unit10.abstractandinterface.day39.abstractclassesPractice;
/*
* Shape class
Instance variables
xCoordinate
yCoordinate
Instance method non-abstract
void moveTo(int newXCoordinate, int newYCoordinate)
abstract methods
double getArea()
void draw()*/
public abstract class Shape {
    private int xCoordinate;
    private int yCoordinate;

    /*Abstract Methods*/
    public abstract double getArea();


    /*NonAbstract Methods*/
    public void moveTo(int newXCoordinate, int newYCoordinate){
        this.xCoordinate = newXCoordinate;
        this.yCoordinate = newYCoordinate;
    }

    public void draw(){
        System.out.println("The " + this.getClass().getSimpleName() +
                " is drawn at the coordinates of (" +
                getxCoordinate() + ", " + getyCoordinate() +
                ") with the area of " + getArea());
    }

    /*Constructor and Getters*/
    public Shape(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public int getxCoordinate() {
        return xCoordinate;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }
}
