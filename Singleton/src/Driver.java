import models.MySingletonClass;

public class Driver {

    public static void main(String [] args){

        System.out.println("hellos");

        MySingletonClass obj =  MySingletonClass.getInstance();
        MySingletonClass obj2 =  MySingletonClass.getInstance();

        obj.doSomething();
    }
}
