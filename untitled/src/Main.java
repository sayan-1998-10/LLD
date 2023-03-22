import decorator.Facebook;
import decorator.SMS;
import decorator.Slack;
import notifier.DefaultNotifier;
import notifier.Notifier;

public class Main {
    public static void main(String[] args) {

        Notifier notifier = new Facebook(new Slack(new SMS(new DefaultNotifier())));
        notifier.sendMessage("check");
        
        
    }
}