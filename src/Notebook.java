import java.util.*;

public class Notebook {
        private Date date;
        private final HashMap<Date, DailySection> dailySections;
        private final HashSet<ToDo> currentToDos;
        private final HashSet<ToDo> completedToDos;

        // private Skiplist exerciseStats;
        
        private NavigableSet<Food> dietPlans;
        private GraphADT<String> exercisePlans;
        private AVLTree<Recipe> recipes;

    public Notebook() {
        dailySections = new HashMap<>();
        currentToDos = new HashSet<>();
        completedToDos = new HashSet<>();
        dietPlans = new TreeSet<>();
        
        //these part could be changed
        String[] arr = new String[10]; 
        exercisePlans = new AdjacencyListMatrix<>(3, true, arr);
    }

    public HashMap<Date, DailySection> getDailySections() {
        return dailySections;
    }

    public boolean addDailySection(Date date) {
        if (dailySections.containsKey(date)) return false;
        dailySections.put(date, new DailySection(date, "unknown", null));
        return true;
    }
    
    public HashSet<ToDo> getCurrentToDos() {
        return currentToDos;
    }

    public void addCurrentToDo(ToDo toDo) {
        this.currentToDos.add(toDo);
    }

    public HashSet<ToDo> getCompletedToDos() {
        return completedToDos;
    }

    public void addCompletedToDo(ToDo completedToDo) {
        this.completedToDos.add(completedToDo);
    }

    public NavigableSet<Food> getDietPlans() {
        return dietPlans;
    }

    public void setDietPlans(NavigableSet<Food> dietPlans) {
        this.dietPlans = dietPlans;
    }

    public GraphADT<String> getExercisePlans() {
        return exercisePlans;
    }

    public void setExercisePlans(GraphADT<String> exercisePlans) {
        this.exercisePlans = exercisePlans;
    }

    
    //-----------------------------------------------------------------------------
    
    public ToDo getToDoList(String name){
        Iterator<ToDo> it = currentToDos.iterator();
        while(it.hasNext()){
            ToDo temp = it.next();
            if(temp.getNameOfList().compareTo(temp.getNameOfList())==0)
                return temp;
        }
        return null;
    }

    public AVLTree<Recipe> getRecipes(){
        return recipes;
    }
}
