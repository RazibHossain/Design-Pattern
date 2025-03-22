import factory.NotificationFactory;
import interfaces.Notification;

public class Driver {
    public static void main(String[] args) {
        System.out.println("hello");
        String notiType = "Sms";

        NotificationFactory notificationFactory = new NotificationFactory();

        Notification notification = notificationFactory.getNotification("sms");

        notification.sendNotification("SMS");
    }
}
