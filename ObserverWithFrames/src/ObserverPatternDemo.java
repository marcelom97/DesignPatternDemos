public class ObserverPatternDemo {
    public static void main(String[] args) {
        ObservableFrame observableFrame = new ObservableFrame();
        ObserverFrame observerFrame = new ObserverFrame();
        ObserverFrame observerFrame1 = new ObserverFrame();
        observableFrame.attach(observerFrame);
        observableFrame.attach(observerFrame1);
    }
}