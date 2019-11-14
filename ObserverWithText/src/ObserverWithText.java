public class ObserverWithText {
    public static void main(String[] args) {
        ObservableFrame observableFrame = new ObservableFrame();
        ObserverFrame observerFrame = new ObserverFrame();
        ObserverFrame observerFrame1 = new ObserverFrame();
        ObserverFrame observerFrame2 = new ObserverFrame();
        observableFrame.attach(observerFrame);
        observableFrame.attach(observerFrame1);
        observableFrame.attach(observerFrame2);
    }
}
