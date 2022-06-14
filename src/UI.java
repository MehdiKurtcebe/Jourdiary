import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class UI {
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
					while (!signup());
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
			int input = GetChoiceFromUser.getSubChoice(7, "YOUR CHOICE: ");

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
		String id = GetChoiceFromUser.getStringFromUser("ENTER ID: ");
		if (SystemManager.login(id)) {
			System.out.println("LOGIN SUCCESSFUL");
			System.out.printf("Welcome %s\n", SystemManager.getLoggedUser().getName());
			return true;
		} else {
			System.out.println("LOGIN FAILED");
			return false;
		}
	}

	private static boolean signup() {
		System.out.println("--------SIGN UP--------");
		String ID = GetChoiceFromUser.getStringFromUser("ENTER ID: ");
		System.out.println("Your ID: " + ID);

		String Name = GetChoiceFromUser.getStringFromUser("ENTER NAME: ");

		String Surname = GetChoiceFromUser.getStringFromUser("ENTER SURNAME: ");

		User newUser = new User(ID, Name, Surname);
		if (SystemManager.signup(newUser)) {
			System.out.println("SIGNED UP SUCCESSFULLY");
			return true;
		} else {
			System.out.println("SIGN UP FAILED");
			return false;
		}
	}

	private static void daily_section() {
		while(true){
			daily_section_menu();
			int input = GetChoiceFromUser.getSubChoice(2, "YOUR CHOICE: ");
			switch (input) {
				case 0:
					return;
				case 1:
					past_daily_sections();
					break;
				case 2:
					edit_daily_section();
					SystemManager.editDailySection();
					break;
			}
		}
	}

	private static void edit_daily_section() {
		System.out.println("ENTER DATE");
		int day = GetChoiceFromUser.getSubChoice(31, "DAY: ");
		int month = GetChoiceFromUser.getSubChoice(12, "MONTH: ");
		int year = GetChoiceFromUser.getSubChoice(3000, "YEAR: ");
		DailySection ds = SystemManager.getDailySection(new GregorianCalendar(year, month, day));
		if (ds == null) System.out.println("DAILY SECTION CANNOT FOUND");
		else {

		}
	}

	private static void past_daily_sections() {
		System.out.println("LAST 7 DAYS: ");
		Calendar date = Calendar.getInstance();
		for (int i = 0; i < 7; i++) {
			date.add(GregorianCalendar.DAY_OF_MONTH, -1);
			SystemManager.displayDailySection(date);
		}
		while (true) {
			past_daily_sections_menu();
			int input = GetChoiceFromUser.getSubChoice(1, "YOUR CHOICE: ");
			switch (input) {
				case 0:
					return;
				case 1:
					int day = GetChoiceFromUser.getSubChoice(31, "DAY: ");
					int month = GetChoiceFromUser.getSubChoice(12, "MONTH: ");
					int year = GetChoiceFromUser.getSubChoice(3000, "YEAR: ");
					SystemManager.displayDailySection(new GregorianCalendar(year, month, day));
					break;
			}
		}
	}

	private static void to_do() {
		while (true) {
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
		System.out.println("===================");
	}

	private static void home_screen_menu(){
		System.out.println("\n\n\n===================");
		System.out.println("0 - Exit Program");
		System.out.println("1 - Profile ");
		System.out.println("2 - Sign out ");
		System.out.println("===================");
	}

	private static void user_profile_menu(){
		System.out.printf("\n\n>>Profile : %s\n", SystemManager.getLoggedUser().getId());
		System.out.println("\n===========================");
		System.out.println("0 - Back");
		System.out.println("1 - View All Jourdiary");
		System.out.println("2 - Daily Section");
		System.out.println("3 - ToDo");
		System.out.println("4 - Task of the Day");
		System.out.println("5 - Diet Plan");
		System.out.println("6 - Exercise Plan");
		System.out.println("7 - Hobbies ");
		System.out.println("==========================");
	}

	private static void task_menu(){
		System.out.println("\n\n================================");
		System.out.println("0 - Back");
		System.out.println("1 - Display Tasks of the Days");
		System.out.println("2 - Add Task");
		System.out.println("3 - Edit Task");
		System.out.println("4 - Mark Task As Completed");
		System.out.println("==================================");
	}

	private static void hobbies_menu(){
		System.out.println("\n\n===========================");
		System.out.println("0 - Back");
		System.out.println("1 - Display All Hobbies");
		System.out.println("2 - Add Hobbies");
		System.out.println("3 - Edit Hobbies");
		System.out.println("============================");
	}

	private static void daily_section_menu() {
		System.out.println("\n\n=================================");
		System.out.println("0 - Back");
		System.out.println("1 - Display Past Daily Sections");
		System.out.println("2 - Edit Daily Section");
		System.out.println("===================================");
	}

	private static void past_daily_sections_menu() {
		System.out.println("0 - Back");
		System.out.println("1 - View Other Daily Sections");
	}

	private static void to_do_menu() {
		System.out.println("\n\n====================================");
		System.out.println("0 - Back");
		System.out.println("1 - Display Current To-Dos");
		System.out.println("2 - Display Completed To-Dos");
		System.out.println("3 - Create To-Do List");
		System.out.println("4 - Edit To-Do List");
		System.out.println("5 - Mark a To-Do List as Completed");
		System.out.println("6 - Mark a Task as Completed");
		System.out.println("=======================================");
	}

	private static void diet_plan_menu(){
		System.out.println("\n\n=============================================");
		System.out.println("0 - Back");
		System.out.println("1 - Display All Diet Plans");
		System.out.println("2 - Create Diet Plan");
		System.out.println("3 - Edit Diet Plan");
		System.out.println("4 - Filter Foods in Diet Plan by Calorie");
		System.out.println("===============================================");
	}

	private static void exercise_plan_menu(){
		System.out.println("\n\n===========================================");
		System.out.println("0 - Back");
		System.out.println("1 - Display All Exercise Plans");
		System.out.println("2 - Display Exercise Plan of the Day");
		System.out.println("3 - Add Exercise Plan");
		System.out.println("==============================================");
	}

}
