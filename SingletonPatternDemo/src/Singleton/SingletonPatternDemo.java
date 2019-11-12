package Singleton;

public class SingletonPatternDemo {
        public static void main(String[] args) {
            SingleObject singletonObject = SingleObject.getSingleObject();
            SingleObject singletonObject1 = SingleObject.getSingleObject();
            singletonObject.showMessage();
            singletonObject1.showMessage();
        }
}
