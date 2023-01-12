package unit09.inheritance.day37.methodWithPolymorphicVariables;

public class MessageMain {
    public static void main(String[] args) {
        Message message1 = new Message();
        sendMessage(message1);
        Message message2 = new TextMessage();
        sendMessage(message2);
        VideoMessage videoMessage = new VideoMessage();
        sendMessage(videoMessage);
        sendMessage(new JSONMessage());
    }

    public static void sendMessage(Message message){
        System.out.println("Sending a " + message.getClass().getSimpleName());
    }
}
