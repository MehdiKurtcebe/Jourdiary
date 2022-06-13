public class UI {
	public static void start_screen() {
		while (true) {
			start_screen_menu();
			int input = GetChoiceFromUser.getSubChoice(2, "YOUR CHOICE: ");
			switch (input) {
				case 0:
					System.exit(0);
				case 1:
					while (!loginProcess());
					home_screen();
					break;
				case 2:
					signup();
					break;
			}
		}
	}

	private static void home_screen() {
		while(true) {
			home_screen_menu();
			int input = GetChoiceFromUser.getSubChoice(2, "YOUR CHOICE: ");
			switch (input) {
				case 0:
					System.exit(0);
				case 1:
					user_profile();
					break;
				case 2:
					return;
			}
		}
	}

	private static void user_profile() {
		while(true) {
			user_profile_menu();
			int input = GetChoiceFromUser.getSubChoice(8, "YOUR CHOICE: ");

			switch (input) {
				case 0:
					return;
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
					hobbies();
					break;
			}
		}
	}

	private static boolean loginProcess() {
		System.out.println("--------LOGIN--------");
		User user = SystemManager.getUsers().get(GetChoiceFromUser.getStringFromUser("ENTER ID: "));
		if(user != null) {
			SystemManager.setLoggedUser(user);
			System.out.println("LOGIN SUCCESSFUL");
			System.out.printf("Welcome %s\n", user.getName());
			return true;
		}
		else {
			System.out.println("LOGIN FAILED");
			return false;
		}
	}


	private static void signup() {
		System.out.println("--------SIGN UP--------");
		String ID = GetChoiceFromUser.getStringFromUser("ENTER ID: ");
		System.out.println("Your ID: " + ID);

		String Name = GetChoiceFromUser.getStringFromUser("ENTER NAME: ");

		String Surname = GetChoiceFromUser.getStringFromUser("ENTER SURNAME: ");

		User newUser = new User(ID, Name, Surname);
		SystemManager.getUsers().put(ID, newUser);
		System.out.println("SIGNED UP SUCCESSFULLY");
	}

	private static void daily_section() {
		while(true){
			daily_section_menu();
			int input = GetChoiceFromUser.getSubChoice(3, "YOUR CHOICE: ");
			switch (input) {
				case 0:
					return;
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
		while(true){
			to_do_menu();
			int input = GetChoiceFromUser.getSubChoice(6, "YOUR CHOICE: ");
			switch (input) {
				case 0:
					return;
				case 1:
					SystemManager.displayCurrentToDos();
					break;
				case 2:
					SystemManager.displayCompletedToDos();
					break;
				case 3:
					SystemManager.createToDoList();
					break;
				case 4:
					SystemManager.editToDoList();
					break;
				case 5:
					SystemManager.markToDoAsCompleted();
					break;
				case 6:
					SystemManager.markTaskAsCompleted();
					break;
			}
		}
	}

	private static void task(){
		while(true){
			task_menu();
			int input = GetChoiceFromUser.getSubChoice(4, "YOUR CHOICE: ");
			switch (input) {
				case 0:
					return;
				case 1:
					SystemManager.displayTasksOfTheDays();
					break;
				case 2:
					SystemManager.addTask();
					break;
				case 3:
					SystemManager.editTask();
					break;
				case 4:
					SystemManager.markTaskAsCompleted();
					break;
			}
		}
	}

	private static void diet_plan(){
		while(true){
			diet_plan_menu();
			int input = GetChoiceFromUser.getSubChoice(4, "YOUR CHOICE: ");
			switch (input) {
				case 0:
					return;
				case 1:
					SystemManager.displayDietPlans();
					break;
				case 2:
					SystemManager.addFoodToDietPlan();
					break;
				case 3:
					SystemManager.removeFoodFromDietPlan();
					break;
				case 4:
					SystemManager.filterFoodsByCalories();
					break;
			}
		}
	}

	private static void exercise_plan(){
		while(true){
			exercise_plan_menu();
			int input = GetChoiceFromUser.getSubChoice(3, "YOUR CHOICE: ");
			switch (input) {
				case 0:
					return;
				case 1:
					SystemManager.displayExercisePlans();
					break;
				case 2:
					SystemManager.displayExerciseOfTheDay();
					break;
				case 3:
					SystemManager.addExercisePlan();
					break;
			}
		}
	}

	private static void hobbies(){
		while(true){
			hobbies_menu();
			int input = GetChoiceFromUser.getSubChoice(3, "YOUR CHOICE: ");
			switch (input) {
				case 0:
					return;
				case 1:
					SystemManager.displayHobbies();
					break;
				case 2:
					SystemManager.addHobby();
					break;
				case 3:
					SystemManager.editHobby();
					break;
			}
		}
	}

	private static void start_screen_menu(){
		
		System.out.println("\n\n        *************            ********            **        **        *****            ******            ******          ********          *****            **              ** ");
		System.out.println("               **              **        **          **        **        **   **          **    **            **           **      **         **   **            **          **   ");
		System.out.println("               **             **          **         **        **        **     **        **     **           **          **        **        **     **            **      **     ");
		System.out.println("               **            **            **        **        **        **   **          **      **          **          **        **        **   **                **  **       ");
		System.out.println("               **            **            **        **        **        ****             **      **          **          ************        ****                     **         ");
		System.out.println("        **     **            **            **        **        **        **  **           **      **          **          **        **        **  **                   **         ");
		System.out.println("         **    **             **          **         **        **        **   **          **     **           **          **        **        **   **                  **         ");
		System.out.println("          **  **               **        **           **      **         **    **         **    **            **          **        **        **    **                 **         ");
		System.out.println("           ****                  ********               ******           **     **        ******            ******        **        **        **     **                **         ");

		System.out.println("\n0 - Exit Program");
		System.out.println("1 - Login");
		System.out.println("2 - Sign up");
		System.out.printf("===================");
	}

	private static void home_screen_menu(){
		System.out.printf("\n\n\n===================");
		System.out.println("0 - Exit Program");
		System.out.println("1 - Profile ");
		System.out.println("2 - Sign out ");
		System.out.printf("===================");
	}

	private static void user_profile_menu(){
		System.out.println("\n\n===========================");
		System.out.println("0 - Back");
		System.out.println("1 - View All Jourdiary");
		System.out.println("2 - Daily Section");
		System.out.println("3 - ToDo");
		System.out.println("4 - Task of the Day");
		System.out.println("5 - Diet Plan");
		System.out.println("6 - Exercise Plan");
		System.out.println("7 - Hobbies ");
		System.out.printf("==========================");
	}

	private static void task_menu(){
		System.out.println("\n\n================================");
		System.out.println("0 - Back");
		System.out.println("1 - Display Tasks of the Days");
		System.out.println("2 - Add Task");
		System.out.println("3 - Edit Task");
		System.out.println("4 - Mark Task As Completed");
		System.out.printf("==================================");
	}

	private static void hobbies_menu(){
		System.out.println("\n\n===========================");
		System.out.println("0 - Back");
		System.out.println("1 - Display All Hobbies");
		System.out.println("2 - Add Hobbies");
		System.out.println("3 - Edit Hobbies");
		System.out.printf("============================");
	}

	private static void daily_section_menu(){
		System.out.println("\n\n=================================");
		System.out.println("0 - Back");
		System.out.println("1 - Display All Daily Sections");
		System.out.println("2 - Add Daily Section");
		System.out.println("3 - Edit Daily Section");
		System.out.printf("===================================");
	}

	private static void to_do_menu(){
		System.out.println("\n\n====================================");
		System.out.println("0 - Back");
		System.out.println("1 - Display Current To-Dos");
		System.out.println("2 - Display Completed To-Dos");
		System.out.println("3 - Create To-Do List");
		System.out.println("4 - Edit To-Do List");
		System.out.println("5 - Mark a To-Do List as Completed");
		System.out.println("6 - Mark a Task as Completed");
		System.out.printf("=======================================");
	}

	private static void diet_plan_menu(){
		System.out.println("\n\n=============================================");
		System.out.println("0 - Back");
		System.out.println("1 - Display All Diet Plans");
		System.out.println("2 - Create Diet Plan");
		System.out.println("3 - Edit Diet Plan");
		System.out.println("4 - Filter Foods in Diet Plan by Calorie");
		System.out.printf("===============================================");
	}

	private static void exercise_plan_menu(){
		System.out.println("\n\n===========================================");
		System.out.println("0 - Back");
		System.out.println("1 - Display All Exercise Plans");
		System.out.println("2 - Display Exercise Plan of the Day");
		System.out.println("3 - Add Exercise Plan");
		System.out.printf("==============================================");
	}

}
