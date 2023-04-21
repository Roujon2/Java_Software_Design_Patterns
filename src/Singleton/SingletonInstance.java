package Singleton;

public class SingletonInstance {
    // The instance field
    private static final SingletonInstance INSTANCE = new SingletonInstance();

    // Private constructor
    private SingletonInstance(){}

    // Instance getter
    public static SingletonInstance getInstance(){
        // For if the instance is not final and there is a possibility of it being null
        /*if(INSTANCE == null){
            INSTANCE = new Singleton();
        }*/
        return INSTANCE;
    }
}
