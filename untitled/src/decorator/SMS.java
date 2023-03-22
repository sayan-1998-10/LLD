package decorator;

import notifier.Notifier;

public class SMS extends NotifierDecorator{

    public SMS(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending message by SMS ---> "+message);
        notifier.sendMessage(message);
    }
}
