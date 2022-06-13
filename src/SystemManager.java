import java.util.HashMap;
import java.util.Iterator;

public class SystemManager {
	//------------------FIELDS------------------
	private static HashMap<String, User> users;

	private static User loggedUser;
	
	//-----------------PROFILE METHODS-----------------------
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
	
	
	//--------------------DAILY SECTION----------------------------
	
	public static void displayAllDailySections() {
	}

	public static void displayDailySections(Date date) {
	}

	public static void addDailySection() {
	}

	public static void editDailySection() {
	}
	
	//-------------------------TO-DO--------------------------------
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
		String nameOfList = GetChoiceFromUser.getStringFromUser("Enter name of list : ");
		int day = GetChoiceFromUser.getSubChoice(31, "Please enter day : ");
		int month = GetChoiceFromUser.getSubChoice(12, "Please enter month : ");
		int year = GetChoiceFromUser.getNumber("Please enter year : ");
		Date date = new Date(day, month, year);

		return new ToDo(date,nameOfList);
	}

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
	
	public static void addToDoList(ToDo list) {}

	//-----------------------TASKS---------------------------
	public static void displayTasksOfTheDays() {}

	public static void markTaskAsCompleted() {}
	
	public static void markTaskAsCompleted(Task task) {}

	public static void addTask(){}

	public static void editTask(){}

	
	//--------------------EXERCISE PLANS----------------------
	public static void displayExercisePlans() {}

	public static void displayExercisePlan(ExercisePlan plan) {}

	public static void displayExerciseOfTheDay() {}

	public static void addExercisePlan() {}

	
	//-------------------DIET PLANS----------------------------
	public static void displayDietPlans() {
		Iterator it = loggedUser.getNotebook().getDietPlans().iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

	public static void displayDietPlans(NavigableSet<Food> set) {
		Iterator it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

	public static void addFoodToDietPlan() {
		String foodName = GetChoiceFromUser.getStringFromUser("Enter name of food :");
		Integer cal = GetChoiceFromUser.getNumber("Enter cal of food : ");
		Food food = new Food(foodName, cal);
		loggedUser.getNotebook().getDietPlans().add(food);
	}

	public static void removeFoodFromDietPlan(){
		String foodName = GetChoiceFromUser.getStringFromUser("Enter name of food : ");
		for(Food food : loggedUser.getNotebook().getDietPlans()){
			if(food.getNameOfFood().compareTo(foodName)==0){
				loggedUser.getNotebook().getDietPlans().remove(food);
				break;
			}
		}
	}

	public static void filterFoodsByCalories(){
		int cal = GetChoiceFromUser.getNumber("Enter cal value to filter diet plan : ");
		Food food1 = new Food("a", 0);
		Food food2 = new Food("z", cal);
		
		NavigableSet<Food> newSet = (NavigableSet<Food>) loggedUser.getNotebook().getDietPlans().subSet(food1, food2);
		displayDietPlans(newSet);
	}

	//------------------HOBBIES---------------------------------
	public static void displayHobbies() {
		for(int i=0;i<loggedUser.getHobbies().size();i++)
			System.out.printf("\n%d -) %s ",i,loggedUser.getHobbies().get(i));
	}

	public static void addHobby() {
		String hobby = GetChoiceFromUser.getStringFromUser("Please enter new hobby ");
		loggedUser.getHobbies().add(hobby);
	}

	public static void editHobby() {}
	//---------------------------------------------------------
}
