import java.util.LinkedList;
import java.util.Queue;

public class ExercisePlan {
	private Queue<String> dailyExercises;

	public ExercisePlan() {
		dailyExercises = new LinkedList<>();
	}

	public Queue<String> getDailyExercises() {
		return dailyExercises;
	}

	public void setDailyExercises(Queue<String> dailyExercises) {
		this.dailyExercises = dailyExercises;
	}
}
