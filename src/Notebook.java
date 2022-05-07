import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Notebook {
    private final HashMap<Date, DailySection> dailySections;
    private final Queue<ToDo> currentToDos;
    private final Queue<ToDo> completedToDos;

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

    public boolean addDailySection(Date date) {
        if (dailySections.containsKey(date)) return false;
        dailySections.put(date, new DailySection(date, new FoodMenu(null), null));
        return true;
    }

    public Queue<ToDo> getCurrentToDos() {
        return currentToDos;
    }

    public void addCurrentToDo(ToDo toDo) {
        this.currentToDos.offer(toDo);
    }

    public Queue<ToDo> getCompletedToDos() {
        return completedToDos;
    }

    public void addCompletedToDo(ToDo completedToDo) {
        this.completedToDos.offer(completedToDo);
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
