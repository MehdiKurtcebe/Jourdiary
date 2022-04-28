import java.util.LinkedList;
import java.util.Queue;

public class DietPlan {
	private Queue<FoodMenu> dailyMenus;

	public DietPlan() {
		dailyMenus = new LinkedList<>();
	}

	public Queue<FoodMenu> getDailyMenus() {
		return dailyMenus;
	}

	public void setDailyMenus(Queue<FoodMenu> dailyMenus) {
		this.dailyMenus = dailyMenus;
	}
}
