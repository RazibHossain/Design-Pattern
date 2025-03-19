package models;

public class MySingletonClass {

    private MySingletonClass(){}

//Way 1-   Lazy Initialization
    private static  MySingletonClass INSTANCE ;

//    public static MySingletonClass getInstance(){
////        Lazy Initialization. It may create problem when it is in multithreaded environment
////        for fixing this probelem we need to declare synchronized method getInstance.
//        if(INSTANCE==null){
//            INSTANCE = new MySingletonClass ();
//        }
//        return INSTANCE;
//    }

    public synchronized static MySingletonClass getInstance(){
        if(INSTANCE==null){
            INSTANCE = new MySingletonClass ();
        }
        return INSTANCE;
    }

//    //Way 2-   Eager Initialization

//    private static  MySingletonClass INSTANCE = new MySingletonClass();
//    public  static MySingletonClass getInstance(){
//        return INSTANCE;
//    }

//    Way 3- Bill Pugh Singleton Initialization
//    private static class MySingletonClassHelper{
//        private static  MySingletonClass Instance = new MySingletonClass();
//}
//    public  static MySingletonClass getInstance(){
//        return MySingletonClassHelper.Instance;
//    }


    public static void doSomething(){
        System.out.println("Singleton Class");
    }
}
