import java.util.ArrayList;
import java.util.Date;

public class DailySection {
	private final Date date;

	private ArrayList<String> dailyEntries;

	private final FoodMenu menuOfTheDay;

	private final String exerciseOfTheDay;

	public DailySection(Date date, FoodMenu menuOfTheDay, String exerciseOfTheDay) {
		this.date = date;
		this.menuOfTheDay = menuOfTheDay;
		this.exerciseOfTheDay = exerciseOfTheDay;
		dailyEntries = new ArrayList<>();
	}

	public Date getDate() {
		return date;
	}

	public FoodMenu getMenuOfTheDay() {
		return menuOfTheDay;
	}

	public String getExerciseOfTheDay() {
		return exerciseOfTheDay;
	}

	public ArrayList<String> getDailyEntries() {
		return dailyEntries;
	}

	public void setDailyEntries(ArrayList<String> dailyEntries) {
		this.dailyEntries = dailyEntries;
	}
}
