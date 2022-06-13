import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Random;
import java.util.Set;

public class SystemManager {
	//------------------FIELDS------------------
	private static HashMap<String, User> users;

	private static User loggedUser;
	private static User sharingUser;
	
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
	
	
	//---------------------SHARING---------------------------------
	
	public static void shares(){
		//selects random parts from all users in database
		Iterator it = users.entrySet().iterator();
		
		while (it.hasNext()) {
 
            Map.Entry mapElement = (Map.Entry)it.next();
            sharingUser = (User) mapElement.getValue();
			
			System.out.printf("\n==========> %s %s <==========",sharingUser.getName(),sharingUser.getSurname());
			print_sharing();


            // Printing mark corresponding to string entries
            System.out.println(mapElement.getKey());
        }
	}
	
	private static boolean print_sharing(){
		Random rand = new Random();
		int num = rand.nextInt(6);
		
		if(num==0){ //hobbies
			int last = sharingUser.getHobbies().size();
			if(last!=0){
				System.out.printf("\n ==>> %s is one of my hobbies ",sharingUser.getHobbies().get(last-1));
				return true;
			}
			else 
				return false;
		}
		else if(num==1){//completed to-do
			int randInSet = rand.nextInt(sharingUser.getNotebook().getCompletedToDos().size());
			Iterator<ToDo> it = sharingUser.getNotebook().getCompletedToDos().iterator();
			int i=0;
			while(it.hasNext()){
				if(i==randInSet){
					it.next().print_ToDo();
					break;
				}
				i++;
				it.next();
			}
		}
		else if(num==2){//current to-do
			int randInSet = rand.nextInt(sharingUser.getNotebook().getCurrentToDos().size());
			Iterator<ToDo> it = sharingUser.getNotebook().getCurrentToDos().iterator();
			int i=0;
			while(it.hasNext()){
				if(i==randInSet){
					it.next().print_ToDo();
					break;
				}
				i++;
				it.next();
			}
		}
		else if(num==3){//diet plan
			sharingUser.getNotebook().getDietPlans().print_DietPlan();
		}
		else if(num==4){//recipe
			//choose one recipe from AVLTree and print it
		}
		else if(num==5){//exercise plan
			//choose one exercise plan from Graph and print it
		}
		return false;
		
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
	public static void displayTasksOfTheDays() {
		Set entrySet = loggedUser.getNotebook().getDailySections().entrySet();
		Iterator it = entrySet.iterator();
		while(it.hasNext()){
			Map.Entry me = (Map.Entry)it.next();
			System.out.println("Date is: "+me.getKey() + 
			" & " + 
			" Task is: "+me.getValue());
		}
	}

	public static void markTaskAsCompleted(){
	}
	
	public static void markTaskAsCompleted(Task task) {}

	public static void addTask(){}

	public static void editTask(){}

	
	//--------------------EXERCISE PLANS----------------------
	public static void displayExercisePlans() {
	}

	public static void displayExerciseOfTheDay() {
	}

	public static void addExercisePlan() {
	}
	
	public static void displayExercisePlans(ExercisePlan plan) {
		plan.getDailyExercises().toString();
	}

	public static void displayExerciseOfTheDay(ExercisePlan plan) {
		plan.getDaily();
	}

	public static void addExercisePlan(String name, int cal, ExercisePlan plan) {
		Exercise e = new Exercise(name, cal);
		plan.getDailyExercises().insertVertex(e);
	}

	//-------------------DIET PLANS----------------------------
	public static void displayDietPlans() {
		Iterator<Food> it = loggedUser.getNotebook().getDietPlans().getIterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

	public static void displayDietPlans(NavigableSet<Food> set) {
		Iterator<Food> it = set.iterator();
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
		for(Food food : loggedUser.getNotebook().getDietPlans().getMenu()){
			if(food.getNameOfFood().compareTo(foodName)==0){
				loggedUser.getNotebook().getDietPlans().getMenu().remove(food);
				break;
			}
		}
	}

	public static void filterFoodsByCalories(){
		int cal = GetChoiceFromUser.getNumber("Enter cal value to filter diet plan : ");
		Food food1 = new Food("a", 0);
		Food food2 = new Food("z", cal);
		
		NavigableSet<Food> newSet = (NavigableSet<Food>) loggedUser.getNotebook().getDietPlans().getMenu().subSet(food1, food2);
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
