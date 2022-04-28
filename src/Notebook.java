import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Notebook {
    private ArrayList<ArrayList<ArrayList<DailySection>>> dailySections;
    private Queue<ToDo> currentToDos;
    private Queue<ToDo> completedToDos;
    // private BinarySearchTree<ExerciseStat> exerciseStats;
    private ArrayList<DietPlan> dietPlans;
    private ArrayList<ExercisePlan> exercisePlans;

    public Notebook() {
        dailySections = new ArrayList<>(new ArrayList<>(new ArrayList<>()));
        currentToDos = new LinkedList<>();
        completedToDos = new LinkedList<>();
        dietPlans = new ArrayList<>();
        exercisePlans = new ArrayList<>();
    }

    public ArrayList<ArrayList<ArrayList<DailySection>>> getDailySections() {
        return dailySections;
    }

    public void setDailySections(ArrayList<ArrayList<ArrayList<DailySection>>> dailySections) {
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

    public ArrayList<DietPlan> getDietPlans() {
        return dietPlans;
    }

    public void setDietPlans(ArrayList<DietPlan> dietPlans) {
        this.dietPlans = dietPlans;
    }

    public ArrayList<ExercisePlan> getExercisePlans() {
        return exercisePlans;
    }

    public void setExercisePlans(ArrayList<ExercisePlan> exercisePlans) {
        this.exercisePlans = exercisePlans;
    }
}
