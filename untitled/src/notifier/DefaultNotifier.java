package notifier;


//Email Notifier is our default notifier
public class DefaultNotifier implements Notifier{

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending message by Email ---> "+message);
    }
}
