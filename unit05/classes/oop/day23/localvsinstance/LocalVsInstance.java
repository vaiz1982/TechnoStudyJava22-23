package unit05.classes.oop.day23.localvsinstance;

public class LocalVsInstance {
    public int instanceVariable;

    public LocalVsInstance(int instanceVariable) {
        this.instanceVariable = instanceVariable;
    }

    public void printInfo(){
        int localVariable;
        int instanceVariable;/*this is local variable different than
        the instance variable*/
        System.out.println(this.instanceVariable); /*this keyword
        will help you to refer the instance variables*/
    }

    public void printInfo2(){
        int localVariable2 = 0;
        System.out.println(localVariable2);
        int localVariable=0;
        System.out.println(localVariable);
        System.out.println(instanceVariable);
    }

}
