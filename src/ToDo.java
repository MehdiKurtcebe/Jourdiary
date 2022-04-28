import java.util.Date;
import java.util.PriorityQueue;

public class ToDo {
	private PriorityQueue<Task> tasks;

	private Date deadline;

	public ToDo(Date deadline) {
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

	public Date getDeadline() {
		return deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}
}
