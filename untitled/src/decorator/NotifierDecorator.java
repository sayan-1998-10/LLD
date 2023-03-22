package decorator;

import notifier.Notifier;

public abstract class NotifierDecorator implements Notifier {
    Notifier notifier;

    public NotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void sendMessage(String message) {}
}
