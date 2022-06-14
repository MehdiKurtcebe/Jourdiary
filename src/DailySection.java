import java.util.ArrayList;
import java.util.Calendar;

public class DailySection {
	private final Calendar date;

	private ArrayList<String> dailyEntries;

	private final String menuOfTheDay;

	private final String exerciseOfTheDay;

	public DailySection(Calendar date, String menuOfTheDay, String exerciseOfTheDay) {
		this.date = date;
		this.menuOfTheDay = menuOfTheDay;
		this.exerciseOfTheDay = exerciseOfTheDay;
		dailyEntries = new ArrayList<>();
	}

	public Calendar getDate() {
		return date;
	}

	public String getMenuOfTheDay() {
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
