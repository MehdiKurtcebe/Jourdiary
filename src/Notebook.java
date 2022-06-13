import java.util.*;

public class Notebook {

    private Date date;
    private final HashMap<Date, DailySection> dailySections;
    private final HashSet<ToDo> currentToDos;
    private final HashSet<ToDo> completedToDos;
    // private Skiplist exerciseStats;
    //private BST<ExerciseStat> exerciseStats;
    private NavigableMap<String,Integer> dietPlans;
    // private Graph exercisePlans;
    private CircularArrayList<ExercisePlan> exercisePlans;

    public Notebook() {
        dailySections = new HashMap<>();
        currentToDos = new HashSet<>();
        completedToDos = new HashSet<>();
        dietPlans = new TreeMap<>();
        // exercisePlans = new Graph;
    }

    public HashMap<Date, DailySection> getDailySections() {
        return dailySections;
    }

    public boolean addDailySection(Date date) {
        if (dailySections.containsKey(date)) return false;
        dailySections.put(date, new DailySection(date, new FoodMenu(null), null));
        return true;
    }

    public ToDo getToDoList(String name){
        Iterator<ToDo> it = currentToDos.iterator();
        while(it.hasNext()){
            ToDo temp = it.next();
            if(temp.getNameOfList().compareTo(temp.getNameOfList())==0)
                return temp;
        }
        return null;
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
