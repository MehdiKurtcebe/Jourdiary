import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Notebook {
    private HashMap<Date, DailySection> dailySections;
    private Queue<ToDo> currentToDos;
    private Queue<ToDo> completedToDos;

    private BST<ExerciseStat> exerciseStats;
    private CircularArrayList<DietPlan> dietPlans;
    private CircularArrayList<ExercisePlan> exercisePlans;

    public Notebook() {
        dailySections = new HashMap<>();
        currentToDos = new LinkedList<>();
        completedToDos = new LinkedList<>();
        dietPlans = new CircularArrayList<>();
        exercisePlans = new CircularArrayList<>();
    }

    public HashMap<Date, DailySection> getDailySections() {
        return dailySections;
    }

    public void setDailySections(HashMap<Date, DailySection> dailySections) {
        this.dailySections = dailySections;
    }

    public Queue<ToDo> getCurrentToDos() {
        return currentToDos;
    }

    public void setCurrentToDos(Queue<ToDo> currentToDos) {
        this.currentToDos = currentToDos;
    }

    public Queue<ToDo> getCompletedToDos() {
        return completedToDos;
    }

    public void setCompletedToDos(Queue<ToDo> completedToDos) {
        this.completedToDos = completedToDos;
    }

    public CircularArrayList<DietPlan> getDietPlans() {
        return dietPlans;
    }

    public void setDietPlans(CircularArrayList<DietPlan> dietPlans) {
        this.dietPlans = dietPlans;
    }

    public CircularArrayList<ExercisePlan> getExercisePlans() {
        return exercisePlans;
    }

    public void setExercisePlans(CircularArrayList<ExercisePlan> exercisePlans) {
        this.exercisePlans = exercisePlans;
    }
}
