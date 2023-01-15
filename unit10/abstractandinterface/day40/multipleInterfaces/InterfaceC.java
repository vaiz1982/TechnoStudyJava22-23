package unit10.abstractandinterface.day40.multipleInterfaces;

public interface InterfaceC {
    void methodC();
    default void methodAnotherC(){
        System.out.println("New Default Method");
    }
}
