import java.util.LinkedList;

public class FoodMenu {
	private LinkedList<String> foods;

	public FoodMenu(LinkedList<String> foods) {
		this.foods = foods;
	}

	public LinkedList<String> getFoods() {
		return foods;
	}

	public void setFoods(LinkedList<String> foods) {
		this.foods = foods;
	}
}
