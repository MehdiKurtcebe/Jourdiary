public class UI {
	private static void start_screen() {
		start_screen_menu();
		int input = GetChoiceFromUser.getSubChoice(2, "");
		if(input == 1) {
			while (!loginProcess());
		}
		else signup();
		home_screen();
	}

	private static void home_screen() {
		while(true) {
			home_screen_menu();
			int input = GetChoiceFromUser.getSubChoice(2, "");
			if(input == 1) user_profile();
			else start_screen();
		}
	}

	private static void user_profile() {
		while(true) {
			user_profile_menu();
			int input = GetChoiceFromUser.getSubChoice(8, "");

			switch (input) {
				case 1: // display all
					break;
				case 2:
					daily_section();
					break;
				case 3:
					to_do();
					break;
				case 4:
					task();
					break;
				case 5:
					diet_plan();
					break;
				case 6:
					exercise_plan();
					break;
				case 7:
					//food_menu();
					break;
				case 8:
					hobbies();
					break;
			}
		}
	}

	private static boolean loginProcess() {
		User user = SystemManager.getUsers().get(GetChoiceFromUser.getStringFromUser("ENTER ID : "));
		if(user != null) {
			System.out.printf("Name is : %s\n", user.getName());
			System.out.println("LOGIN SUCCESSFUL");
			SystemManager.setLoggedUser(user);
			return true;
		}
		else {
			System.out.println("LOGIN FAILED");
			return false;
		}
	}


	private static void signup() {
		String ID = GetChoiceFromUser.getStringFromUser("Enter ID : ");
		System.out.println("Your ID " + ID);

		String Name = GetChoiceFromUser.getStringFromUser("Enter Name : ");

		String Surname = GetChoiceFromUser.getStringFromUser("Enter Surname : ");

		User newUser = new User(ID, Name, Surname);
		SystemManager.getUsers().put(ID, newUser);
	}

	private static void daily_section() {
		daily_section_menu();
		while(true){
			int input = GetChoiceFromUser.getSubChoice(3, "");
			switch (input) {
				case 1:
					SystemManager.displayAllDailySections();
					break;
				case 2:
					SystemManager.addDailySection();
					break;
				case 3:
					SystemManager.editDailySection();
					break;
			}
		}
	}

	private static void to_do(){
		to_do_menu();
		while(true){
			int input = GetChoiceFromUser.getSubChoice(6, "");
			switch (input) {
				case 1 -> SystemManager.displayCurrentToDos();
				case 2 -> SystemManager.displayCompletedToDos();
				case 3 -> SystemManager.createToDoList();
				case 4 -> SystemManager.editToDoList();
				case 5 -> SystemManager.markToDoAsCompleted();
				case 6 -> SystemManager.markTaskAsCompleted();
			}
		}
	}

	private static void task(){
		task_menu();
		while(true){
			int input = GetChoiceFromUser.getSubChoice(4, "");
			switch (input) {
				case 1 -> SystemManager.displayTasksOfTheDays();
				case 2 -> SystemManager.addTask();
				case 3 -> SystemManager.editTask();
				case 4 -> SystemManager.markTaskAsCompleted();
			}
		}
	}

	private static void diet_plan(){
		diet_plan_menu();
		while(true){
			int input = GetChoiceFromUser.getSubChoice(3, "");
			switch (input) {
				case 1 -> SystemManager.displayDietPlans();
				case 2 -> SystemManager.createDietPlan();
				case 3 -> SystemManager.editDietPlan();
			}
		}
	}

	private static void exercise_plan(){
		exercise_plan_menu();
		while(true){
			int input = GetChoiceFromUser.getSubChoice(3, "");
			switch (input) {
				case 1 -> SystemManager.displayExercisePlans();
				case 2 -> SystemManager.displayExerciseOfTheDay();
				case 3 -> SystemManager.addExercisePlan();
			}
		}
	}

	private static void hobbies(){
		hobbies_menu();
		while(true){
			int input = GetChoiceFromUser.getSubChoice(3, "");
			switch (input) {
				case 1 -> SystemManager.displayHobbies();
				case 2 -> SystemManager.addHobby();
				case 3 -> SystemManager.editHobby();
			}
		}
	}

	private static void start_screen_menu(){
		System.out.println("1 - Login");
		System.out.println("2 - Sign up");
	}

	private static void home_screen_menu(){
		System.out.println("1 - Profile ");
		System.out.println("2 - Sign out ");
	}

	private static void user_profile_menu(){
		System.out.println("1- View All Jourdiary");
		System.out.println("2- Daily Section");
		System.out.println("3- ToDo");
		System.out.println("4- Task of the Day");
		System.out.println("5- Diet Plan");
		System.out.println("6- Exercise Plan");
		System.out.println("7- Food Menu");
		System.out.println("8- Hobbies ");
	}

	private static void task_menu(){
		System.out.println("1 - Display Tasks of the Days");
		System.out.println("2 - Add Task");
		System.out.println("3 - Edit Task");
		System.out.println("4 - Mark Task As Completed");
	}

	private static void hobbies_menu(){
		System.out.println("1 - Display All Hobbies");
		System.out.println("2 - Add Hobbies");
		System.out.println("3 - Edit Hobbies");
	}

	private static void daily_section_menu(){
		System.out.println("1 - Display All Daily Sections");
		System.out.println("2 - Add Daily Section");
		System.out.println("3 - Edit Daily Section");
	}

	private static void to_do_menu(){
		System.out.println("1 - Display Current To-Dos");
		System.out.println("2 - Display Completed To-Dos");
		System.out.println("3 - Create To-Do List");
		System.out.println("4 - Edit To-Do List");
		System.out.println("5 - Mark a To-Do List as Completed");
		System.out.println("6 - Mark a Task as Completed");
	}

	private static void diet_plan_menu(){
		System.out.println("1 - Display All Diet Plans");
		System.out.println("2 - Create Diet Plan");
		System.out.println("3 - Edit Diet Plan");
	}

	private static void exercise_plan_menu(){
		System.out.println("1 - Display All Exercise Plans");
		System.out.println("2 - Display Exercise Plan of the Day");
		System.out.println("3 - Add Exercise Plan");
	}

}
