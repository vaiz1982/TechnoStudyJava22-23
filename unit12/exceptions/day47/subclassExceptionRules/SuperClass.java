package unit12.exceptions.day47.subclassExceptionRules;

import java.io.FileNotFoundException;

public class SuperClass {
    public void method() throws Exception{
        /** Business logic goes here*/
    }

    public void anotherMethod() throws FileNotFoundException{
        /** Business logic goes here*/
    }
}

class SubClass extends SuperClass{

    /** no exception throw is needed (note from aslanbek needed!)*/
    /*public void method(){
    }*/

    /** you can throw the same level of exception with the superclass*/
    /*public void method() throws Exception {
    }*/

    /** you can throw the sub class level of exception with the superclass*/
    /*public void method() throws NullPointerException {
    }*/

    /** you can't throw the super class level of exception with the superclass*/
    /*public void anotherMethod() throws Exception {

    }*/
}
