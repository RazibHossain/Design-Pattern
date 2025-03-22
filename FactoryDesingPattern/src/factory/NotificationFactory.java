package factory;

import interfaces.Notification;
import models.EmailNotificaiton;
import models.PushNotification;
import models.SmsNotification;

public class NotificationFactory {

    public Notification getNotification(String notiType){
        if(notiType==null){
            return null;
        }
        if(notiType.equals("sms")){
            return new SmsNotification();
        }else if(notiType.equals("push")){
            return new PushNotification();
        }else if(notiType.equals("email")){
            return new EmailNotificaiton();
        }else {
            return null;
        }
    }

}
