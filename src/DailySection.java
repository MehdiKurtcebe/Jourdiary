import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class DailySection {
	private final LocalDate date;

	private ArrayList<String> dailyEntries;

	private final String menuOfTheDay;

	private final String exerciseOfTheDay;

	public DailySection(LocalDate date, String menuOfTheDay, String exerciseOfTheDay) {
		this.date = date;
		this.menuOfTheDay = menuOfTheDay;
		this.exerciseOfTheDay = exerciseOfTheDay;
		dailyEntries = new ArrayList<>();
	}

	public LocalDate getDate() {
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
		s.append(date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		s.append("\nMenu of the day: %s\n".formatted(menuOfTheDay));
		s.append("Exercise of the day: %s\n".formatted(exerciseOfTheDay));
		s.append("Notes: \n");
		for (String entry : dailyEntries) {
			s.append("- %s\n".formatted(entry));
		}
		return s.toString();
	}
}
