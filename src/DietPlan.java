import java.util.LinkedList;
import java.util.Queue;

public class DietPlan {
	private Queue<Food> dailyMenus;

	public DietPlan() {
		dailyMenus = new LinkedList<>();
	}

	public Queue<Food> getDailyMenus() {
		return dailyMenus;
	}

	public void setDailyMenus(Queue<Food> dailyMenus) {
		this.dailyMenus = dailyMenus;
	}
}
