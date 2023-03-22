package decorator;

import notifier.Notifier;

public class Facebook extends NotifierDecorator {

    public Facebook(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending message by Facebook ---> "+message);
        notifier.sendMessage(message);
    }
}
