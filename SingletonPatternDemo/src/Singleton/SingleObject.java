package Singleton;

public class SingleObject {

    private static SingleObject instance = null;

    private SingleObject() {
    }

    public static SingleObject getSingleObject() {
        if (SingleObject.instance != null) {
            System.out.println("This is a single object");
            return null;
        }
        System.out.println("Single Object created");
        return SingleObject.instance = new SingleObject();
    }

    public void showMessage() {
        System.out.println("This is a Singleton Design Pattern Demo!");
    }
}
