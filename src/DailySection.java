import java.util.ArrayList;

public class DailySection {
	private final Date date;

	private ArrayList<String> dailyEntries;

	private final String menuOfTheDay;

	private final String exerciseOfTheDay;

	public DailySection(Date date, String menuOfTheDay, String exerciseOfTheDay) {
		this.date = date;
		this.menuOfTheDay = menuOfTheDay;
		this.exerciseOfTheDay = exerciseOfTheDay;
		dailyEntries = new ArrayList<>();
	}

	public Date getDate() {
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
