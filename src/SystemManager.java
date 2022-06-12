import java.util.Calendar;
import java.util.HashMap;

public class SystemManager {
	private static HashMap<String, User> users;

	private static User loggedUser;

	public static boolean login(String id) {
		loggedUser = users.get(id);
		return loggedUser != null;
	}

	public static boolean signup(User user) {
		if (user == null) return false;
		if (users.containsKey(user.getId())) return false;
		users.put(user.getId(), user);
		loggedUser = user;
		return true;
	}

	public static void displayDailySections(Calendar date) {
	}

	public static void addDailySection() {
	}

	public static void editDailySection() {
	}

	public static void displayCurrentToDos() {
	}

	public static void displayCompletedToDos() {
	}

	public static void displayToDo(ToDo toDo) {
	}

	public static ToDo createToDoList() {return new ToDo();}

	public static void addToDoList(ToDo list) {}

	public static void editToDoList() {}

	public static void displayTasksOfTheDays() {}

	public static void markTaskAsCompleted(Task task) {}

	public static void markTaskAsNotCompleted(Task task) {}

	public static void displayExercisePlans() {}

	public static void displayExercisePlan(ExercisePlan plan) {}

	public static void displayExerciseOfTheDay() {}

	public static void addExercisePlan() {}

	public static void displayDietPlans() {}

	public static void displayDietPlan(DietPlan plan) {}

	public static void createDietPlan() {}

	public static void editDietPlan() {}

	public static void displayMenuOfTheDay() {}

	public static void displayFoodMenu(FoodMenu menu) {}

	public static void createFoodMenu() {}

	public static void editFoodMenu() {}

	public static void displayHobbies() {}

	public static void addHobby() {}

	public static void editHobby() {}
}
