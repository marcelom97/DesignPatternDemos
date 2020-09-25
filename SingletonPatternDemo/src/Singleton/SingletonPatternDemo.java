package Singleton;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        SingleObject singletonObject = SingleObject.getInstance();
        SingleObject singletonObject1 = SingleObject.getInstance();
        singletonObject.showMessage();
        singletonObject1.showMessage();
    }
}
