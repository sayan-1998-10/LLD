package decorator;

import notifier.Notifier;

public class Slack extends NotifierDecorator{
    public Slack(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending message by Slack ---> "+message);
        notifier.sendMessage(message);
    }
}
