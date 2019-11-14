public class ObserverPatternDemo {
    public static void main(String[] args) {

        Subject subject = new Subject(1);
        Observer observer = new BinaryObserver(subject);
        subject.setState(2);
        Observer observer1 = new BinaryObserver(subject);
        subject.setState(3);
    }
}