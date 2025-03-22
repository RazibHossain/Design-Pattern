package models;

import interfaces.Notification;

public class PushNotification implements Notification {
    @Override
    public void sendNotification(String msg) {
        System.out.println("Notification send by: "+msg);
    }
}
