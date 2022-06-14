import java.time.LocalDate;
import java.util.PriorityQueue;

public class ToDo {
	private PriorityQueue<Task> tasks;

	private LocalDate deadline;

	private String nameOfList;

	public ToDo(LocalDate deadline) {
		this.deadline = deadline;
		this.tasks = new PriorityQueue<>();
		this.nameOfList = "unknown_NAME";
	}

	public ToDo(LocalDate deadline, String name) {
		nameOfList = name;
		this.deadline = deadline;
		this.tasks = new PriorityQueue<>();
	}

	public ToDo() {
		this.tasks = new PriorityQueue<>();
		this.deadline = null;
	}

	public PriorityQueue<Task> getTasks() {
		return tasks;
	}

	public void setTasks(PriorityQueue<Task> tasks) {
		this.tasks = tasks;
	}

	public LocalDate getDeadline() {
		return deadline;
	}

	public void setDeadline(LocalDate deadline) {
		this.deadline = deadline;
	}

	public void addTask(Task task){
		tasks.add(task);
	}

	public String getNameOfList() {
		return nameOfList;
	}

	public void setNameOfList(String name) {
		nameOfList = name;
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("\nToDo: ");
		s.append(nameOfList);
		s.append("\nDeadline: ");
		s.append(deadline);
		s.append("\nTasks: \n");
		for (Task t : tasks) {
			s.append("    - ");
			s.append(t);
			s.append("\n");
		}
		return s.toString();
	}
}
