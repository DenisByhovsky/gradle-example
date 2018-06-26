import com.byhovsky.project.User;
import com.byhovsky.project.UserService;

public class UserHandler {

    public static void main(String[] args) {
        User user = new User(3, "Denis", "Byhovsky");
        new UserService().addUser(user);
    }
}
