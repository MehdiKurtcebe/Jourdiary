import java.util.Date;
import java.util.PriorityQueue;

public class ToDo {
	private PriorityQueue<Task> tasks;

	private Date deadline;

	private String nameOfList;

	public ToDo(Date deadline) {
		this.deadline = deadline;
		this.tasks = new PriorityQueue<>();
	}

	public ToDo(Date deadline, String name) {
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

	public Date getDeadline() {
		return deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

	public void addTask(Task task){
		tasks.add(task);
	}

	public String getNameOfList(){
		return nameOfList;
	}

	public void setNameOfList(String name){
		nameOfList = name;
	}
}
