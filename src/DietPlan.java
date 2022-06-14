import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class DietPlan implements Comparable<DietPlan>{
	private NavigableSet<Food> Menu;

	public DietPlan() {
		Menu = new TreeSet<Food>();
	}

	public NavigableSet<Food> getMenu(){
		return Menu;
	}

	public void setDailyMenus(NavigableSet<Food> dailyMenus) {
		this.Menu = dailyMenus;
	}

	public void add(Food food){
		Menu.add(food);
	}

	public Iterator<Food> getIterator(){
		return Menu.iterator();
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder("\nDietPlan:\n");
		for (Food f : Menu) {
			s.append("    ");
			s.append(f.toString());
			s.append("\n");
		}
		return s.toString();
	}

	@Override
	public int compareTo(DietPlan o) {
		int totalCals = 0;
		for (Food f : Menu) {
			totalCals += f.getCalOfFood();
		}

		int oTotalCals = 0;
		for (Food f : o.Menu) {
			oTotalCals += f.getCalOfFood();
		}
		return totalCals - oTotalCals;
	}
	
}
