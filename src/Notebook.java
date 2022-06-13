import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NavigableMap;
import java.util.Queue;
import java.util.TreeMap;

public class Notebook {
        private Date date;
        private final HashMap<Date, DailySection> dailySections;
        private final HashSet<ToDo> currentToDos;
        private final HashSet<ToDo> completedToDos;

        // private Skiplist exerciseStats;
        
        private NavigableMap<String,Integer> dietPlans;
        // private Graph exercisePlans;

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

    public NavigableMap<String,Integer> getDietPlans() {
        return dietPlans;
    }

    public void setDietPlans(NavigableMap<String,Integer> dietPlans) {
        this.dietPlans = dietPlans;
    }

    public Graph<> getExercisePlans() {
        return exercisePlans;
    }

    public void setExercisePlans(Graph<> exercisePlans) {
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


}
