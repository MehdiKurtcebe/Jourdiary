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

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder("\n");
		s.append("Date: ");
		s.append("%s.%s.%s\n".formatted(date.getDisplayName(Calendar.DAY_OF_MONTH, Calendar.LONG, java.util.Locale.getDefault()),
										date.getDisplayName(Calendar.MONTH, Calendar.SHORT, java.util.Locale.getDefault()),
										date.getDisplayName(Calendar.YEAR, Calendar.LONG, java.util.Locale.getDefault())));
		s.append("Menu of the day: %s\n".formatted(menuOfTheDay));
		s.append("Exercise of the day: %s\n".formatted(exerciseOfTheDay));
		s.append("Notes: \n");
		for (String entry : dailyEntries) {
			s.append("- %s\n".formatted(entry));
		}
		return s.toString();
	}
}
