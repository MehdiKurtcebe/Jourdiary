import java.util.HashMap;

public class System {
	private static HashMap<String, User> users;

	private static User loggedUser;

	private static boolean login(String id) {
		loggedUser = users.get(id);
		return loggedUser != null;
	}

	private static boolean signup(User user) {
		if (user == null) return false;
		if (users.containsKey(user.getId())) return false;
		users.put(user.getId(), user);
		loggedUser = user;
		return true;
	}
}
