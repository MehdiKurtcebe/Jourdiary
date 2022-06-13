import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

public class SystemManager {
	private static HashMap<String, User> users;

	private static User loggedUser;

	public static HashMap<String, User> getUsers() {
		return users;
	}

	public static User getLoggedUser() {
		return loggedUser;
	}

	public static void setLoggedUser(User loggedUser) {
		SystemManager.loggedUser = loggedUser;
	}

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
		System.out.printf("\n ------->> Current To-Dos <<--------");
		Iterator<ToDo> it = loggedUser.getNotebook().getCurrentToDos().iterator();
		while(it.hasNext()){
			displayToDo(it.next());
		}
	}

	public static void displayCompletedToDos() {
		System.out.printf("\n ------->> Completed To-Dos <<--------");
		Iterator<ToDo> it = loggedUser.getNotebook().getCompletedToDos().iterator();
		while(it.hasNext()){
			displayToDo(it.next());
		}
	}

	public static void displayToDo(ToDo toDo) {
		System.out.printf("\n || DEADLINE : %s",toDo.getDeadline());
		Iterator<Task> it = toDo.getTasks().iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

	public static ToDo createToDoList(){
		//List'in adını al
		String nameOfList = GetChoiceFromUser.getStringFromUser("Enter name of list : ");
		int day = GetChoiceFromUser.getSubChoice(31, "Please enter day : ");
		int month = GetChoiceFromUser.getSubChoice(12, "Please enter month : ");
		int year = GetChoiceFromUser.getNumber("Please enter year : ");
		Date date = new Date(day, month, year);

		return new ToDo(date,nameOfList);
	}

	public static void addToDoList(ToDo list) {}

	public static void editToDoList() {
		String nameOfList = GetChoiceFromUser.getStringFromUser("Enter name of list :");
		ToDo list = loggedUser.getNotebook().getToDoList(nameOfList);

		int choice = GetChoiceFromUser.getSubChoice(2, "\n1 - Change deadline \n2-Add new task");
		if(choice == 1){
			int day = GetChoiceFromUser.getSubChoice(31, "Please enter day : ");
			int month = GetChoiceFromUser.getSubChoice(12, "Please enter month : ");
			int year = GetChoiceFromUser.getNumber("Please enter year : ");
			list.setDeadline(new Date(day,month,year));
		}
		else if(choice == 2){
			String content = GetChoiceFromUser.getStringFromUser("Enter new task : ");
			list.addTask(new Task(content));
		}
	}

	public static void markToDoAsCompleted(){
		String nameOfList = GetChoiceFromUser.getStringFromUser("Enter name of list :");
		ToDo list = loggedUser.getNotebook().getToDoList(nameOfList);
		loggedUser.getNotebook().getCurrentToDos().remove(list);
		loggedUser.getNotebook().getCompletedToDos().add(list);
	}

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

	public static void displayHobbies() {
		for(int i=0;i<loggedUser.getHobbies().size();i++)
			System.out.printf("\n%d -) %s ",i,loggedUser.getHobbies().get(i));
	}

	public static void addHobby() {
		String hobby = GetChoiceFromUser.getStringFromUser("Please enter new hobby ");
		loggedUser.getHobbies().add(hobby);
	}

	public static void editHobby() {}
}
