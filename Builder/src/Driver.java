import builders.PhoneBuilder;
import models.Phone;

public class Driver {

    public static void main(String[] args) {
        System.out.println("hellos");

        Phone phone = new PhoneBuilder().setModel("1110").setName("Nokia").build();
        System.out.println(phone);
    }
}
