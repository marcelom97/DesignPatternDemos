package mvclab;

public class MvcPatternDemo {

    public static void main(String[] args) {
        User model = retrieveUserFromDatabase();
        Frame window = new Frame();
        UserView view = new UserView(window);

        UserController controller = new UserController(model, view);

        controller.updateView();

        controller.setUserId(4500);

        controller.updateView();
    }

    private static User retrieveUserFromDatabase() {
        return new User(1, "marcelo", "marcelomollaj@gmail.com");
    }
}