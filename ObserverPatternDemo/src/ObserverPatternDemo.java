public class ObserverPatternDemo {
    public static void main(String[] args) {

        Subject subject = new Subject(1);
        Observer observer = new BinaryObserver(subject);
        subject.setState(2); // with one observer
        Observer observer1 = new BinaryObserver(subject);
        subject.setState(3); // with two observers
    }
}